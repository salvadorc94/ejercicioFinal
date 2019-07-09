<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>
<form:form  action="${pageContext.request.contextPath}/save" method="POST" modelAttribute="contribuyente">
		<label>Seleccionar importancia: </label>
		<select name="escoger">
              <c:forEach var="item" items="${list}">
                <option value="${item.c_importancia}">
                  ${item.s_importancia}
                </option>
              </c:forEach>
            </select><br>
            
        <label>Ingresa nombre:</label><br>
		<form:input type="text" path="s_nombre" size="30"/><br>
		<form:errors path="s_nombre" cssStyle="color: #ff0000;"/><br>
		
		<label>Ingresa apellido:</label><br>
		<form:input type="text" path="s_apellido" size="30"/><br>
		<form:errors path="s_apellido" cssStyle="color: #ff0000;"/><br>
		
		<label>Ingresa NIT:</label><br>
		<form:input type="text" path="s_nit" size="14"/><br>
		<form:errors path="s_nit" cssStyle="color: #ff0000;"/><br>
		
		<input type="submit" value="Guardar">
		<input type="button" value="Ver contribuyentes" onclick="location.href='${pageContext.request.contextPath}/ver'"><br>
	</form:form>
</body>
</html>