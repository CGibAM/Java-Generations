package org.generations.ejerciciocuentaahorro;

public class PlazoFijo extends Cuenta {
	
	//Atributos 
	private Double interes;
	private String plazo;
	
	public PlazoFijo(String titular, Double cantidad, Double interes, String plazo) {
		super(titular, cantidad);
		this.interes = interes;
		this.plazo = plazo;
	}
	
	public Double importe() {
		return (super.getCantidad()*this.interes)/100;
	}
	
	@Override
	public void imprimirDatos() {
		System.out.printf("%nDatos de la cuenta: %n"
				+ "Titular: %s%n"
				+ "Plazo %s%n"
				+ "Interés: %.2f%n"
				+ "Total de interés: %.2f", super.getTitular(), this.plazo, this.interes, importe());
	}
	
}
