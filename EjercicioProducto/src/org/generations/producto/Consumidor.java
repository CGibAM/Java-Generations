package org.generations.producto;

public class Consumidor extends Producto {

	public Consumidor(String nombre, Double precio) {
		super(nombre, precio);
	}

	public static void main(String[] args) {
		Producto producto = new Producto("Cojín", 500.0d);
		Producto producto2 = new Producto("Mantel", 600.0d);
		
		producto.imprimirInfo();
		producto.aplicarDto(5);
		
		producto2.imprimirInfo();
		producto2.aplicarDto(10);

	}

}