package org.generations.poo;

/*
 * Trabajar con poo
 * Para trabajar con clases en java:
 * - Primero nuestras propiedades o atributos de clase
 * - De ser necesario, se crea un constructor (Java provee uno vacio por defecto)
 * - Creación de metodos para la clase (funcionalidad)
 * - Overloading: Metodos con el mismo nombre que reciben diferentes parametros y pueden implementar 
 * 		funcionalidad totalmente diferente uno de otro
 */


public class Persona {
	// Atributos

	public String nombre;
	public Integer edad;
	public String correo;
	public String telefono;

	// Constructor

	public Persona(String nombre, String correo, Integer edad, String telefono) {
		this.correo = correo;
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	//Constructor con tres parametros
	public Persona(String nombre, Integer edad, String correo) {
		this.nombre= nombre;
		this.edad = edad;
		this.correo = correo;
	}

	// Metodos(funcionalidad)
	public void mostrarInfo() {

		System.out.format(
				"El nombre del usuario es %s%n" + "Su edad es %d%n" + "Su correo es %s%n" + "Su telefono es %s%n",
				this.nombre, this.edad, this.correo, this.telefono);
	}


	public static void main(String[] args) {
		Persona pepito = new Persona("Pepito", "pepitoElMalo@hotmail.com", 15, "33152378");
		pepito.mostrarInfo();

		Persona cristian = new Persona("Cristian", "Cristian123@hotmail.com", 29, "12345678");
		cristian.mostrarInfo();

		Persona fulanito = new Persona("Fulanito", "fulanito_333@hotmail.com", 25, "3318275475");
		fulanito.mostrarInfo();

	}

}
