package com.edu.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Named;

import com.edu.dao.IPersonaDAO;
import com.edu.model.Persona;
import com.edu.service.IPersonaService;

@Named
public class PersonaServiceImpl implements IPersonaService{

	
	
	//INSTANCIA
	@EJB   //@Inject
	private IPersonaDAO dao;
	
	
	//llamada desde un metodo de objeto
//	public PersonaServiceImpl() {
//		dao =  new PersonaDAOImpl();
//	}
	
	@Override
	public Integer registrar(Persona per) throws Exception {
		return dao.registrar(per);
	}

	@Override
	public Integer modificar(Persona per) throws Exception {
		return dao.modificar(per);
	}

	@Override
	public Integer eliminar(Persona per) throws Exception {
		return dao.eliminar(per);
	}

	@Override
	public List<Persona> listar() throws Exception {
		return dao.listar();
	}

	@Override
	public Persona listarPorId(Persona per) throws Exception {
		return dao.listarPorId(per);
	}

}
