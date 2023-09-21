<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de productos por Stock</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/ListarMotos.css"/>
<script src="js/archiv.js"></script>
</head>
<body>

<%@ include file="MenuPrincipal.jsp" %>
<h1 align="center"  >Listado de productos por stock</h1>



 <form action="">
 
 <table border="2" align="center"  class="data-table" class="table table-striped table-bordered">
 
 <tr>
 
 <th>Codigo</th>
 <th>Marca</th>
 <th>Modelo</th>
  <th>Cantidad</th>
 <th>Precio</th>
  <th>Nro chasis</th>
   <th>Fecha Fabricacion</th>
     <th colspan="2">Acciones</th>
  
 
 
 
 </tr>
 
 
<c:forEach var="Motos" items="${ ListadoMotos}">
 
 <tr>
 <td align="right">
 <c:out value="${Motos.idmoto }"></c:out>
 </td>
 <td align="center">
 <c:out value="${Motos.marca }"></c:out>
 </td>
  <td align="center">
 <c:out value="${Motos.modelo }"></c:out>
 </td>
  <td>
 <c:out value="${Motos.cantidad }"></c:out>
 </td>
  <td align="center">
 <c:out value="${Motos.precio }" ></c:out>
 </td>
   <td align="center">
 <c:out value="${Motos.nrochasis }"></c:out>
 </td>
  <td align="center">
<fmt:formatDate value="${Motos.fechafabn }" pattern="dd/MM/yyyy"/>
</td>
<td> <a href="#"><img src="img/deletemar.png"></img></a>
<a href="ControladorMotos?accion=Actualizar&cod=${Motos.idmoto}"><img src="img/updatemar.png"></img></a></td>


 </tr>
 </c:forEach>
 
 </table>
 </form>


























</body>
</html>