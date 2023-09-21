package Controlador.Vehiculos.Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Vehiculos.Web.ClassUsuarioImp;
import Modelo.Vehiculos.Web.ClassUsuario;



/**
 * Servlet implementation class ControladorLogueo
 */
@WebServlet("/ControladorLogueo")
public class ControladorLogueo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorLogueo() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del construcutor

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//emitimos un mensaje por el navegador
				PrintWriter out=response.getWriter();
				//out.write("Programando con servlets y Base de Datos");
				
				//redireccionar con servlets...
				
				//forma uno
				
				//response.sendRedirect("index.jsp");
				
				//forma dos
				//request.getRequestDispatcher("/index.jsp").forward(request, response);
				
				//recuperamos los datos datos del formulario index(logueo)
				String usuario=request.getParameter("usuario");
				String pass=request.getParameter("password");
				
				String mensaje="";
				
				ClassUsuario clusu=new ClassUsuario();
				
				//asignamos valores
				
				clusu.setUsuario(usuario);
				clusu.setPassword(pass);
				
				//instanciamos la clase clasusuarioimp
				ClassUsuarioImp climp=new ClassUsuarioImp();
				//recuperamos los datos de la base de datos
				//invocamos al metodo validar usuario
				ClassUsuario valusuario=climp.ValidarUsuario(clusu);
				
				//aplicamos una condicion	
				//if(usuario.equals("cibertec") && pass.equals("123456")){
				//if con clase sin base de datos
				//if(clusu.getUsuario().equals("cibertec") && clusu.getPassword().equals("123456")){
				//condicion con base de datos
				    if(valusuario.getUsuario()!=null && valusuario.getPassword()!=null){
					mensaje="Credenciales correctas validado desde el servlet con BD....";
					//enviamos a la vista...
					request.setAttribute("mensaje",mensaje);
					//redireccionamos al menu principal...
					request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);	
					
				} else {
					mensaje="Credenciales INCORRECTAS validado desde el servlet con BD....";
					//enviamos a la vista...
					request.setAttribute("mensaje",mensaje);
					//redireccionamos
					request.getRequestDispatcher("/index.jsp").forward(request, response);
					
				}   //fin del else....
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}//fin del metodo service
	
	
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}//fin del metodo do get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}//fin del metodo do post

}
