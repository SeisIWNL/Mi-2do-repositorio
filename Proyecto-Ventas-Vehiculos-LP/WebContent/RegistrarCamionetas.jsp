<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Camionetas</title>

<link rel="stylesheet" href="css/estilosRe-Ca-Depor.css"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<script src="js/archivos3.js"></script>

<!-- codigo del calendario -->
 <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#fechafabn" ).datepicker();
  } );
  </script>
</head>


<body bgcolor="#c5dec9">
<!-- codigo para que muestre la pagina en el menuprincipal sin que desaparesca en menu principal -->
<%@ include file="MenuPrincipal.jsp" %>

<br/>
<h1 align="center">Registrar Camionetas</h1>
<!-- 
<form method="post" action="ListarProducto.jsp">
-->
<br/>

<div class="shad" id="formulario">
<form method="post" action="ControladorCamioneta" class="mb-2 w-25">
<table border="2" align="center" class="table table-striped table-bordered">

<tr><td><input type="text" name="nombre" class="form-control" placeholder="marca" class="place"></td></tr>
<tr><td><input type="text" name="modelo" class="form-control" placeholder="modelo"></td></tr>
<tr><td><input type="text" name="color" class="form-control" placeholder="color"></td></tr>
<tr><td><input type="text" name="cantidad"  class="form-control" placeholder="cantidad"></td></tr>
<tr><td><input type="text" name="precio" class="form-control" placeholder="precio"></td></tr>
<tr><td><input type="text" name="fechafabn" id="fechafabn" class=" form-control" placeholder="fecha de fabricación"></td>
<tr>
<td colspan="2" align="center"><input type="submit" value="Enviar Datos" class="btn btn-primary"></td>
</tr>
</table>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</form>
<hr>
</div>

</body>
</html>