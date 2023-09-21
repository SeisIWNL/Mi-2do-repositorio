package Dao.Vehiculos.Web;



import java.util.Date;
import java.util.List;


import Modelo.Vehiculos.Web.ClassMotos;

public class TesMotosImp {

	public static void main(String[] args) {
		//instanciamos las respectivas clases
		ClassMotos clprod=new ClassMotos();
		ClassMotosImp clcrud=new ClassMotosImp();
		
		
		//***************** testeando el metodo registrar **********
		
			  /*clprod.setMarca("BMW");
				clprod.setModelo("Pisteras");
				clprod.setCantidad(5);
				clprod.setPrecio(12500);
				clprod.setNrochasis("234S5432R675GF343");
				Date fechact=new Date();
				Date fechasql=new Date(fechact.getTime());
				clprod.setFechafabn(fechasql);
				//invocamos el metodo registrar producto
				clcrud.RegistrarMotos(clprod);*/
		
		
		
		
		
		
		//******************testeando el metodo actualizar*******
		
				/*clprod.setMarca("Italika");
				clprod.setModelo("montañera");
				clprod.setCantidad(6);
				clprod.setPrecio(6);
				clprod.setNrochasis("123L56j78io3456");
				Date fecha=new  Date();
				Date fechasql=new Date(fecha.getTime());
				clprod.setFechafabn(fechasql);
				clprod.setIdmoto(1);
				//invocamos al metod actualizar
				clcrud.ActualizarMotos(clprod);*/
				
				
				
				
				
				
		//****************** testeando el metod eliminar
				
				   //eliminamos el codigo numero 2
				    /* clprod.setIdmoto(2);
				     //invocamos al metodo eliminar
				     clcrud.EliminarMotos(clprod);*/
				
				
				
		//***************** testeando el metodo listar productos..
		
			/*List<ClassMotos> listado=clcrud.ListarMotos();
			//aplicar un bucle para visualizar los registro de la tabla...
			for(ClassMotos list:listado){
				//imprimimos por pantalla
				System.out.println("codigo :"+list.getIdmoto()+
						" marca :"+list.getMarca()+" modelo :"+list.getModelo()
						+" cantidad :"+list.getCantidad()+" precio :"+list.getPrecio()+" nro. chasis :"+list.getNrochasis()
						+" fecha fa :"+list.getFechafabn());
				
			}    //fin del bucle for...*/
		
		
		//**************** testendo el metodo buscar por codigo...
				// asignamos el codigo del producto a buscar...
				    clprod.setIdmoto(3);
				    ClassMotos prod=clcrud.BuscarMotos(clprod);
				    //imprimimos por pantalla
				    System.out.println("codigo "+prod.getIdmoto()+" marca "+prod.getMarca()
				    +" modelo "+prod.getModelo()+" cantidad "+prod.getCantidad()+" NRO chasis"+prod.getNrochasis()
				    		+" precio "+prod.getPrecio()+" fecha "+prod.getFechafabn());
				    
				    
				  
				

		
		
		
		
		
		
	}//fin del metodo principal
	
	
	
	
	
	
	
	
	
			

}//fin de la clase test Motos
