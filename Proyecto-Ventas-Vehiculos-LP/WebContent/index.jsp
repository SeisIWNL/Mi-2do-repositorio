<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Har.com</title>
<link rel="stylesheet" href="css/estilos.css"/>
<script src="js/archivos.js"></script>
</head>

 <body >
 
 <!-- Codigo del mensaje que dice si es incorrecta la contraseña  -->
 
 <%
String men=(String)request.getAttribute("mensaje");
String menlog="";
//aplicamos una condicion
if(men!=null) menlog=men;

%>
<h2 align="center" >
<%=menlog%>
</h2>

 



 

    <h1 class="nombre1">Vehiculos Cart.S.A.C</h1> 
    
    
    
    <form action="ControladorLogueo" method="post">
    <h2>Ingreso al Sistema HAR</h2>
    <p class="subtitulo"> <strong> Ingresar tu Usuario y contraseña </strong> </p>
      <table>
        <tr>
          <td><img alt="" src="img/logo1.png"></td>
          <td><input  type="text" name="usuario"  placeholder="Usuario" ></td>
        </tr>
        <tr>
          <td><img class="imagenlogo" alt="" src="img/logo2.png"></td>
          <td><input  type="password" name="password" placeholder="password" ></td>
        </tr>


        
        <tr >
          <td  colspan="2"><input type="submit" value="Iniciar Sesion"> <a class="vinculo"  href="registro.jsp" style="text-decoration:none;color:#333;">Registrate</a>  </td>
          
          
          
        </tr>
       

      </table>
      <p class="subtitulodos"> si deseas ingresar una solicitud de cambio de  </p>
      <p class="subtitulodos">contraseña ingresar a este <a href="https://support.google.com/accounts/answer/41078?hl=es-419&co=GENIE.Platform%3DAndroid">link</a> </p>
      <p class="subtitulotres">v.7.09 </p>
      
    </form>
    
    
     <div class="coment">
    <h3>Empecemos.!</h3>
    <p>Tu contraseña es importante</p>
    <p>Recuerda que siempre debe tener</p>
    <ul>
    <li>Una Mayuscula y una minuscula</li>
      <li>Un numero</li>
        <li>No debe contener parte de nombre u apellidos</li>
        
    
    
    </ul>
    
    
    </div>
    
  <footer>
  <div class="footer-content">
    <h3><span>Sistema de Vehículos</span> Cart S.A.C.</h3>
    <p >Teléfono: 555-1234 | Email: info@sistemavehiculoscart.com</p>
    <div class="social-icons">
      <a href="#"><i > <img class="img1" alt="" src="img/facebook.png"></i></a>
      <a href="#"><i > <img class="img1" alt="" src="img/instagran.png"></i></a>
      <a href="#"><i > <img class="img1" alt="" src="img/youtube.png"></i></a>
    </div>
    
    
  </div>
</footer>
  
    

    
    
  </body>


</html>
 