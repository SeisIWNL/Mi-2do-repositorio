package Interfaces.Vehiculos.Web;

import java.util.List;

import Modelo.Vehiculos.Web.ClassCamionetas;

public interface IntCamionetable {
	//declaramos los metodos 
		void RegistrarCamioneta(ClassCamionetas clcamion);
		void ActualizarCamioneta(ClassCamionetas clcamion);
		void EliminarCamioneta(ClassCamionetas clcamion);
		List<ClassCamionetas> ListarCamioneta();
		ClassCamionetas BuscarCamioneta(ClassCamionetas clcamion);
		ClassCamionetas ValidarCamioneta(ClassCamionetas clcamion);

}
