<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
<%
String usuario = request.getParameter("usuario");
String clave = request.getParameter("clave");

if (usuario.equalsIgnoreCase("mitocode") && clave.equalsIgnoreCase("code")) {
	out.print("Bienvenido " + usuario);
} else {
	out.print("Usuario/Clave incorrecto");
}
%>

</html>