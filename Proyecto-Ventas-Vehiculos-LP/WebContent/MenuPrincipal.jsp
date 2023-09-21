<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/estilosMenuP.css"/>
<script src="js/archivos2.js"></script>
</head>
<body>



<!-- codigo que muestra el mensaje de las credenciales -->
 <%
String men=(String)request.getAttribute("mensaje");
String menlog="";
//aplicamos una condicion
if(men!=null) menlog=men;

%>
<h2 align="center">
<%=menlog%>
</h2>


<!-- codigo del menu principal -->
<nav id="miNav">
  <ul>
 
    <li><a href="index.jsp">Inicio</a></li>
    <li><a href="#">Registrar vehículo</a>
      <ul>
        <li><a href="RegistrarMotos.jsp">Motos</a></li>
        <li><a href="RegistrarCarrosDepor.jsp">Autos deportivos</a></li>
        <li><a href="RegistrarCamionetas.jsp">Camionetas</a></li>
      </ul>
    </li>
    <li><a href="#">Listas</a>
      <ul>
        <li><a href="ListarMotosStock.jsp">Motos</a></li>
        <li><a href="#">Carros deportivos</a></li>
        <li><a href="#">Camionetas</a></li>
      </ul>
    </li>
    <li><a href="#">Inventario</a>
      <ul>
        <li><a href="#">Motos</a></li>
        <li><a href="#">Autos deportivos</a></li>
        <li><a href="#">Camionetas</a></li>
      </ul>
    </li>
    <li><a href="#">Registrar cliente</a></li>
    <li><a href="#">Reportes</a></li>
    
  </ul>
</nav>

</body>
</html>