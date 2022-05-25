package com.alvarobenito.crudclientes.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alvarobenito.crudclientes.dto.ClienteDTO;
import com.alvarobenito.crudclientes.utils.DBUtils;

public class Main {
	
	public static void main (String[]args) throws ClassNotFoundException, SQLException {
		
		Connection conexionBD = DBUtils.conexionBBDD();
		
		Statement statement = conexionBD.createStatement();
		ResultSet clientes = statement.executeQuery("SELECT * FROM customers ");
		
		
		List<ClienteDTO> listaClientes = new ArrayList<>();
		
		while (clientes.next()) {
			ClienteDTO c = new ClienteDTO(clientes.getString("customerName"), clientes.getString("phone"));
			listaClientes.add(c);
		}
		
		for (int i = 0; i<listaClientes.size();i++) {
			System.out.println(listaClientes.get(i));
		}
		
	}

}
