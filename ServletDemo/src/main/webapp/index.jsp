<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//scriptless
		out.println("Tu direccion ip es: " + request.getRemoteAddr());
	%>
	
	<form action="principal.jsp" method="post">
		Usuario <input type="text" name="usuario">
		Clave <input type="text" name="clave"> <br/>
	<input type="submit" value="Iniciar" >
</ form>

</body>
</html>