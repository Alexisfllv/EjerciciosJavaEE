package com.edu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "mencion")
public class Mencion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name = "id_publicacion", nullable = false)
	private Publicacion publicacion; 
	
	
	@Column(name = "cuerpo", length = 50)	
	private String texto;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Publicacion getPublicacion() {
		return publicacion;
	}


	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
