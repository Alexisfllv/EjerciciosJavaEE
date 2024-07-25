package com.edu;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;




@Named
@RequestScoped
public class Persona implements Serializable{

	
	private String nombre;
	private String saludo;
	
	public void aceptar() {
		this.saludo = "Hola " + this.nombre;
	}
	
	/**
	 * getters & setters
	 * 
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
