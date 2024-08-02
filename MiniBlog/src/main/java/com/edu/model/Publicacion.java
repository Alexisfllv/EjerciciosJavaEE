package com.edu.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name =  "publicacion")
public class Publicacion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ManyToOne
	@JoinColumn(name = "id_publicador", nullable = false)
	private Persona publicador;
	
	@Column(name = "cuerpo", nullable = false , length = 250)
	private String cuerpo;
	
	
	
	//listas de tag y menciones
	
	@OneToMany(mappedBy = "publicacion" , cascade = {CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE}, fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Tag> tags;
	
	@OneToMany(mappedBy = "publicacion" , cascade = {CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE}, fetch = FetchType.LAZY,orphanRemoval = true)
	private List<Mencion> menciones;
	

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

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	//
	
}
