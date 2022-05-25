package com.alvarobenito.crudclientes.controlador;

import java.sql.SQLException;

import com.alvarobenito.crudclientes.modelo.ClientesModelo;

public class ClientesController {
	
	public Integer insertarCliente(int numerocliente,String nombreCliente,String apellidoContacto,String nombreContacto, String telefono, String direccion1,  String direccion2,String ciudad,String estado, String codigoPostal, String pais, int representante, Double credito) throws ClassNotFoundException,SQLException {
	    ClientesModelo cm = new ClientesModelo();
	    return cm.insertarCliente(numerocliente,nombreCliente,apellidoContacto,nombreContacto,telefono,direccion1,direccion2,
	                                ciudad,estado,codigoPostal,pais,representante,credito);
	}
	
	

}
