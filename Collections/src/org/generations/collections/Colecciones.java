package org.generations.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.generations.poo.Cliente;

public class Colecciones {

	public static void main(String[] args) {
		// Declarar arreglo

		String[] lista = new String[] { "leche", "pan", "frutas" };

		for (String productoTemp : lista) {
			System.out.println(productoTemp);
		}

		String[] habitaciones = new String[10];

		// Inicializo o asigno valores a cada indice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[8] = "109";
		habitaciones[9] = "110";

		// habitaciones[10] = "111"; Si tratamos de acceder a un elemento mas alla de
		// los elementos declarados al principio, tendremos una excepcion que solo
		// veremos cuando se ejecute el programa/

		// Cuando imprimimos un elemento que no esta definido dentro del arreglo,
		// veremos un null. Esto pasa porque para JAVA es preferible tener un elemento
		// nulo a uno indefinido.
		System.out.println(habitaciones[8]);

		// En caso de querer usar un foreach para imprimir los elementos, solo se
		// imprimiran 7 elementos. (solo itera sobre los elementos existentes).

		for (String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		} // for
		
		
		//Arraylist para contactos
		
		
		//La interfaz list almacena contactos, e instancia un arraylist para manejar los Contactos
		List<Cliente> listaDeClientes = new ArrayList<>(); 
		
		
		
		//Primero crearlos y luego agregarlos
		Cliente pedro = new Cliente("Cristian", "232983j", 2500.0, 1434);
		listaDeClientes.add(pedro);
		
		//Crearlos donde se agregan
		listaDeClientes.add(new Cliente("Francisco", "232983j", 2500.0, 1434));
		
		System.out.println(listaDeClientes.toArray());
		
		
		for(Cliente cliente:listaDeClientes) {
			System.out.println(cliente.nombre);
		}
		
		listaDeClientes.remove(0);
		
		for(Cliente cliente:listaDeClientes) {
			System.out.println(cliente.nombre);
		}
		
		Map<String, Cliente> reservaHabitacion = new HashMap<>();
		
		reservaHabitacion.put("101", new Cliente("Francisco", "232983j", 2500.0, 1434));
		reservaHabitacion.put("101", new Cliente("Pepe", "232s53j", 45500.0, 1993));
		
		Cliente cliente2=reservaHabitacion.get("101"); //Obtener dato hashmpa
		System.out.println(cliente2.nombre);
	}

}

/*
 * 
 * Colecciones
 * 
 * 
 * - Arrays
 * 
 * Un array es una estructura de datos linea que contiene elementos del mismo
 * tipo. La longitud de un array se establece al momento de crearlo y no puede
 * cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos.
 * Los elementos estan almacenados de forma contigua en memoria, y se puede
 * acceder a ellos a traves de un indice. Sus principales caracteristicas son:
 * 
 * 1. Tamanio fijo. 2. Acceso rapido. 3. Coste elevado para insertar o eliminar
 * elementos.
 * 
 * 
 * -ArrayList
 * 
 * Es una implemenetacion de una coleccion llamada list, interface superior, se
 * utiliza muchi para almacenar elementos de una forma dinamica, tamaño
 * dinámico. Las principales caracteristicas de un arrayList son: 1.Tamaño
 * dinamico 2.Acceso rapido
 * 
 -HashMap
 
 Implementacion de la interfaz Map de Java, que permite que la información se almacena en pares clave-valor.
 1.- Almacenamiento K y V
 2.- Sin orden especifico
 3.- Busqueda rapida
 4.- Iteración rapida
 5.- No sincronizado (hilo)
 */
