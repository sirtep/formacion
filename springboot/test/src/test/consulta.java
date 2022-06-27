package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class consulta {
	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "root";
		final String pass = "admin";

		try {
			connection = DriverManager.getConnection(url, user, pass);
			// Creamos el statement
			Statement statement = connection.createStatement();
			// Es equivalente a realizar un SELECT * FROM usuarios; puesto que ya estamos situados en la BBDD
			ResultSet result = statement.executeQuery("SELECT * FROM users"); 
			// Mostrando el resultado
			ResultSetMetaData rsmd = result.getMetaData();
			int columnCount = rsmd.getColumnCount();
			// Recorriendo los nombres de los encabezados de la tabla
			for (int i = 1; i <= columnCount; i++) {
				System.out.printf("%10s", rsmd.getColumnName(i).toString()+"\t");
			}
			int spacing = ((columnCount * 16)-1);
			String textoFormateado = String.format("%n%" + spacing + "s", " ", " ").replace(' ', '-');
			System.out.println(textoFormateado);
			// Mostrando el resultado
			while (result.next()) {
				int id_usuarios = result.getInt("id");
				String nombre = result.getString("Nombre");
				String apellidos = result.getString("Apellidos");
				String fechanac = result.getString("Fecha_nacimiento");
				System.out.printf("%8d%17s%16s\t%10s\t%n", id_usuarios, nombre, apellidos, fechanac);
	
			}
			result.close(); // Cerrando resultset
			statement.close(); // Cerrando statement
			connection.close(); // Cerrando connection
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
