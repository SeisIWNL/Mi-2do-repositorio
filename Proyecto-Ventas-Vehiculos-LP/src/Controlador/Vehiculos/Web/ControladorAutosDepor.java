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

import Dao.Vehiculos.Web.ClassAutosDeporImp;
import Modelo.Vehiculos.Web.ClassAutosDepor;

/**
 * Servlet implementation class ControladorAutosDepor
 */
@WebServlet("/ControladorAutosDepor")
public class ControladorAutosDepor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorAutosDepor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String accion=request.getParameter("accion");
		if(accion!=null){
			switch(accion){
			case "Actualizar":
				//recuperamos el codigo
				int cod=Integer.parseInt(request.getParameter("cod"));
				//instanciamos las respectivas clases...
				ClassAutosDepor clauto=new ClassAutosDepor();
				ClassAutosDeporImp clautoimp=new ClassAutosDeporImp();
				//asignamos el codigo...
				clauto.setIdauto(cod);
				//aplicamos el metodo buscar por codigo..
				ClassAutosDepor clalm=clautoimp.BuscarAutosDepor(clauto);
				//enviamos a la vista...
				request.setAttribute("idauto",clalm.getIdauto());
				request.setAttribute("marca",clalm.getMarca());
				request.setAttribute("modelo",clalm.getModelo());
				request.setAttribute("color",clalm.getColor());
				request.setAttribute("cantidad",clalm.getCantidad());
				request.setAttribute("precio",clalm.getPrecio());
				request.setAttribute("fechaFabricacion",clalm.getFechaFabricacion());
				//redireccionamos
				request.getRequestDispatcher("/FrmActualizarCarrosDepor.jsp").forward(request, response);
				break;
			case "Eliminar":
				break;
			
			}   //fin del switch...
			
			
			 
		}   //fin del if...
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//recuperamos los datos del formulario
		String cod=request.getParameter("codigo");
		String mar=request.getParameter("marca");
		String model=request.getParameter("modelo");
		int cantidad=Integer.parseInt(request.getParameter("cantidad"));
		double pre=Double.parseDouble(request.getParameter("precio"));
		String color=request.getParameter("color");
		String fechafa=request.getParameter("fechafabn");
		//instanciamos las respectivas clases..
		
		ClassAutosDepor clauto=new ClassAutosDepor();
		ClassAutosDeporImp clautoimp=new ClassAutosDeporImp();
		
		
		//asignar los valores del formulario
				clauto.setMarca(mar);
				clauto.setModelo(model);
				clauto.setColor(color);
				clauto.setCantidad(cantidad);
				clauto.setPrecio(pre);	
				
				
				//aplicamos la clase simpledateformat...
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
				Date fecha;
				try {
					fecha=sdf.parse(fechafa);
					Date fechasql=new Date(fecha.getTime());
					//asignamos la fecha de vencimiento
				clauto.setFechaFabricacion(fechasql);	
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //fin del cacth....
				
				//aplicamos una condicion...
					if(cod!=null){
						int codigo=Integer.parseInt(cod);
						//asigno el codigo para poder actualizar la fila o producto...
						clauto.setIdauto(codigo);
						//invocar el metodo actualizar...
						clautoimp.ActualizarAutosDepor(clauto);
					   } else {  		
						//invocamos el  metodo registrar producto
						   clautoimp.RegistrarAutosDepor(clauto);
				
					    }  //fin de la condicion...

				//recuperamos el listado desde la base de datos 
				//invocamos al metodo listar producto
				
				List<ClassAutosDepor> listado = clautoimp.ListarAutosDepor();
				
			    request.setAttribute("ListadoAutosDepor", listado);
				
				//redireccionamos hacia la vista...
				request.getRequestDispatcher("/ListarAutosDepor.jsp").forward(request, response);
	}

}
