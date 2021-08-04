package br.com.model;


	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConnectionFactory {

	public static Connection getConnection() {
			
			String url = "jdbc:mysql://127.0.0.1:3306/dbestados";
			String user = "root";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection(url, user, null);
			}catch (Exception error){
				
			throw new RuntimeException("Erro na conexão" + error);
			
		}
	}
		
	}
	

