package com.edu.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.edu.dao.IPersonaDAO;
import com.edu.model.Persona;


@Stateless
public class PersonaDAOImpl implements IPersonaDAO , Serializable{
	
	
	//entity manager
	@PersistenceContext(unitName = "Blogp")
	private EntityManager em;

	//
//	private EntityManagerFactory emf;
//	private EntityManager em;
	
//	@PostConstruct
//	public void init() {
//		emf = Persistence.createEntityManagerFactory("Blogp");
//		em = emf.createEntityManager();
//	}
	

	
	@Override
	public Integer registrar(Persona per) throws Exception {
		
		//
		try {
			//em.getTransaction().begin();
			em.persist(per);
			//em.getTransaction().commit();
		}catch(Exception e){
			//em.getTransaction().rollback();
		}
		
		return per.getIdPersona();
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
		
		return lista;
	}

	@Override
	public Persona listarPorId(Persona per) throws Exception {
		
		return null;
	}
	
	//
//	Persona per1 = new Persona();
//	per1.setIdPersona(1);
//	per1.setNombres("Alexis");
//	
//	lista.add(per1);
//	
//	//
//	per1 =  new Persona();
//	per1.setIdPersona(2);
//	per1.setNombres("Fawcett");
//	
//	lista.add(per1);

}
