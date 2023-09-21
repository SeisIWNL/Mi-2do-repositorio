package Dao.Vehiculos.Web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarMYSQL;
import Interfaces.Vehiculos.Web.IntMotosable;

import Modelo.Vehiculos.Web.ClassMotos;

public class ClassMotosImp implements IntMotosable {

	@Override
	public void RegistrarMotos(ClassMotos cprod) {
		
		// instanciar la clase conectar
		//instanciar la clase conectar..
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena en mysql...
		String sql="insert into tbl_motos values(null,?,?,?,?,?,?)";
		//aplicamos la interface preparedstatement para base de datos...
	    PreparedStatement ps=null;
	    
	  //asignamos la conexion y cadena...
	  		try {
	  			ps=conex.conexionbd().prepareStatement(sql);
	  			//agregamos los parametros
	  			ps.setString(1,cprod.getMarca());
	  			ps.setString(2,cprod.getModelo());
	  			ps.setInt(3,cprod.getCantidad());
	  			ps.setDouble(4,cprod.getPrecio());
	  			ps.setString(5,cprod.getNrochasis());
	  			ps.setDate(6,new java.sql.Date(cprod.getFechafabn().getTime()));
	  			
	  			//ejecutamos
	  			int x=ps.executeUpdate();
	  			//aplicamos una condicion
	  			if(x>0){
	  				//emitimos un mensaje por consola			
	  				System.out.println("Producto Registrado en la BD");	
	  			}else {
	  				//emitimos un mensaje por consola
	  				System.out.println("Producto NO Registrado en la BD");
	  			}  //fin del else
	  			
	  			
	  		} catch (SQLException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();
	  		}//fin del traychat
	  		
		
		
		
	}//fin del metodo registrar

	@Override
	public void ActualizarMotos(ClassMotos cprod) {
		//instanciar la clase conectar mysql..
				ConectarMYSQL conex=new ConectarMYSQL();
				//realizamos la respectiva cadena...
				String sql="update tbl_motos set marca=?,modelo=?,"
						+ "cantidad=?,precio=?,nrochasis=?,fechafabn=? where idmoto=?";
				//aplicamos la inteface preparedestament...
				PreparedStatement ps=null;
				
				try {
					//asignamos la conexion y cadena...
					ps=conex.conexionbd().prepareStatement(sql);
					//asignamos los parametros...
					ps.setString(1,cprod.getMarca());
					ps.setString(2,cprod.getModelo());
					ps.setInt(3,cprod.getCantidad());
					ps.setDouble(4,cprod.getPrecio());
					ps.setString(5,cprod.getNrochasis());
					ps.setDate(6,new java.sql.Date(cprod.getFechafabn().getTime()));
					ps.setInt(7,cprod.getIdmoto());
					
					//ejecutamos
					int z=ps.executeUpdate();
					//aplicamos una condicion 
					if(z>0){
						
						//emitimos un mensaje por consola
						System.out.println("Registro ACTUALIZADO en BD");
					}else{
						//emitimos un mensaje por consola
						System.out.println("Registro NO ACTUALIZADO en BD");
					}    //fin del else
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  //fin del catch....
				
			}//fin del metodo actualizar moto...u

		


	@Override
	public void EliminarMotos(ClassMotos cprod) {
	
		//intanciamos la clase conectar
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena
		String sql="delete from tbl_motos where idmoto=?";
		//aplicamos las interfaces para base de datos
		PreparedStatement ps=null;
		
		try {
			//asignamos la conexion y la cadena
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos el parametro
			ps.setInt(1,cprod.getIdmoto());
			//ejecutamos
			int x=ps.executeUpdate();
			//aplicamos una condicion
			if(x>0){
				//emitimos un mensaje por consola
				System.out.println("Registro eliminado de la BD");
			}else{
				
				//emitimos un mensa por consola
				System.out.println("Registro NO eliminado de la BD");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch...
		
		
		
		
		
		
		
		
		
		
	}//fin del metodo eliminar

	@Override
	public List<ClassMotos> ListarMotos() {
		
		//instanciamos la clase conectar...
				ConectarMYSQL conex=new ConectarMYSQL();
				//realizamos la cadena..
				String sql="select * from tbl_motos";
				//aplicamos las interfaces para BD...
				PreparedStatement ps=null;
				ResultSet rs=null;
				//aplicamos un list
				List<ClassMotos> Listar=new ArrayList<ClassMotos>();
				//asignamos la conexion,cadena...
				try {
					ps=conex.conexionbd().prepareStatement(sql);
					//ejecutamos
					rs=ps.executeQuery();
					//aplicamos un bucle
					while(rs.next()){
						//instanciar una clase classproducto
						ClassMotos clprod=new ClassMotos();
						clprod.setIdmoto(rs.getInt(1));
						clprod.setMarca(rs.getString(2));
						clprod.setModelo(rs.getString(3));
						clprod.setCantidad(rs.getInt(4));
						clprod.setPrecio(rs.getDouble(5));
						clprod.setNrochasis(rs.getString(6));
						clprod.setFechafabn(rs.getDate(7));
						//asignamos lo recuperado de la BD
						Listar.add(clprod);
					}  //fin del bucle
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				return Listar;
		
		
		
		
		
	
	}//fin del metodo listar

	@Override
	public ClassMotos BuscarMotos(ClassMotos cprod) {
		
		//instanciamos la clase conectar...
				ConectarMYSQL conex=new ConectarMYSQL();
				//realizamos la cadena
				String sql="select * from tbl_motos where idmoto=?";
				//declaramos las interfaces para BD...
				PreparedStatement ps=null;
				ResultSet rs=null;
				//instanciamo la class producto
				ClassMotos prodalm=new ClassMotos();
				
				try {
					//asignamos la conexion y cadena
					ps=conex.conexionbd().prepareStatement(sql);
					//asignamos parametros
					ps.setInt(1,cprod.getIdmoto());
					//ejecutamos
					rs=ps.executeQuery();
					//aplicamos un if
					if(rs.next()){
						prodalm.setIdmoto(rs.getInt(1));
						prodalm.setMarca(rs.getString(2));
						prodalm.setModelo(rs.getString(3));
						prodalm.setCantidad(rs.getInt(4));
						prodalm.setPrecio(rs.getDouble(5));
						prodalm.setNrochasis(rs.getString(6));
						prodalm.setFechafabn(rs.getDate(7));
						
					}   //fin de la condicion...
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  //fin del catch..
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		return prodalm;
		
	}  //fin del metodos buscar producto
	

	@Override
	public ClassMotos ValidarMotos(ClassMotos cprod) {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo validar 

}//fin de la clase 
