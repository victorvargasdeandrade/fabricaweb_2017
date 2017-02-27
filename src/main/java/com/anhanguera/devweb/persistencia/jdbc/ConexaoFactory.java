package com.anhanguera.devweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/schema_fabricaweb?useTimezone=true&serverTimezone=UTC", "root", "root");
		} catch (SQLException e) {
			// relançando a exception
			throw new RuntimeException(e);			
		}
	}

}
