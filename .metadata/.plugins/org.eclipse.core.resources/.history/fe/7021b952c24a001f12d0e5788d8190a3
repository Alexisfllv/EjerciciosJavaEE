package com.edu.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.edu.dao.IPersonaDAO;
import com.edu.model.Persona;


@Named
public class PersonaDAOImpl implements IPersonaDAO , Serializable{

	@Override
	public Integer registrar(Persona per) throws Exception {
		System.out.println(per.getNombres());
		return 1;
	}

	@Override
	public Integer modificar(Persona per) throws Exception {
		
		return null;
	}

	@Override
	public Integer eliminar(Persona per) throws Exception {
		
		return null;
	}

	@Override
	public List<Persona> listar() throws Exception {
		List<Persona> lista =  new ArrayList<Persona>();
		
		Persona per1 = new Persona();
		per1.setIdPersona(1);
		per1.setNombres("Alexis");
		
		lista.add(per1);
		
		//
		per1 =  new Persona();
		per1.setIdPersona(2);
		per1.setNombres("Fawcett");
		
		lista.add(per1);
		return lista;
	}

	@Override
	public Persona listarPorId(Persona per) throws Exception {
		
		return null;
	}

}
