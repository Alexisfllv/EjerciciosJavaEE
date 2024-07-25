package com.edu.controller;

import java.io.IOException;

import com.edu.dao.IPersonaDAO;
import com.edu.dao.PersonaDAOimpl;
import com.edu.model.Persona;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PersonaController")
public class PersonaController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IPersonaDAO dao = new PersonaDAOimpl();
		
		String redireccion = "";		
		String accion = req.getParameter("accion");
		
		if(accion.equalsIgnoreCase("ELIMINAR")) {
			redireccion = "/listaPersona.jsp";
			int id = Integer.parseInt(req.getParameter("id"));
			dao.eliminar(id);
			req.setAttribute("personas", dao.listarTodos());
		}else if (accion.equalsIgnoreCase("EDITAR")) {
			redireccion = "/persona.jsp";
			int id = Integer.parseInt(req.getParameter("id"));
			Persona persona = dao.listarPorId(id);
			req.setAttribute("persona", persona);
		}else if (accion.equalsIgnoreCase("INSERTAR")) {
			redireccion = "/persona.jsp";
		}else {
			redireccion = "/listaPersona.jsp";
			req.setAttribute("personas", dao.listarTodos());
		}
		RequestDispatcher vista = req.getRequestDispatcher(redireccion);
		vista.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IPersonaDAO dao = new PersonaDAOimpl();
		
		Persona persona = new Persona();
		persona.setNombres(req.getParameter("nombres"));
		persona.setApellidos(req.getParameter("apellidos"));
		
		String id = req.getParameter("id");
		
		if(id == null || id.isEmpty()) {
			dao.agregar(persona);
		}else {
			persona.setId(Integer.parseInt(id));
			dao.actualizar(persona);
		}
		
		RequestDispatcher vista = req.getRequestDispatcher("/listaPersona.jsp");
		req.setAttribute("personas", dao.listarTodos());
		vista.forward(req, resp);
	}

	
}