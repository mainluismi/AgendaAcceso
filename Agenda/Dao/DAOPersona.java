package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Conexion.DBConnection;
import Entidades.Persona;

public class DAOPersona {

    /*
     * Gestor que se encarga de la tabla "persona"
     * Usará la clase Persona para generar los objetos guardados en las tuplas
     */

    public DAOPersona() {

    }

    // método para que el DAO sepa añadir una persona nueva a la tabla
    public void add(Persona persona) {
        // pedir la conexi�n
        Connection conexion = new DBConnection().getConexion();

        try {
            // //preparar una plataforma para poder lanzar ordenes SQL
            // Statement plataforma = conexion.createStatement();
            //
            // //Ejecutar un INSERT
            // String sql = "INSERT INTO personas VALUES('" + persona.getDni() + "', '"
            // +persona.getNombre()+"', "+persona.getTelefono()+")";
            // plataforma.executeUpdate(sql);
            //
            // //cerrar la conexi�n
            // conexion.close();

            // otra forma de generar la sentencia SQL
            String sql = "INSERT INTO persona VALUES(?,?,?)";
            // Uso una plataforma "Preparada"
            PreparedStatement plataforma = conexion.prepareStatement(sql);
            // rellenar las interrogaciones
            plataforma.setString(1, persona.getDni());
            plataforma.setString(2, persona.getNombre());
            plataforma.setLong(3, persona.getTelefono());
            plataforma.executeUpdate();

            // cerrar la conexi�n
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error insertando Persona");
            e.printStackTrace();
        }

    }

    // m�todo para borrar una persona
    public void delete(Persona persona) {
        // pedir la conexi�n
        Connection conexion = new DBConnection().getConexion();

        try {
            String sql = "DELETE FROM persona WHERE dni = ?";
            // Uso una plataforma "Preparada"
            PreparedStatement plataforma = conexion.prepareStatement(sql);
            // rellenar las interrogaciones
            plataforma.setString(1, persona.getDni());
            plataforma.executeUpdate();

            // cerrar la conexi�n
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error borrando Persona");
            e.printStackTrace();
        }

    }

    // m�todo para actualizar los datos de una persona
    public void update(Persona persona) {
        // pedir la conexi�n
        Connection conexion = new DBConnection().getConexion();

        try {
            String sql = "UPDATE persona SET nombre = ? , telefono = ? WHERE dni = ?";
            // Uso una plataforma "Preparada"
            PreparedStatement plataforma = conexion.prepareStatement(sql);
            // rellenar las interrogaciones
            plataforma.setString(3, persona.getDni());
            plataforma.setString(1, persona.getNombre());
            plataforma.setLong(2, persona.getTelefono());
            plataforma.executeUpdate();

            // cerrar la conexi�n
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error actualizando Persona");
            e.printStackTrace();
        }
    }

    // m�todo para obtener todas las personas de la tabla
    public ArrayList<Persona> get() {
        // Preparo un arraylist para el resultado
        ArrayList<Persona> lista = new ArrayList<Persona>();
        // pedir la conexi�n
        Connection conexion = new DBConnection().getConexion();

        try {
            // Lanzar un SELECT
            String sql = "SELECT * FROM persona";
            // Uso una plataforma "Preparada"
            PreparedStatement plataforma = conexion.prepareStatement(sql);
            ResultSet resultado = plataforma.executeQuery();

            while (resultado.next()) { // cuando se acaben las tuplas, next() retorna false
                // tratamiento de cada tupla
                lista.add(new Persona(resultado.getString("dni"), resultado.getString("nombre"),
                        resultado.getLong("telefono")));
                // lista.add(new Persona(resultado.getString(1), resultado.getString(2),
                // resultado.getLong(3)));

            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error obteniendo personas");
            e.printStackTrace();
        }
        return lista;
    }

    // m�todo para obtener una persona concreta de la tabla, dando su dni
    public Persona get(String dni) {
        // Preparo una variable para guardar el objeto que busco
        Persona p = null;
        // pedir la conexi�n
        Connection conexion = new DBConnection().getConexion();

        try {
            // Lanzar un SELECT
            String sql = "SELECT * FROM persona WHERE dni=?";
            // Uso una plataforma "Preparada"
            PreparedStatement plataforma = conexion.prepareStatement(sql);
            plataforma.setString(1, dni); // rellenamos el dni en la ?
            ResultSet resultado = plataforma.executeQuery();

            if (resultado.next()) { // si ha venido una tupla, la trabajamos
                // tratamiento de la tupla
                p = new Persona(resultado.getString("dni"), resultado.getString("nombre"),
                        resultado.getLong("telefono"));
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error obteniendo personas");
            e.printStackTrace();
        }
        return p;
    }

}
