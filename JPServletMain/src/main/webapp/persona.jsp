<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	<form action="PersonaController" method="post">
		<div class="form-group">
			<fieldset>
				<div>
					<label for="id">Persona IDD</label> 
					<input type="text" name="id" class="form-control"
						value="<c:out value="${persona.id}" />" readonly="readonly" 
						placeholder="Persona ID" />
				</div>
				<div>
					<label for="nombres">Nombres</label> <input type="text" class="form-control"
						name="nombres" value="<c:out value="${persona.nombres}" />"
						placeholder="Nombres" />
				</div>
				<div>
					<label for="apellidos">Apellidos</label> <input type="text" class="form-control"
						name="apellidos" value="<c:out value="${persona.apellidos}" />"
						placeholder="Apellidos" />
				</div>

				<div>
					<input type="submit" class="btn-primary" value="Aceptar" />
				</div>
			</fieldset>
		</div>
	</form>
</body>
</html>