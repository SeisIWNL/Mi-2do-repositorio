package Dao.Vehiculos.Web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ConectarBD.ConectarMYSQL;
import Interfaces.Vehiculos.Web.IntUsuarible;
import Modelo.Vehiculos.Web.ClassUsuario;

public class ClassUsuarioImp  implements IntUsuarible{

	@Override
	public void RegistrarUsuario(ClassUsuario clusu) {
		// TODO Auto-generated method stub
		
	}//fin del metodo registar usuario

	@Override
	public void ActualizarUsuario(ClassUsuario clusu) {
		// TODO Auto-generated method stub
		
	}//fin del metodo actualizar usuario

	@Override
	public void EliminarUsuario(ClassUsuario clusu) {
		// TODO Auto-generated method stub
		
	}//fin del metodo eliminar usuario 

	@Override
	public List<ClassUsuario> ListarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo listar usuario

	@Override
	public ClassUsuario BuscarUsuario(ClassUsuario clusu) {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo buscar usuario

	@Override
	public ClassUsuario ValidarUsuario(ClassUsuario clusu) {
		// instancia la clase conectar MYSQL
		ConectarMYSQL conex=new ConectarMYSQL();
String sql="select * from tbl_usuario where usuario=? and password=?";
		
		//aplicamos las interfaces predeterminada para base de datos...
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		//instanciamos la clase classusuario...
		ClassUsuario clalm=new ClassUsuario();
		//asignamos la cadena y la conxion...
		try {
			ps=conex.conexionbd().prepareStatement(sql);
			//asignar los parametros...
			ps.setString(1,clusu.getUsuario());
			ps.setString(2,clusu.getPassword());
			//realizamos la ejecucion...
			rs=ps.executeQuery();
			//aplicamos una condicion...
			if(rs.next()){
				//almacenamos los valores recuperados de la BD....
				clalm.setIdusuario(rs.getInt(1));
				clalm.setUsuario(rs.getString(2));
				clalm.setPassword(rs.getString(3));
				
			} //fin de la condicion..
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//retornamos los valores recuperados de la BD...
		return clalm;
	}  //fin del metodo validar usuario..

}//fin 
