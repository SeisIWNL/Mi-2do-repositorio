package Dao.Vehiculos.Web;

import Modelo.Vehiculos.Web.ClassUsuario;

public class TestClassUasuarioImp {

	public static void main(String[] args) {
		//instanciamos las respectivas clases..
				ClassUsuario clusu=new ClassUsuario();
				ClassUsuarioImp climp=new ClassUsuarioImp();
				//asignamos valores a los metodos setter
				clusu.setUsuario("digitador");
				clusu.setPassword("123456");
				//recuperamos los valores de la base de datos
				ClassUsuario valusu=climp.ValidarUsuario(clusu);
				System.out.println("usuario "+valusu.getUsuario()+" "+"password "+valusu.getPassword());
				
				//aplicamos una condicion...
				if(valusu.getUsuario()!=null && valusu.getPassword()!=null){
					//emitimos un mensaje por consola
					System.out.println("Credenciales Correctas en BD");
					
				}else{
					
					//emitimos  un mensaje por consola
					System.out.println("Credenciales INCORRECTAS no EXISTE EN BD");
				}  // fin  de else....
				
			}  //fin del metodo principal..

	}//fin del metodo principal


