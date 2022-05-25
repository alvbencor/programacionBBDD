package com.alvarobenito.crudclientes.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	public static Connection conexionBBDD() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String servidor = "jdbc:mysql://35.214.148.35:3306/dbai6quu7avohf";
		String username = "urnblziajkzbx";
		String password = "Buxtehude2021**";
		Connection conexionBD = DriverManager.getConnection(servidor, username, password);

		return conexionBD;
	}

}
