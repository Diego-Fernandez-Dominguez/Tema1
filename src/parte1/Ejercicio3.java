package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
				
		int añoNacimiento = 0;
		int añonActual = 0;
		int edad = 0;
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que ingrese el año actual
		System.out.println("Introduzca el año actual");

		// El usuario ingresa el año actual
		añoNacimiento = sc.nextInt();

		// Pido al usuario que ingrese su año de nacimiento
		System.out.println("Introduzca su año de  nacimiento");

		// El usuario ingresa el año actual
		añonActual = sc.nextInt();

		edad = (añoNacimiento - añonActual);
				
		// El programa saca por pantalla el texto "Tienes x años " //
		System.out.println("Tienes " + edad + " años");
		
		sc.close();
	}
}