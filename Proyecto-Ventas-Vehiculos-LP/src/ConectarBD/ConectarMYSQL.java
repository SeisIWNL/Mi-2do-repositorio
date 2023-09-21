package ConectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarMYSQL {
	//declaramos unas variables y asignamos valores
			String url="jdbc:mysql://localhost:3306/bdvehiculoshar2023";
			String usuario="root";
			String password="";
			Connection con;
			
			
			//creamos el metodo conecta base de datos..
			public Connection conexionbd(){
				try {
					Class.forName("com.mysql.jdbc.Driver");
					//aplicamos la clase para conectarnos con la base datos
					//con su metodo getconnection...
					con=DriverManager.getConnection(url,usuario,password);
					
					//aplicamos una condicion y emitimos un mensaje por consola
					if(con!=null) JOptionPane.showMessageDialog(null,"Conexion Exitosa con la BD!!!!",
							"MENSAJE",JOptionPane.INFORMATION_MESSAGE);		
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//retornamos la conexion...
				return con;
				
			}//fin del metodo 


}
