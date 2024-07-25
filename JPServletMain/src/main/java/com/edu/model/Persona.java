package com.edu.model;


//JDBC
public class Persona {

	
	private int id;
	private String nombres;
	private String apellidos;
	private String nombreCompleto;
	
	public String getNombreCompleto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nombres).append(" ,").append(this.apellidos);
		return sb.toString();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	

	
	
	
	
}
