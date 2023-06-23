package org.generations.ejerciciocuentaahorro;

public class CajaAhorro extends Cuenta {

	// Atributos

	// Constructor
	public CajaAhorro(String titular, Double cantidad) {
		super(titular, cantidad);

	}

	// Metodos

	@Override
	public void imprimirDatos() {
		System.out.printf("%nDatos de la cuenta: %n"
				+ "Titular: %s%n"
				+ "Cantidad %.2f%n", super.getTitular(), super.getCantidad());
		// o solo super.imprimirDatos();
	}
}
