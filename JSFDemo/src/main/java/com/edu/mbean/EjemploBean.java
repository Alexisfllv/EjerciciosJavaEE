package com.edu.mbean;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class EjemploBean implements Serializable{
	
	//conexiones a bases de datos , transformacion de datos
	private String nombre;
	private String saludo;
	
	//metodos
	public void aceptar() {
		this.saludo = "HI - " + this.nombre;
	}
	
	
	//gttssStts

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
