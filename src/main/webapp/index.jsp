<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Caballeros</title>
</head>
<body>
        <table>
        <a href="CreateCaballero">Crear</a>
        <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
				<th>Edad</th>                
        </tr>
        <c:forEach items="${personas}" var="persona">
            <tr>
                <td>${persona.id}</td>  
                <td>${persona.nombre}</td>
                <td>${persona.apellido}</td>
                <td>${persona.edad}</td>
            </tr>
        </c:forEach>
        </table>

</body>
</html>