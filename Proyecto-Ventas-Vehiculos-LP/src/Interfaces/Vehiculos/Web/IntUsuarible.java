package Interfaces.Vehiculos.Web;

import java.util.List;

import Modelo.Vehiculos.Web.ClassUsuario;

public interface IntUsuarible {
	//declaramos los metodos 
	void RegistrarUsuario(ClassUsuario clusu);
	void ActualizarUsuario(ClassUsuario clusu);
	void EliminarUsuario (ClassUsuario clusu);
	List<ClassUsuario> ListarUsuario();
	ClassUsuario BuscarUsuario(ClassUsuario clusu);
	ClassUsuario ValidarUsuario(ClassUsuario clusu);

}//fin de la interfas 
