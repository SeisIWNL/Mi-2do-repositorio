package Interfaces.Vehiculos.Web;

import java.util.List;

import Modelo.Vehiculos.Web.ClassMotos;

public interface IntMotosable {
	//declaramos los metodos 
		void RegistrarMotos(ClassMotos cprod);
		void ActualizarMotos(ClassMotos cprod);
		void EliminarMotos (ClassMotos cprod);
		List<ClassMotos> ListarMotos();
		ClassMotos BuscarMotos (ClassMotos cprod);
		ClassMotos ValidarMotos(ClassMotos cprod);

}//fin de la interfas 
