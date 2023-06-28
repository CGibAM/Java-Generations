package org.generations.abstraccion;

public abstract class Vehiculo {
	public String marca;
	public Integer año;
	
	//Metodo concreto
	public void mostrarInfo() {
		System.out.printf("Mi auto es: %s y es del año: %d", marca, año);
	}
	
	//Metodo abstracto
	public abstract void acelerar();
	
	//Metodo abstracto
	public abstract void frenar();
	
}

/*

Abstraccion

En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.


*/