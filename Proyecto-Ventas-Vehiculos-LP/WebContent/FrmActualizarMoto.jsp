<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Moto</title>

<!-- bootstrap version 4 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="Estilos/Estilo.css">
<!-- jquery UI -->
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<!-- JQUERY UI -->
 <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
 <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
 
 <script>
  $( function() {
    $( "#fechafabnEdit" ).datepicker({
    	
    	//aplicamos un formato para pode registrar en la base de datos
    	dateFormat:'dd/mm/yy'
    	
    });   
  }); //fin de jquery   
  </script>






</head>
<body>

<h1 align="center">Actualizar Motos</h1>
<br>
<table  align="center">
<form action="ControladorMotos" method="post">
<tr><td><input type="text"  class="form-control" placeholder="marca"  value='<c:out value="${marca}"></c:out>'      name="marca"></td></tr>
<tr><td><input type="text"  class="form-control" placeholder="modelo"  value='<c:out value="${modelo}"></c:out>'    name="modelo"></td></tr>
<tr><td><input type="text"  class="form-control" placeholder="cantidad"    value='<c:out value="${cantidad}"></c:out>'      name="cantidad"></td></tr>
<tr><td><input type="text"  class="form-control" placeholder="precio"   value='<c:out value="${precio}"></c:out>'     name="precio"></td></tr>
<tr><td><input type="text"  class="form-control" placeholder="nrochasis" value='<c:out value="${nrochasis }"></c:out>'  name="nrochasis"></td></tr>
<tr><td><input type="text"  class="form-control" placeholder="fechafabn" name="fechafabn" value='<fmt:formatDate value="${fechafabn}" pattern="dd/MM/yyyy"/>'
id="fechafabnEdit"></td></tr>
<tr><td><input type="hidden" name="codigo" value='<c:out value="${idmoto}"></c:out>'></td></tr>
<tr><td><input type="submit" value="Actualizar Moto" class="btn btn-primary"></td></tr>
</form>
</table>












<!-- BOOTSTRAP VERSION 4.0 -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>

</body>
</html>