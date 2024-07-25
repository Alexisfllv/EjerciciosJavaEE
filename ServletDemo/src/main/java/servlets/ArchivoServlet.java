package servlets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/archivo")
public class ArchivoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//adicional hedear
        //

		//imagenes
		//resp.setContentType("image/jpg");
        //resp.setHeader("Content-Disposition", "inline; filename=\"imagen.jpg\"");
		//resp.setHeader("Content-Disposition", "attachment; filename='imagen.jgp'");
		
		
		//pdf
		
		resp.setContentType("application/pdf");	
		resp.setHeader("Content-Disposition", "attachment; filename='strem.pdf'");
		
		ServletOutputStream out = resp.getOutputStream();
		
		String ruta = "/resources/pdf/strem.pdf";
		
		InputStream in =  getServletContext().getResourceAsStream(ruta);
		
		//archivos
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout =  new BufferedOutputStream(out);
		
		int ch = 0;
		
		while((ch = bin.read()) != -1) {
			bout.write(ch);
		}
		
		//
		bin.close();
		in.close();
		bout.close();
		out.close();
		
	}
	

}
