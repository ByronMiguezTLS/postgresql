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
		<a href="PanelCaballero">Inicio</a>
         <div class="row">
                <div class="col">
                    <form action="CreateCaballero" method="post">
                    	<p>Nombre: <input type="text" name="nombre"/></p>
                    	<p>Apellido: <input type="text" name="apellido"/></p>
                    	<p>Edad: <input type="number" name="edad"/></p>
						<input type="submit" value="Guardar" name="Guardar">
					</form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
      </body>
</html>