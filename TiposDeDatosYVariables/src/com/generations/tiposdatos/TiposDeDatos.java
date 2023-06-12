package com.generations.tiposdatos;

public class TiposDeDatos {

	public static void main(String[] args) {
//		System.out.println("Hello world");
		
		//byte = valor numerico de 8 bits
		
		byte salas = 10;
		
		System.out.println(salas);
		
		//short = represenetar valor umerico de 16 bytes
		
		short asientos = 1120;
		
		System.out.println(asientos);
		
		//int= almacenar valor numerico de 32 bits
		
		int dulces = 34766;
		
		System.out.println(dulces);
		
		//long= representa un valor numerico de 54 bits
		
		long clientes = 313600;
		
		System.out.println(clientes);
		
		//datos que pueden tener punto decimal
		
		//float: Sirve para almacenar valores numericos de 32 bits
		
		float palomitas = 35.5f;
		
		System.out.println(palomitas + " kg de palomitas");
		
		//double = representa valor numerico de 64 bits
		
		double ganancia = 23770880.7;
		
		System.out.println(ganancia);
		
		//boolean = para valores booleanos
		//char = para caracteres alfanumericos
		
		//casting, para convertir tipos de datos de uno mas grande a uno las pequeño
		
		double ice = 59.7d;
		int iceInt = (int)ice;
		
		System.out.println(iceInt);
		
		long numlong = (long)ice;
		
		System.out.println("long "+ numlong);
		
		String cantidad ="85";
		
		String precio = "59.8";
		
		int cantEntero= Integer.parseInt(cantidad);
		
		double precioDouble = Double.parseDouble(precio);
		
		System.out.println("El valor de la compra es: "+ (cantEntero * precioDouble)+ "pesos");
		
		//Operadores aritmeticos
		
		int dias = 28;
		dias += 2;
		System.out.format("Dias %d", dias);
		
		int p =0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
		//Operadores relacionales
		
		int a = 10;
		int b = 15;
		int c = a;
		
		boolean resultado = (a !=b);
		String resultado2 = ((a == c) ? "igual":"diferente");
		
		
	}

}
