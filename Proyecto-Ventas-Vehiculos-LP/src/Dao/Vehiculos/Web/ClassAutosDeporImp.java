package Dao.Vehiculos.Web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarMYSQL;
import Interfaces.Vehiculos.Web.IntAutosDepor;
import Modelo.Vehiculos.Web.ClassAutosDepor;

public class ClassAutosDeporImp implements IntAutosDepor{

	@Override
	public void RegistrarAutosDepor(ClassAutosDepor clauto) {
		
		// instanciar la clase conectar
		//instanciar la clase conectar..
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena en mysql...
		String sql="insert into tbl_autosdepor values(null,?,?,?,?,?,?)";
		//aplicamos la interface preparedstatement para base de datos...
	    PreparedStatement ps=null;
	    
	  //asignamos la conexion y cadena...
	  		try {
	  			ps=conex.conexionbd().prepareStatement(sql);
	  			//agregamos los parametros
	  			ps.setString(1,clauto.getMarca());
	  			ps.setString(2,clauto.getModelo());
	  			ps.setString(3,clauto.getColor());
	  			ps.setInt(4,clauto.getCantidad());
	  			ps.setDouble(5,clauto.getPrecio());
	  			ps.setDate(6,new java.sql.Date(clauto.getFechaFabricacion().getTime()));
	  			
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
	  		
		
		
		
	}

	@Override
	public void ActualizarAutosDepor(ClassAutosDepor clauto) {
		//instanciar la clase conectar mysql..
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la respectiva cadena...
		String sql="update tbl_autosdepor set marca=?,modelo=?,"
				+ "color=?,cantidad=?,precio=?,fechafabricacion=? where idauto=?";
		//aplicamos la inteface preparedestament...
		PreparedStatement ps=null;
		
		try {
			//asignamos la conexion y cadena...
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos los parametros...
			ps.setString(1,clauto.getMarca());
			ps.setString(2,clauto.getModelo());
			ps.setString(3,clauto.getColor());
			ps.setInt(4,clauto.getCantidad());
			ps.setDouble(5,clauto.getPrecio());
			ps.setDate(6,new java.sql.Date(clauto.getFechaFabricacion().getTime()));
			ps.setInt(7,clauto.getIdauto());
			
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
		
	}//fin del metodo actualizar moto...

	@Override
	public void EliminarAutosDepor(ClassAutosDepor clauto) {
		// TODO Auto-generated method stub

		//intanciamos la clase conectar
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena
		String sql="delete from tbl_autosdepor where idauto=?";
		//aplicamos las interfaces para base de datos
		PreparedStatement ps=null;
		
		try {
			//asignamos la conexion y la cadena
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos el parametro
			ps.setInt(1,clauto.getIdauto());
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
	}

	@Override
	public List<ClassAutosDepor> ListarAutosDepor() {
		
		//instanciamos la clase conectar...
				ConectarMYSQL conex=new ConectarMYSQL();
				//realizamos la cadena..
				String sql="select * from tbl_autosdepor";
				//aplicamos las interfaces para BD...
				PreparedStatement ps=null;
				ResultSet rs=null;
				//aplicamos un list
				List<ClassAutosDepor> Listar=new ArrayList<ClassAutosDepor>();
				//asignamos la conexion,cadena...
				try {
					ps=conex.conexionbd().prepareStatement(sql);
					//ejecutamos
					rs=ps.executeQuery();
					//aplicamos un bucle
					while(rs.next()){
						//instanciar una clase classproducto
						ClassAutosDepor clauto=new ClassAutosDepor();
						clauto.setIdauto(rs.getInt(1));
						clauto.setMarca(rs.getString(2));
						clauto.setModelo(rs.getString(3));
						clauto.setColor(rs.getString(4));
						clauto.setCantidad(rs.getInt(5));
						clauto.setPrecio(rs.getDouble(6));
						clauto.setFechaFabricacion(rs.getDate(7));
						//asignamos lo recuperado de la BD
						Listar.add(clauto);
					}  //fin del bucle
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				return Listar;
	}

	@Override
	public ClassAutosDepor BuscarAutosDepor(ClassAutosDepor clauto) {
		
		//instanciamos la clase conectar...
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena
		String sql="select * from tbl_autosdepor where idauto=?";
		//declaramos las interfaces para BD...
		PreparedStatement ps=null;
		ResultSet rs=null;
		//instanciamo la class producto
		ClassAutosDepor clautodep=new ClassAutosDepor();
		
		try {
			//asignamos la conexion y cadena
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos parametros
			ps.setInt(1,clauto.getIdauto());
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos un if
			if(rs.next()){
				clautodep.setIdauto(rs.getInt(1));
				clautodep.setMarca(rs.getString(2));
				clautodep.setModelo(rs.getString(3));
				clautodep.setColor(rs.getString(4));
				clautodep.setCantidad(rs.getInt(5));
				clautodep.setPrecio(rs.getDouble(6));
				clautodep.setFechaFabricacion(rs.getDate(7));
				
			}   //fin de la condicion...
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch..
return clautodep;	
}
	

	@Override
	public ClassAutosDepor ValidarAutosDepor(ClassAutosDepor clauto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
