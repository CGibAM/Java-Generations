package com.generations.condicionalesyciclos;

import java.time.LocalDateTime;

public class CondicionalesYCiclos {

	public static void main(String[] args) {
		/*
		 * Condicionales
		 * 
		 * if 
		 * else
		 * else if 
		 * switch
		 */

		System.out.println("Programa para calcular la hora.");
		
		LocalDateTime time = LocalDateTime.now();
		
		Integer hora = time.getHour();
		
		if (hora>=6 && hora<=10) {
			System.out.println("Buenos días solecito");
		} else if (hora>=11 && hora<=18){
			System.out.println("Buenas tardes, uff que calor");
		} else if (hora>=19 && hora<=24) {
			System.out.println("Buenas noches, a mimir");
		}else {
			System.out.println("Ya es de madrugada, no hay que desvelarse");
		}
	}

}
