<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tienda Online</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
</head>
<body>
	<!-- 
	<sql:query var="rs" dataSource="jdbc/spring">
	select nombre, apaterno from usuario
	</sql:query>
	 -->
	<p>
		<a href="${pageContext.request.contextPath}/usuarios">Mostrar
			usuarios</a>
	</p>
	<p>
		<a href="${pageContext.request.contextPath}/crearUsuario">Registrar Usuario</a>
	</p>

</body>
</html>