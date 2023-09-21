package Modelo.Vehiculos.Web;

import java.util.Date;

public class ClassCamionetas {
	private int Idcamioneta;
	private String marca;
	private String modelo;
	private String color;
	private int cantidad;
	private double precio;
	private Date fechafab;
	
	public ClassCamionetas() {
	}
	
	public ClassCamionetas(int idcamioneta, String marca, String modelo, String color, int cantidad, double precio,
			Date fechafab) {
		this.Idcamioneta = idcamioneta;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fechafab = fechafab;
	}

	public int getIdcamioneta() {
		return Idcamioneta;
	}

	public void setIdcamioneta(int Idcamioneta) {
		this.Idcamioneta = Idcamioneta;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public Date getFechafab() {
		return fechafab;
	}

	public void setFechafab(Date fechafab) {
		this.fechafab = fechafab;
	}
}
