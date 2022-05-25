package com.alvarobenito.crudclientes.modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alvarobenito.crudclientes.dto.ClienteDTO;
import com.alvarobenito.crudclientes.utils.DBUtils;

public class ClientesModelo {

	public Integer insertarCliente(int numeroCliente, String nombreCliente, String apellidoContacto,
			String nombreContacto, String telefono, String direccion1, String direccion2, String ciudad, String estado,
			String codigoPostal, String pais, int representante, Double credito)
			throws SQLException, ClassNotFoundException {

		String sql = "UPDATE customers SET customerName = CASE WHEN ? = '' THEN customerName ELSE ? END,"
				+ "contactLastName = CASE WHEN ? = '' THEN contactLastName ELSE ? END,"
				+ "contactFirstName = CASE WHEN ? = '' THEN contactFirstName ELSE ? END,"
				+ "phone = CASE WHEN ? = '' THEN phone ELSE ? END,"
				+ "addressLine1 = CASE WHEN ? = '' THEN addressLine1 ELSE ? END,"
				+ "addressLine2 = CASE WHEN ? = '' THEN addressLine2 ELSE ? END,"
				+ "city = CASE WHEN ? = '' THEN city ELSE ? END," + "state = CASE WHEN ? ='' THEN state ELSE ? END"
				+ "postalCode = CASE WHEN ? = '' THEN postalCOde ELSE ? END,"
				+ "country = CASE WHEN ? = '' THEN country ELSE ? END,"
				+ "salesRepEmployeeNumber = CASE WHEN ? = '' THEN salesRepEmployeeNumber ELSE ? END"
				+ "creditLimit = CASE WHEN ? = '' THEN salesRepEmployeeNumber ELSE ? END," + "WHERE customerNumber = 1";

		Connection connection = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = connection.prepareStatement(sql);

		ps.setInt(1, numeroCliente);
		ps.setInt(2, numeroCliente);

		ps.setString(3, nombreCliente);
		ps.setString(4, nombreCliente);

		ps.setString(5, apellidoContacto);
		ps.setString(6, apellidoContacto);

		ps.setString(7, nombreContacto);
		ps.setString(8, nombreContacto);

		ps.setString(9, telefono);
		ps.setString(10, telefono);

		ps.setString(11, direccion1);
		ps.setString(12, direccion1);

		ps.setString(13, direccion2);
		ps.setString(14, direccion2);

		ps.setString(15, ciudad);
		ps.setString(16, ciudad);

		ps.setString(17, estado);
		ps.setString(18, estado);

		ps.setString(19, codigoPostal);
		ps.setString(20, codigoPostal);

		ps.setString(21, pais);
		ps.setString(22, pais);

		ps.setInt(23, representante);
		ps.setInt(24, representante);

		ps.setDouble(25, credito);
		ps.setDouble(26, credito);

		resultado = ps.executeUpdate();

		connection.close();

		return resultado;

	}

	public List<ClienteDTO> recuperaNombreTelefonoTodosClientes() throws ClassNotFoundException, SQLException {

		Connection conexionBD = DBUtils.conexionBBDD();
		Statement statement = statement.executeQuery("SELECT * FROM customers");

		List<ClienteDTO> listaClientes = new ArrayList<>();

		while (clientes.next()) {

			ClienteDTO c = new ClienteDTO(clientes.getString("customerName"), clientes.getString("phone"));
			listaClientes.add(c);
		}

		conexionBD.close();
		return listaClientes;

	}

	public List<ClienteDTO> recuperaNombreTelefonoFiltraPorNombre(String nombre)
			throws ClassNotFoundException, SQLException {

		String query = "SELECT FROM customers where customerName LIKE ?";

		Connection conexionBD = DBUtils.conexionBBDD();

		PreparedStatement ps = conexionBD.prepareStatement(query);
		ps.setString(1, "%" + nombre + "%");

		ResultSet clientes = ps.executeQuery();
		
		
		
	}

	public Integer borrarCliente(int customerNumber) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM customers where customerNumber=?";

		Connection connection = DBUtils.conexionBBDD();
		PreparedStatement ps = null;
		Integer resultado = null;

		ps = connection.prepareStatement(sql);
		ps.setInt(1, customerNumber);
		resultado = ps.executeUpdate();
		connection.close();
		return resultado;

	}

}
