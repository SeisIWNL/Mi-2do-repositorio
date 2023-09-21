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

import Dao.Vehiculos.Web.ClassCamionetasImp;
import Modelo.Vehiculos.Web.ClassCamionetas;

/**
 * Servlet implementation class ControladorCamioneta
 */
@WebServlet("/ControladorCamioneta")
public class ControladorCamioneta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCamioneta() {
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
				ClassCamionetas clcamion=new ClassCamionetas();
				ClassCamionetasImp clcamionimp=new ClassCamionetasImp();
				//asignamos el codigo...
				clcamion.setIdcamioneta(cod);
				//aplicamos el metodo buscar por codigo..
				ClassCamionetas clalm=clcamionimp.BuscarCamioneta(clcamion);
				//enviamos a la vista...
				request.setAttribute("idcamioneta",clalm.getIdcamioneta());
				request.setAttribute("marca",clalm.getMarca());
				request.setAttribute("modelo",clalm.getModelo());
				request.setAttribute("color",clalm.getColor());
				request.setAttribute("cantidad",clalm.getCantidad());
				request.setAttribute("precio",clalm.getPrecio());
				request.setAttribute("fechafab",clalm.getFechafab());
				//redireccionamos
				request.getRequestDispatcher("/FrmActualizarCamionetas.jsp").forward(request, response);
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
		String fechafa=request.getParameter("fechafab");
		//instanciamos las respectivas clases..
		
		ClassCamionetas clcamion=new ClassCamionetas();
		ClassCamionetasImp clcamionimp=new ClassCamionetasImp();
		
		
		//asignar los valores del formulario
			clcamion.setMarca(mar);
			clcamion.setModelo(model);
			clcamion.setColor(color);
			clcamion.setCantidad(cantidad);
			clcamion.setPrecio(pre);	
				
				
				//aplicamos la clase simpledateformat...
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
				Date fecha;
				try {
					fecha=sdf.parse(fechafa);
					Date fechasql=new Date(fecha.getTime());
					//asignamos la fecha de vencimiento
					clcamion.setFechafab(fechasql);	
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //fin del cacth....
				
				//aplicamos una condicion...
					if(cod!=null){
						int codigo=Integer.parseInt(cod);
						//asigno el codigo para poder actualizar la fila o producto...
						clcamion.setIdcamioneta(codigo);
						//invocar el metodo actualizar...
						clcamionimp.ActualizarCamioneta(clcamion);
					   } else {  		
						//invocamos el  metodo registrar producto
						   clcamionimp.RegistrarCamioneta(clcamion);
				
					    }  //fin de la condicion...

				//recuperamos el listado desde la base de datos 
				//invocamos al metodo listar producto
				
				List<ClassCamionetas> listado = clcamionimp.ListarCamioneta();
				
			    request.setAttribute("ListarCamionetas", listado);
				
				//redireccionamos hacia la vista...
				request.getRequestDispatcher("/ListarCamionetas.jsp").forward(request, response);
	}

}
