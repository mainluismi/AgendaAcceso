package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {
	
	private Connection conexion;
	
	// Constructor de la clase
	public DBConnection() {
        try {
            // cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // preparar la URL de conexi�n
            String url = "jdbc:mysql://localhost:3306/bdTrabajadores";

            // conectar con la BBDD --> ponemos la url, el usuario y la contrasena
            conexion = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            System.out.println("Error en la carga del Driver");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error conectando a la BBDD");
            e.printStackTrace();
        }
    }
	public Connection getConexion() {
        return conexion;
    }
}
