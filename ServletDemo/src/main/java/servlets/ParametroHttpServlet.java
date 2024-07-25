package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "parametro",
			description = "Este es un servlet de parametros",
			urlPatterns = {"/parameter", "/parameters"},
			initParams = {
					@WebInitParam(name="param1",value= "Mito"),
					@WebInitParam(name="param2",value="Code")
			})
public class ParametroHttpServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String var1 = req.getParameter("param1");
		String var2 = req.getParameter("param2");
		
		if(var1 == null) {
			var1 =  getInitParameter("param1");
		}
		
		if(var2 == null) {
			var2 =  getInitParameter("param2");
		}
		
		if(var1 == getInitParameter("param1")) {
			var1 =  "mio";
		}
		
		if(var2 == "Code" ) {
			var2 = "nana";
		}
		
		
		
		
		
		resp.getWriter().write("Param1 : "+ var1 + " Param2 : " + var2);
	}
	
	

}
