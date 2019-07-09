<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contribuyentes</title>
</head>
<body>
<table>
    		<thead>
      			<tr>
        			<th>Nombre</th>
        			<th>Apellido</th>
        			<th>NIT</th>
        			<th>Importancia</th>	
        			<th>Fecha de Ingreso</th>
        		</tr>
    		</thead>
    	<tbody>
        		<c:forEach items="${contribuyentes}" var="cont">
        			<tr>
        			<td>${cont.s_nombre}</td>
        			<td>${cont.s_apellido}</td>
        			<td>${cont.s_nit}</td>
        			<td>${cont.importancia.s_importancia}</td>
        			<td>${cont.delegateFecha}</td>
        			</tr>
        		</c:forEach>
    	</tbody>
  		</table>

</body>
</html>