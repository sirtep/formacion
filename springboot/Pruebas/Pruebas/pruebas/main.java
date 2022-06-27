package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;

public class main {
	public static void main(String[] args) {
		Connection connection;
		// Ponemos la URL de la BBDD a la que queremos conectarnos mediante a JDBC
		final String url = "jdbc:mysql://localhost:3306/db_test";
		// Accesos a la BBDD
		final String user = "root";
		final String pass = "admin";

		try {
			// Realizando al conexión
			connection = DriverManager.getConnection(url, user, pass);
			// Si todo ha ido OK
			System.out.println("Connection success.");
			// --> Aquí continuaremos realizando el resto del operaciones de SQL

			// Si todo ha ido OK una vez finalizado el uso de la conexión la cerraremos
			connection.close();
			// Y en este caso, confirmamos que la conexión ha sido cerrado mediante a un
			// mensaje
			System.out.println("Connection closed.");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}