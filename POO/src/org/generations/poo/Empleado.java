package org.generations.poo;

/*Herencia en java (extends, al lado del nombre de la clase, despues se define el nombre de la 
 * super clase)
 * 	
 * Nos permite heredar atributos o metodos con la finalidad de reuitilizar código y generar una relacion
 * entre super clases (padres) y sub clases (hijos)
 * 
 */

public class Empleado extends Persona {

	public String numEmpleado;
	public String nss;
	public String puesto;

	public Empleado(String nombre, String correo, Integer edad, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, correo, edad, telefono);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}

	public Empleado(String nombre, Integer edad, String correo, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.format("El numerodeEmpleado del usuario es %s%n" + "Su nss es %s%n" + "Su puesto es %s%n",
				this.numEmpleado, this.nss, this.puesto);
	}

	
	//Metodo toString, que proviene de la clase padre de todos los objetos(Object), y muestra el objeto en cadena de texto
	
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto 
				+ ", nombre=" + nombre+ ", edad=" + edad + ", correo=" + correo 
				+ ", telefono=" + telefono + "]";
	}
	

}
