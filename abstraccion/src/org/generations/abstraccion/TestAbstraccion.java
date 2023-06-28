package org.generations.abstraccion;

public class TestAbstraccion {

	public static void main(String[] args) {
		
		//Instancia clase automovil
		Automovil myTroquita = new Automovil();
		
		//Instancia clase motocicleta
		Motocicleta ninja = new Motocicleta();
		
		//Llamamos metodos
		
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();
		
	}

}
