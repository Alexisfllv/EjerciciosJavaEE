package com.edu.service;

import java.util.List;

import com.edu.model.Persona;

public interface IPersonaService {

	// definir metodos

	Integer registrar(Persona per) throws Exception;

	Integer modificar(Persona per) throws Exception;

	Integer eliminar(Persona per) throws Exception;

	List<Persona> listar() throws Exception;

	Persona listarPorId(Persona per) throws Exception;

}
