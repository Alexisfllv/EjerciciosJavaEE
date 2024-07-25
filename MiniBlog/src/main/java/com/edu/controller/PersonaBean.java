package com.edu.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.edu.model.Persona;
import com.edu.service.IPersonaService;

@Named
@RequestScoped
public class PersonaBean implements Serializable{
	
	@Inject
	private IPersonaService service;
	
	private Persona persona;
	
	//creacion de lista
	
	private List<Persona> lista;
	
	public PersonaBean() {
		this.persona = new Persona();
		//this.service =  new PersonaServiceImpl();
		//this.listar();
	}
	//luego del constructor
	
	@PostConstruct
	public void init() {
		this.listar();
	}

	
	
	//metodo
	public void registrar() {
		try {
			this.service.registrar(this.persona);
		} catch (Exception e) {
			//Excepciones 
			e.printStackTrace();
		}
	}
	
	//metodo de listar
	public void listar() {
		try {
			this.lista = this.service.listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//getters setters
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}



	public List<Persona> getLista() {
		return lista;
	}



	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	
	
	
	

}
