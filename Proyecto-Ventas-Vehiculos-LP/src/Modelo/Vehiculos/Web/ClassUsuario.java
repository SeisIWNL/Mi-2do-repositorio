package Modelo.Vehiculos.Web;

public class ClassUsuario {
	//declaramos sus atributos...
		private int idusuario;
		private String usuario;
		private String password;
		
		
		//declaramos sus metodo getter y setter...
		
		public int getIdusuario() {
			return idusuario;
		}
		public void setIdusuario(int idusuario) {
			this.idusuario = idusuario;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		//constructores...
		public ClassUsuario(String usuario, String password) {
			//super();
			this.usuario = usuario;
			this.password = password;
		}   //fin del constructor con dos  parametros...
		
		public ClassUsuario(){
			
		}   //fin del constructor vacio...
		public ClassUsuario(int idusuario, String usuario, String password) {
		//	super();
			this.idusuario = idusuario;
			this.usuario = usuario;
			this.password = password;
		}//fin del constructor con tres parametros.
		
		
	
		

}//fin de la clase...
