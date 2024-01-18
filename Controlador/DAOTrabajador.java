package Controlador;

import Conexion.BDConnection;
import Entidad.Trabajador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class DAOTrabajador {

    private String url;
    private String user;
    private String password;

    private Connection conexion;

    public DAOTrabajador(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public DAOTrabajador() {
        BDConnection bdConnection = new BDConnection();
        this.conexion = bdConnection.getConexion();
    }

    public DefaultTableModel obtenerTrabajadores() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Matricula");

        if (conexion != null) {
            String sql = "SELECT * FROM Trabajadores";

            try (PreparedStatement statement = conexion.prepareStatement(sql);
                    ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    String dni = resultSet.getString("dni");
                    String nombre = resultSet.getString("nombre");
                    String apellidos = resultSet.getString("apellidos");
                    double sueldo = resultSet.getDouble("sueldo");
                    String fecha = resultSet.getString("fecha");
                    String matricula = resultSet.getString("matricula");

                    modelo.addRow(new Object[] { dni, nombre, apellidos, sueldo, fecha, matricula });
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("La conexión a la base de datos es nula.");
        }

        return modelo;
    }

    public Trabajador obtenerTrabajadorPorDNI(String dni) {
        String sql = "SELECT * FROM Trabajadores WHERE dni=?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, dni);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Crear y devolver un objeto Trabajador con los datos de la fila
                    return new Trabajador(
                            resultSet.getString("dni"),
                            resultSet.getString("nombre"),
                            resultSet.getString("apellidos"),
                            resultSet.getDouble("sueldo"),
                            resultSet.getString("fecha"),
                            resultSet.getString("matricula"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Retornar null si no se encuentra el trabajador
        return null;
    }

    public void actualizarTrabajador(String dni, String nombre, String apellidos, double sueldo, String fecha,
            String matricula) {
        String sql = "UPDATE Trabajadores SET nombre=?, apellidos=?, sueldo=?, fecha=?, matricula=? WHERE dni=?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setString(2, apellidos);
            statement.setDouble(3, sueldo);
            statement.setString(4, fecha);
            statement.setString(5, matricula);
            statement.setString(6, dni);

            // Ejecutar la actualización
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean eliminarTrabajador(String dni) {
        String sql = "DELETE FROM Trabajadores WHERE dni = ?";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, dni);

            int filasAfectadas = statement.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertarTrabajador(String dni, String nombre, String apellidos, double sueldo, String fecha,
            String matricula) {
        String sql = "INSERT INTO Trabajadores (dni, nombre, apellidos, sueldo, fecha, matricula) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, dni);
            statement.setString(2, nombre);
            statement.setString(3, apellidos);
            statement.setDouble(4, sueldo);

            // Convertir el String de fecha al formato de java.sql.Date
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date parsedDate = dateFormat.parse(fecha);
            Date sqlDate = new Date(parsedDate.getTime());

            statement.setDate(5, sqlDate);
            statement.setString(6, matricula);

            // Ejecutar la consulta de inserción
            int filasAfectadas = statement.executeUpdate();

            // Si se insertó correctamente, se devuelve true; de lo contrario, false
            return filasAfectadas > 0;
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Trabajador> obtenerPrimerosNTrabajadores(int n) {
        List<Trabajador> trabajadores = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = BDConnection.getConexion();

            String query = "SELECT * FROM trabajadores LIMIT ?";
            statement = connection.prepareStatement(query);
            statement.setInt(1, n);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Trabajador trabajador = new Trabajador();
                trabajador.setDni(resultSet.getString("dni"));
                trabajador.setNombre(resultSet.getString("nombre"));
                trabajador.setApellidos(resultSet.getString("apellidos"));
                trabajador.setSueldos(resultSet.getDouble("sueldo"));
                trabajador.setFecha(resultSet.getString("fecha"));
                trabajador.setMatricula(resultSet.getString("matricula"));

                trabajadores.add(trabajador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return trabajadores;
    }

    // Modifica este método para que devuelva una lista de trabajadores
    public List<Trabajador> obtenerTrabajadoresList() {
        List<Trabajador> trabajadores = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = BDConnection.getConexion();
            String query = "SELECT * FROM trabajadores";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Trabajador trabajador = new Trabajador();
                trabajador.setDni(resultSet.getString("dni"));
                trabajador.setNombre(resultSet.getString("nombre"));
                trabajador.setApellidos(resultSet.getString("apellidos"));
                trabajador.setSueldos(resultSet.getDouble("sueldo"));
                trabajador.setFecha(resultSet.getString("fecha"));
                trabajador.setMatricula(resultSet.getString("matricula"));

                trabajadores.add(trabajador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trabajadores;
    }

    public List<Trabajador> filtrarTrabajadoresConConsulta(String consulta) {
        List<Trabajador> trabajadores = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = BDConnection.getConexion();

            statement = connection.prepareStatement(consulta);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Trabajador trabajador = new Trabajador();
                trabajador.setDni(resultSet.getString("dni"));
                trabajador.setNombre(resultSet.getString("nombre"));
                trabajador.setApellidos(resultSet.getString("apellidos"));
                trabajador.setSueldos(resultSet.getDouble("sueldo"));
                trabajador.setFecha(resultSet.getString("fecha"));
                trabajador.setMatricula(resultSet.getString("matricula"));

                trabajadores.add(trabajador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return trabajadores;
    }

    public List<Trabajador> obtenerTrabajadoresFiltrados(DefaultTableModel model) {
        List<Trabajador> trabajadoresFiltrados = new ArrayList<>();

        // Recorrer las filas de la tabla y obtener los trabajadores filtrados
        for (int i = 0; i < model.getRowCount(); i++) {
            Trabajador trabajador = new Trabajador();

            // Asumiendo que el constructor de Trabajador acepta los valores necesarios
            trabajador.setDni((String) model.getValueAt(i, 0));
            trabajador.setNombre((String) model.getValueAt(i, 1));
            trabajador.setApellidos((String) model.getValueAt(i, 2));
            trabajador.setSueldos((double) model.getValueAt(i, 3));
            trabajador.setFecha((String) model.getValueAt(i, 4));
            trabajador.setMatricula((String) model.getValueAt(i, 5));

            trabajadoresFiltrados.add(trabajador);
        }

        return trabajadoresFiltrados;
    }

}