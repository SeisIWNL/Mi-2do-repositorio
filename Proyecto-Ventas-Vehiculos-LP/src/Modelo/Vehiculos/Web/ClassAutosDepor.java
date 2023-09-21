package Modelo.Vehiculos.Web;

import java.util.Date;

public class ClassAutosDepor {
	private int idauto;
	private String marca;
	private String modelo;
	private String color;
	private int cantidad;
	private double precio;
	private Date fechaFabricacion;
	
	public ClassAutosDepor() {
	}

	public ClassAutosDepor(int idauto, String marca, String modelo, String color, int cantidad, double precio,
			Date fechaFabricacion) {
		this.idauto = idauto;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fechaFabricacion = fechaFabricacion;
	}

	public int getIdauto() {
		return idauto;
	}

	public void setIdauto(int idauto) {
		this.idauto = idauto;
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

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
}
