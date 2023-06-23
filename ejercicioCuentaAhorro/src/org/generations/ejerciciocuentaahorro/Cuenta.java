package org.generations.ejerciciocuentaahorro;

public class Cuenta {
	
	//1.-Atributos
	private String titular;
	private Double cantidad;
	
	//Constructor
	public Cuenta(String titular, Double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	
	//2.-Metodo para imprimir datos
	
	public void imprimirDatos() {
		System.out.printf("Datos de la cuenta: %n"
				+ "Titular: %s%n"
				+ "Cantidad %f", titular, cantidad);
	}


	//Getters and Setters
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public Double getCantidad() {
		return cantidad;
	}


	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	

}
