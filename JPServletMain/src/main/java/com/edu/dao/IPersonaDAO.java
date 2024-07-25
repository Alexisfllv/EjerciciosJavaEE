package com.edu.dao;

import java.util.List;

import com.edu.model.Persona;

public interface IPersonaDAO {

	void agregar (Persona persona);
	
	void eliminar(int personaId);
	
	void actualizar(Persona persona);
	
	List<Persona> listarTodos();
	
	Persona listarPorId(int id);
}
