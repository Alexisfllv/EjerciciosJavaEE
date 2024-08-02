package com.edu.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "publicador_seguidor")
public class PublicadorSeguidor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@ManyToOne
	@JoinColumn(name = "id_publicador", nullable = false)
	private Persona publicador;
	
	@ManyToOne
	@JoinColumn(name = "id_publicador", nullable = false)
	private Persona seguidor;
	
	@Column (name = "fecha" , nullable = false)
	private LocalDateTime fecha;

	
	//
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona getPublicador() {
		return publicador;
	}

	public void setPublicador(Persona publicador) {
		this.publicador = publicador;
	}

	public Persona getSeguidor() {
		return seguidor;
	}

	public void setSeguidor(Persona seguidor) {
		this.seguidor = seguidor;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	

}
