package Dao.Vehiculos.Web;

import java.util.Date;
import java.util.List;

import Modelo.Vehiculos.Web.ClassCamionetas;

public class TestClassCamionetasImp {
	public static void main(String[] args) {
		ClassCamionetas clcamioneta = new ClassCamionetas();
		ClassCamionetasImp clcamionetaImp = new ClassCamionetasImp();
		
		/*************************** Método Registrar ***************************\
		 * 
		 */
		/*clcamioneta.setMarca("Hyundai");
		clcamioneta.setModelo("Trastor");
		clcamioneta.setColor("Verde");
		clcamioneta.setCantidad(11);
		clcamioneta.setPrecio(2333);
		Date fechact=new Date();
		Date fechasql=new Date(fechact.getTime());
		clcamioneta.setFechafab(fechasql);
		
		clcamionetaImp.RegistrarCamioneta(clcamioneta);*/
		
		/*************************** Método Actualizar ***************************\
		 * 
		 */
		/*clcamioneta.setMarca("Hyundai");
		clcamioneta.setModelo("Todoterreno");
		clcamioneta.setColor("verde");
		clcamioneta.setCantidad(8);
		clcamioneta.setPrecio(5.4);
		Date fecha=new  Date();
		Date fechasql=new Date(fecha.getTime());
		clcamioneta.setFechafab(fechasql);
		clcamioneta.setIdcamioneta(1);
		
		clcamionetaImp.ActualizarCamioneta(clcamioneta);*/
		
		/*************************** Método Eliminar ***************************\
		 * 
		 */
		/*   //eliminamos el codigo numero 12
		clcamioneta.setIdcamioneta(1);
	     //invocamos al metodo eliminar
		clcamionetaImp.EliminarCamioneta(clcamioneta);*/
		
		/*************************** Método Listar ***************************\
		 * 
		 */
		/*List<ClassCamionetas> listado = clcamionetaImp.ListarCamioneta();
		//aplicar un bucle para visualizar los registro de la tabla...
		for(ClassCamionetas list:listado){
			//imprimimos por pantalla
			System.out.println("codigo: "+list.getIdcamioneta()+
					" marca: "+list.getMarca()+" modelo: "+list.getModelo()
					+" color: "+list.getColor()+" cantidad: "+list.getCantidad()+" precio: "+list.getPrecio()
					+" fecha fa: "+list.getFechafab());
		}*/
		
		/*************************** Método Buscar por Código ***************************\
		 * 
		 */
		//asignamos el codigo del producto a buscar...
		clcamioneta.setIdcamioneta(2);
		ClassCamionetas camioneta=clcamionetaImp.BuscarCamioneta(clcamioneta);
	    //imprimimos por pantalla
	    System.out.println("codigo "+camioneta.getIdcamioneta()+" marca "+camioneta.getMarca()
	    +" modelo "+camioneta.getModelo()+" color "+camioneta.getColor()+" cantidad "+camioneta.getCantidad()
	    		+" precio "+camioneta.getPrecio()+" fecha "+camioneta.getFechafab());
	}
}
