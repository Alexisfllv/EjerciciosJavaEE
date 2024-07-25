<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de personas</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiSIFeKIdGmRAkycuHAHRg320mUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <div class="table-responsive">
        <table class="table">
            <thead>
                <tr class="info">
                    <th>ID</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th colspan="2">Acción</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${personas}" var="persona">
                    <tr class="active">
                        <td><c:out value="${persona.id}"/></td>
                        <td><c:out value="${persona.nombres}"/></td>
                        <td><c:out value="${persona.apellidos}"/></td>
                        <td><a href="PersonaController?accion=editar&id=<c:out value="${persona.id}"/>">Actualizar</a></td>
                        <td><a href="PersonaController?accion=eliminar&id=<c:out value="${persona.id}"/>">Eliminar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
