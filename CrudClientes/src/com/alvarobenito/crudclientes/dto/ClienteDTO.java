package com.alvarobenito.crudclientes.dto;

public class ClienteDTO {
	
	@Override
	public String toString() {
		return "ClienteDTO [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	private String nombre;
	private String telefono;
	
	public ClienteDTO(String nombre, String telefono) {
		
		super();
		this.nombre =  nombre;
		this.telefono = telefono;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
