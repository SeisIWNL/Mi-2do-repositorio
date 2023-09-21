package Dao.Vehiculos.Web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConectarBD.ConectarMYSQL;
import Interfaces.Vehiculos.Web.IntCamionetable;
import Modelo.Vehiculos.Web.ClassCamionetas;

public class ClassCamionetasImp implements IntCamionetable{

	@Override
	public void RegistrarCamioneta(ClassCamionetas clcamion) {
		// TODO Auto-generated method stub
		// instanciar la clase conectar
		//instanciar la clase conectar..
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena en mysql...
		String sql="insert into tbl_camionetas values(null,?,?,?,?,?,?)";
		//aplicamos la interface preparedstatement para base de datos...
	    PreparedStatement ps=null;
	    
	  //asignamos la conexion y cadena...
	  		try {
	  			ps=conex.conexionbd().prepareStatement(sql);
	  			//agregamos los parametros
	  			ps.setString(1,clcamion.getMarca());
	  			ps.setString(2,clcamion.getModelo());
	  			ps.setString(3,clcamion.getColor());
	  			ps.setInt(4,clcamion.getCantidad());
	  			ps.setDouble(5,clcamion.getPrecio());
	  			ps.setDate(6,new java.sql.Date(clcamion.getFechafab().getTime()));
	  			
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
	public void ActualizarCamioneta(ClassCamionetas clcamion) {
		// TODO Auto-generated method stub
		//instanciar la clase conectar mysql..
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la respectiva cadena...
		String sql="update tbl_camionetas set marca=?,modelo=?,"
				+ "color=?,cantidad=?,precio=?,fechafab=? where idcamioneta=?";
		//aplicamos la inteface preparedestament...
		PreparedStatement ps=null;
		
		try {
			//asignamos la conexion y cadena...
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos los parametros...
			ps.setString(1,clcamion.getMarca());
			ps.setString(2,clcamion.getModelo());
			ps.setString(3,clcamion.getColor());
			ps.setInt(4,clcamion.getCantidad());
			ps.setDouble(5,clcamion.getPrecio());
			ps.setDate(6,new java.sql.Date(clcamion.getFechafab().getTime()));
			ps.setInt(7,clcamion.getIdcamioneta());
			
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
		
	}

	@Override
	public void EliminarCamioneta(ClassCamionetas clcamion) {
		// TODO Auto-generated method stub
		//intanciamos la clase conectar
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena
		String sql="delete from tbl_camionetas where idcamioneta=?";
		//aplicamos las interfaces para base de datos
		PreparedStatement ps=null;
		
		try {
			//asignamos la conexion y la cadena
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos el parametro
			ps.setInt(1,clcamion.getIdcamioneta());
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
	public List<ClassCamionetas> ListarCamioneta() {
		// TODO Auto-generated method stub
		//instanciamos la clase conectar...
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena..
		String sql="select * from tbl_camionetas";
		//aplicamos las interfaces para BD...
		PreparedStatement ps=null;
		ResultSet rs=null;
		//aplicamos un list
		List<ClassCamionetas> Listar=new ArrayList<ClassCamionetas>();
		//asignamos la conexion,cadena...
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos un bucle
			while(rs.next()){
				//instanciar una clase classproducto
				ClassCamionetas clcamioneta=new ClassCamionetas();
				clcamioneta.setIdcamioneta(rs.getInt(1));
				clcamioneta.setMarca(rs.getString(2));
				clcamioneta.setModelo(rs.getString(3));
				clcamioneta.setColor(rs.getString(4));
				clcamioneta.setCantidad(rs.getInt(5));
				clcamioneta.setPrecio(rs.getDouble(6));
				clcamioneta.setFechafab(rs.getDate(7));
				//asignamos lo recuperado de la BD
				Listar.add(clcamioneta);
			}  //fin del bucle
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return Listar;
	}

	@Override
	public ClassCamionetas BuscarCamioneta(ClassCamionetas clcamion) {
		// TODO Auto-generated method stub
		//instanciamos la clase conectar...
		ConectarMYSQL conex=new ConectarMYSQL();
		//realizamos la cadena
		String sql="select * from tbl_camionetas where idcamioneta=?";
		//declaramos las interfaces para BD...
		PreparedStatement ps=null;
		ResultSet rs=null;
		//instanciamo la class producto
		ClassCamionetas clcamioneta=new ClassCamionetas();
		
		try {
			//asignamos la conexion y cadena
			ps=conex.conexionbd().prepareStatement(sql);
			//asignamos parametros
			ps.setInt(1,clcamion.getIdcamioneta());
			//ejecutamos
			rs=ps.executeQuery();
			//aplicamos un if
			if(rs.next()){
				clcamioneta.setIdcamioneta(rs.getInt(1));
				clcamioneta.setMarca(rs.getString(2));
				clcamioneta.setModelo(rs.getString(3));
				clcamioneta.setColor(rs.getString(4));
				clcamioneta.setCantidad(rs.getInt(5));
				clcamioneta.setPrecio(rs.getDouble(6));
				clcamioneta.setFechafab(rs.getDate(7));
				
			}   //fin de la condicion...
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //fin del catch..
		return clcamioneta;	
	}

	@Override
	public ClassCamionetas ValidarCamioneta(ClassCamionetas clcamion) {
		// TODO Auto-generated method stub
		return null;
	}

}
