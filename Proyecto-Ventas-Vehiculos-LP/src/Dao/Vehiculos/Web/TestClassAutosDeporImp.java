package Dao.Vehiculos.Web;

import java.util.Date;
import java.util.List;

import Modelo.Vehiculos.Web.ClassAutosDepor;

public class TestClassAutosDeporImp {
	public static void main(String[] args) {
		ClassAutosDepor clauto = new ClassAutosDepor();
		ClassAutosDeporImp clautoimp = new ClassAutosDeporImp();
		
		/*************************** Método Registrar ***************************\
		 * 
		 */
		/*clauto.setMarca("Hyundai");
		clauto.setModelo("Bugatti");
		clauto.setColor("verde");
		clauto.setCantidad(11);
		clauto.setPrecio(2333);
		Date fechact=new Date();
		Date fechasql=new Date(fechact.getTime());
		clauto.setFechaFabricacion(fechasql);
		
		clautoimp.RegistrarAutosDepor(clauto);*/
		
		/*************************** Método Actualizar ***************************\
		 * 
		 */
		/*clauto.setMarca("Hyundai");
		clauto.setModelo("Todoterreno");
		clauto.setColor("verde");
		clauto.setCantidad(8);
		clauto.setPrecio(5.4);
		Date fecha=new  Date();
		Date fechasql=new Date(fecha.getTime());
		clauto.setFechaFabricacion(fechasql);
		clauto.setIdauto(1);
		//invocamos al metod actualizar
		clautoimp.ActualizarAutosDepor(clauto);*/
		
		/*************************** Método Eliminar ***************************\
		 * 
		 */
		   //eliminamos el codigo numero 12
	     /*clauto.setIdauto(12);
	     //invocamos al metodo eliminar
	     clautoimp.EliminarAutosDepor(clauto);*/
		
		/*************************** Método Listar ***************************\
		 * 
		 */
		/*List<ClassAutosDepor> listado = clautoimp.ListarAutosDepor();
		//aplicar un bucle para visualizar los registro de la tabla...
		for(ClassAutosDepor list:listado){
			//imprimimos por pantalla
			System.out.println("codigo :"+list.getIdauto()+
					" marca :"+list.getMarca()+" modelo :"+list.getModelo()
					+" color :"+list.getColor()+" cantidad :"+list.getCantidad()+" precio :"+list.getPrecio()
					+" fecha fa :"+list.getFechaFabricacion());*/
			
			/*************************** Método Buscar por Código ***************************\
			 * 
			 */
			/*// asignamos el codigo del producto a buscar...
		    clauto.setIdauto(2);
		    ClassAutosDepor auto=clautoimp.BuscarAutosDepor(clauto);
		    //imprimimos por pantalla
		    System.out.println("codigo "+auto.getIdauto()+" marca "+auto.getMarca()
		    +" modelo "+auto.getModelo()+" color "+auto.getColor()+" cantidad "+auto.getCantidad()
		    		+" precio "+auto.getPrecio()+" fecha "+auto.getFechaFabricacion()); */
		}    
	}
