package com.alvarobenito.crudclientes.vista;

import java.sql.SQLException;
import java.util.Scanner;

import com.alvarobenito.crudclientes.controlador.ClientesController;

public class VistaCliente {
	
	public void menuInsertaCliente() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca por favor el numero del cliente:  ");
		int numeroCliente = Integer.parseInt(sc.nextLine());
		
		System.out.println("introduzca por favor el nombre del cliente:  ");
		String nombreCliente = sc.nextLine();

		System.out.println("introduzca por favor el apellido del contacto:  ");
		String apellidoContacto = sc.nextLine();
		
		System.out.println("introduzca por favor el nobre del contacto:  ");
		String nombreContacto = sc.nextLine();
		
		System.out.println("introduzca por favor el telefono del cliente:  ");
		String telefonoCliente = sc.nextLine();
		
		System.out.println("introduzca por favor la direccion del cliente:  ");
		String direccion1 = sc.nextLine();
		
		System.out.println("introduzca por favor la direccion 2 del cliente:  ");
		String direccion2 = sc.nextLine();
		
		System.out.println("introduzca por favor la ciudaddel cliente:  ");
		String ciudad = sc.nextLine();
		
		System.out.println("introduzca por favor el estado del cliente:  ");
		String estado = sc.nextLine();
		
		System.out.println("introduzca por favor el codigo postal del cliente:  ");
		String codigoPostal = sc.nextLine();
		
		System.out.println("introduzca por favor el pais del cliente:  ");
		String pais = sc.nextLine();
		
		System.out.println("introduzca por favor el id de representante:  ");
		int representante = 0;
		
		try {
			representante = Integer.parseInt(sc.nextLine());
				
		}catch (NumberFormatException e){
			   System.out.println("No se ha introducido n�mero de representante de ventas");
			                            
		}
		
		System.out.println("Introduzca por favor cr�dito(n�mero con decimales:");

		Double credito = 0.0;
			                              
		
		try {
		    credito = Double.parseDouble(sc.nextLine());
		    
		} catch(NumberFormatException e){
			
		   System.out.println("No se ha introducido cr�dito");
		}
		
		
		ClientesController controladorClientes = new ClientesController();
		
		int resultado = controladorClientes.insertarCliente(numeroCliente,
		                                    nombreCliente,
		                                    apellidoContacto,
		                                    nombreContacto,
		                                    telefonoCliente,
		                                    direccion1,
		                                    direccion2,
		                                    ciudad,
		                                    estado,
		                                    codigoPostal,
		                                    pais,
		                                    representante,
		                                    credito);
		if (resultado == 1) {
		    System.out.println("se ha introducido el registro con �xito");
		}else{
		    System.out.println("Se ha producido un error al introducir el registro");
		}
		
		
		
		
		
		
		
	}
	
public void menuActualizaCliente() throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca por favor el numero del cliente:  ");
		int numeroCliente = Integer.parseInt(sc.nextLine());
		
		System.out.println("introduzca por favor el nombre del cliente:  ");
		String nombreCliente = sc.nextLine();

		System.out.println("introduzca por favor el apellido del contacto:  ");
		String apellidoContacto = sc.nextLine();
		
		System.out.println("introduzca por favor el nobre del contacto:  ");
		String nombreContacto = sc.nextLine();
		
		System.out.println("introduzca por favor el telefono del cliente:  ");
		String telefonoCliente = sc.nextLine();
		
		System.out.println("introduzca por favor la direccion del cliente:  ");
		String direccion1 = sc.nextLine();
		
		System.out.println("introduzca por favor la direccion 2 del cliente:  ");
		String direccion2 = sc.nextLine();
		
		System.out.println("introduzca por favor la ciudaddel cliente:  ");
		String ciudad = sc.nextLine();
		
		System.out.println("introduzca por favor el estado del cliente:  ");
		String estado = sc.nextLine();
		
		System.out.println("introduzca por favor el codigo postal del cliente:  ");
		String codigoPostal = sc.nextLine();
		
		System.out.println("introduzca por favor el pais del cliente:  ");
		String pais = sc.nextLine();
		
		System.out.println("introduzca por favor el id de representante:  ");
		int representante = 0;
		
		try {
			representante = Integer.parseInt(sc.nextLine());
				
		}catch (NumberFormatException e){
			   System.out.println("No se ha introducido n�mero de representante de ventas");
			                            
		}
		
		System.out.println("Introduzca por favor cr�dito(n�mero con decimales:");

		Double credito = 0.0;
			                              
		
		try {
		    credito = Double.parseDouble(sc.nextLine());
		    
		} catch(NumberFormatException e){
			
		   System.out.println("No se ha introducido cr�dito");
		}
		
		
		ClientesController controladorClientes = new ClientesController();
		
		int resultado = controladorClientes.insertarCliente(numeroCliente,
		                                    nombreCliente,
		                                    apellidoContacto,
		                                    nombreContacto,
		                                    telefonoCliente,
		                                    direccion1,
		                                    direccion2,
		                                    ciudad,
		                                    estado,
		                                    codigoPostal,
		                                    pais,
		                                    representante,
		                                    credito);
		if (resultado == 1) {
		    System.out.println("se ha introducido el registro con �xito");
		}else{
		    System.out.println("Se ha producido un error al introducir el registro");
		}
		
		
		
		
		
		
		
	}
	
	

}
