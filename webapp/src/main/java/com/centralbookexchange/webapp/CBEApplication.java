package com.centralbookexchange.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class CBEApplication {

	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/cbe?user=admin&password=avocadoorchard123";

	public static void main(String[] args) throws SQLException {

		try {
			System.out.println("**************Trying to connect to the database...");

			Connection conn = DriverManager.getConnection((DB_URL));
			PreparedStatement ps = conn.prepareStatement(
				"SELECT * FROM person"
			);


			conn.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		}

		SpringApplication.run(CBEApplication.class, args);
	}

}
