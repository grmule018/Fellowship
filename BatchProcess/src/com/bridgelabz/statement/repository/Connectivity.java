/******************************************************************************

 *  Purpose: Program to connect jdbc driver 
 *  @author Ganesh Mule.
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.statement.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectivity {
	static String url = "jdbc:mysql://localhost:3306/Student";//?verifyServerCertificate=false&useSSL=true";
						//"jdbc:mysql://localhost:3306/Student", "root", "password"
	static String uname = "root";
	static String pass = "password";
	static Connection con=null;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

}
