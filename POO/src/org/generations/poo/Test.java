package org.generations.poo;

public class Test {

	public static void main(String[] args) {
		Empleado federico = new Empleado("Federico", "fede@gmail.com", 35, "1234568", "ABC-123", 
				"332456am", "Botones");
		
		federico.mostrarInfo();
		
		//Instancia cliente
		Cliente gibran = new Cliente("Gibran", "ABCD1234", 175875.00, 1234);
		
		gibran.mostrarInfoCliente();
		
		//Modificacón atributo
		gibran.nombre = "Pancho";
		//gibran.setSaldo(0.00);
		gibran.setCuenta("DCBA123");
		
		gibran.mostrarInfoCliente();
		
		
	}

}
