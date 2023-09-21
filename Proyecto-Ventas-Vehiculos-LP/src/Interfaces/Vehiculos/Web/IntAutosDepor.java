package Interfaces.Vehiculos.Web;

import java.util.List;

import Modelo.Vehiculos.Web.ClassAutosDepor;

public interface IntAutosDepor {
	//declaramos los metodos 
		void RegistrarAutosDepor(ClassAutosDepor clauto);
		void ActualizarAutosDepor(ClassAutosDepor clauto);
		void EliminarAutosDepor (ClassAutosDepor clauto);
		List<ClassAutosDepor> ListarAutosDepor();
		ClassAutosDepor BuscarAutosDepor(ClassAutosDepor clauto);
		ClassAutosDepor ValidarAutosDepor(ClassAutosDepor clauto);

}
