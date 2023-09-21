package Controlador.Vehiculos.Web;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Dao.Vehiculos.Web.ClassMotosImp;
import Modelo.Vehiculos.Web.ClassMotos;

/**
 * Servlet implementation class ControladorMotos
 */
@WebServlet("/ControladorMotos")
public class ControladorMotos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorMotos() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del constructor 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//declaramos una variable de tipo string....
				String accion=request.getParameter("accion");
				//aplicamos una condicion...
				if(accion!=null){
					switch(accion){
					case "Actualizar":
						//recuperamos el codigo
						int cod=Integer.parseInt(request.getParameter("cod"));
						//instanciamos las respectivas clases...
						ClassMotos claprod=new ClassMotos();
						ClassMotosImp claprodimp=new ClassMotosImp();
						//asignamos el codigo...
						claprod.setIdmoto(cod);
						//aplicamos el metodo buscar por codigo..
						ClassMotos clalm=claprodimp.BuscarMotos(claprod);
						//enviamos a la vista...
						request.setAttribute("idmoto",clalm.getIdmoto());
						request.setAttribute("marca",clalm.getMarca());
						request.setAttribute("modelo",clalm.getModelo());
						request.setAttribute("cantidad",clalm.getCantidad());
						request.setAttribute("precio",clalm.getPrecio());
						request.setAttribute("nrochasis",clalm.getNrochasis());
						request.setAttribute("fechafabn",clalm.getFechafabn());
						//redireccionamos
						request.getRequestDispatcher("/FrmActualizarMoto.jsp").forward(request, response);
						break;
					case "Eliminar":
						break;
					
					}   //fin del switch...
					
					
					 
				}   //fin del if...
				
				
				
				
	
				
				
				
				
				
		
		
	}//fin del metodo do get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos el codigo del actulizar
		String cod=request.getParameter("codigo");
		
		
		//recuperamos los datos del formulario
		String mar=request.getParameter("marca");
		String mol=request.getParameter("modelo");
		int cant=Integer.parseInt(request.getParameter("cantidad"));
		double pre=Double.parseDouble(request.getParameter("precio"));
		String nrocha=request.getParameter("nrochasis");
		String fechafa=request.getParameter("fechafabn");
		//instanciamos las respectivas clases..
		
		ClassMotos clprod=new ClassMotos();
		ClassMotosImp crudpro=new ClassMotosImp();
		
		
		//asignar los valores del formulario
				clprod.setMarca(mar);
				clprod.setModelo(mol);
				clprod.setCantidad(cant);
				clprod.setPrecio(pre);
				clprod.setNrochasis(nrocha);	
				
				
				//aplicamos la clase simpledateformat...
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
				Date fecha;
				try {
					fecha=sdf.parse(fechafa);
					Date fechasql=new Date(fecha.getTime());
					//asignamos la fecha de vencimiento
				clprod.setFechafabn(fechasql);	
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //fin del cacth....
				
				
				
				
				//condicon del actulizar
				
				//aplicamos una condicion...
					if(cod!=null){
						int codigo=Integer.parseInt(cod);
						//asigno el codigo para poder actualizar la fila o producto...
						clprod.setIdmoto(codigo);
						//invocar el metodo actualizar...
						crudpro.ActualizarMotos(clprod);
					   } else {  		
						//invocamos el  metodo registrar producto
						   crudpro.RegistrarMotos(clprod);	
				
					    }  //fin de la condicion...

				
				
				
				
				
				
				//recuperamos el listado desde la base de datos 
				//invocamos al metodo listar producto
				
				List<ClassMotos> listado=crudpro.ListarMotos();
				
				//inviamos a lña vista
				
			    request.setAttribute("ListadoMotos", listado);
				
				//redireccionamos hacia la vista...
				request.getRequestDispatcher("/ListarMotosStock.jsp").forward(request, response);
				
		
		
	}//fin del metodo do post

}
