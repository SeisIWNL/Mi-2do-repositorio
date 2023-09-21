package Modelo.Vehiculos.Web;

import java.util.Date;

public class ClassMotos {
	//declaramos sus atributos
	private int idmoto;
	private String marca;
	private String modelo;
	private int cantidad;
	private double precio;
    private String nrochasis;
	private Date fechafabn;
	
	
	
	//constructor con parametros
	
	public ClassMotos(int idmoto, String marca, String modelo, int cantidad, double precio, String nrochasis,
			Date fechafabn) {
		super();
		this.idmoto = idmoto;
		this.marca = marca;
		this.modelo = modelo;
		this.cantidad = cantidad;
		this.precio = precio;
		this.nrochasis = nrochasis;
		this.fechafabn = fechafabn;
	}
	//constructor sin parametros 
	public ClassMotos(){
		
	}
	//metodos getters y setters 
	public int getIdmoto() {
		return idmoto;
	}
	public void setIdmoto(int idmoto) {
		this.idmoto = idmoto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNrochasis() {
		return nrochasis;
	}
	public void setNrochasis(String nrochasis) {
		this.nrochasis = nrochasis;
	}
	public Date getFechafabn() {
		return fechafabn;
	}
	public void setFechafabn(Date fechafabn) {
		this.fechafabn = fechafabn;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	

}//fin del metodo
