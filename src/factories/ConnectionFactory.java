package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		
		final String URL = "jdbc:postgresql://localhost:5433/dbalunos";
		final String user = "admin";
		final String password = "admin";
		
		
		try {
			return DriverManager.getConnection(URL, user, password);
		} catch (Exception e) {
			System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
			return null;
		}
		
	}

}
