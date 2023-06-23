package org.generations.test;

import org.generations.ejerciciocuentaahorro.CajaAhorro;
import org.generations.ejerciciocuentaahorro.PlazoFijo;

public class Test {

	public static void main(String[] args) {
		//Instancia 1 cuena de ahorro
		CajaAhorro instancia1 = new CajaAhorro("Cristian", 250.4);
		
		PlazoFijo instancia2 = new PlazoFijo("Cristian", 2500.0, 1.3, "20 de abril de 2024");
		
		instancia1.imprimirDatos();
		instancia2.imprimirDatos();
		
		

	}

}
