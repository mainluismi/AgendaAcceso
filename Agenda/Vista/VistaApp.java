package Vista;

import Dao.DAOPersona;
import Entidades.Persona;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaApp extends JFrame {

    private DAOPersona dao;

    private JTextField dniField;
    private JTextField nameField;
    private JTextField phoneNumberField;

    public VistaApp() {
        dao = new DAOPersona();

        setTitle("Persona App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dniField = new JTextField(10);
        nameField = new JTextField(10);
        phoneNumberField = new JTextField(10);

        JButton agregarBoton = new JButton("Agregar Persona");
        JButton eliminarBoton = new JButton("Eliminar Persona");
        JButton actualizarBoton = new JButton("Editar Persona");
        JButton verBoton = new JButton("Ver todas las Personas");

        setLayout(new GridLayout(5, 2));
        add(new JLabel("DNI:"));
        add(dniField);
        add(new JLabel("Nombre:"));
        add(nameField);
        add(new JLabel("Teléfono:"));
        add(phoneNumberField);
        add(agregarBoton);
        add(eliminarBoton);
        add(actualizarBoton);
        add(verBoton);

        agregarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addPersona();
            }
        });

        eliminarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletePersona();
            }
        });

        actualizarBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePersona();
            }
        });

        verBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAllPersonas();
            }
        });
    }

    private void addPersona() {
        String dni = dniField.getText();
        String nombre = nameField.getText();
        long numeroTelefono = Long.parseLong(phoneNumberField.getText());

        Persona persona = new Persona(dni, nombre, numeroTelefono);
        dao.add(persona);

        JOptionPane.showMessageDialog(this, "Persona agregada correctamente!");
    }

    private void deletePersona() {
        String dni = dniField.getText();
        Persona persona = dao.get(dni);

        if (persona != null) {
            dao.delete(persona);
            JOptionPane.showMessageDialog(this, "Persona eliminada correctamente!");
        } else {
            JOptionPane.showMessageDialog(this, "Persona no encontrada con DNI: " + dni);
        }
    }

    private void updatePersona() {
        String dni = dniField.getText();
        Persona personaExistente = dao.get(dni);

        if (personaExistente != null) {
            String nuevoNombre = nameField.getText();
            long nuevoTelefono = Long.parseLong(phoneNumberField.getText());

            personaExistente.setNombre(nuevoNombre);
            personaExistente.setTelefono(nuevoTelefono);

            dao.update(personaExistente);
            JOptionPane.showMessageDialog(this, "Persona actualizada!");
        } else {
            JOptionPane.showMessageDialog(this, "Persona no encontrada con DNI: " + dni);
        }
    }

    private void viewAllPersonas() {
        ArrayList<Persona> personasList = dao.get();

        // Se crea un objeto bidimensional con 3 columnas para almacenar los datos de
        // las personas en la tabla
        Object[][] auxiliar = new Object[personasList.size()][3];

        for (int i = 0; i < personasList.size(); i++) {
            Persona persona = personasList.get(i);
            auxiliar[i][0] = persona.getDni();
            auxiliar[i][1] = persona.getNombre();
            auxiliar[i][2] = persona.getTelefono();
        }

        String[] columnNames = { "DNI", "Nombre", "Teléfono" };

        DefaultTableModel tableModel = new DefaultTableModel(auxiliar, columnNames);

        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);

        JOptionPane.showMessageDialog(this, scrollPane, "Lista de todas las personas", JOptionPane.PLAIN_MESSAGE);
    }

}
