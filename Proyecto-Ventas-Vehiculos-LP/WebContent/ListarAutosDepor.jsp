<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de autos deportivos</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/ListarMotos.css"/>
</head>
<body>
	<%@ include file="MenuPrincipal.jsp" %>
<h1 align="center"  >Listado de autos deportivos</h1>
 <form action="">
 <table border="2" align="center"  class="data-table" class="table table-striped table-bordered">
 <tr>
 <th>ID</th>
 <th>Marca</th>
 <th>Modelo</th>
  <th>Color</th>
 <th>Cantidad</th>
  <th>Precio</th>
   <th>Fecha fabricacion</th>
     <th colspan="2">Opciones</th>
 </tr>
<c:forEach var="depor" items="${ ListadoAutosDepor}">
 <tr>
 <td align="right">
 <c:out value="${depor.idauto }"></c:out>
 </td>
 <td align="center">
 <c:out value="${depor.marca }"></c:out>
 </td>
  <td align="center">
 <c:out value="${depor.modelo }"></c:out>
 </td>
  <td>
 <c:out value="${depor.color }"></c:out>
 </td>
  <td align="center">
 <c:out value="${depor.cantidad }" ></c:out>
 </td>
   <td align="center">
 <c:out value="${depor.precio }"></c:out>
 </td>
  <td align="center">
<fmt:formatDate value="${depor.fechaFabricacion }" pattern="dd/MM/yyyy"/>
</td>
<td> <a href="#"><img src="img/deletemar.png"></img></a>
<a href="ControladorAutosDepor?accion=Actualizar&cod=${depor.idauto}"><img src="img/updatemar.png"></img></a></td>
 </tr>
</c:forEach>
 </table>
 </form>
</body>
</html>