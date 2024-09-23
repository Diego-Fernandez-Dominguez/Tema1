package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
				
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que ingrese el año actual
		System.out.println("Introduzca el año actual");

		// El usuario ingresa el año actual
		int año = sc.nextInt();

		// Pido al usuario que ingrese su año de nacimiento
		System.out.println("Introduzca su año de  nacimiento");

		// El usuario ingresa el año actual
		int añonac = sc.nextInt();

		int edad = (año - añonac);
				
		// El programa saca por pantalla el texto "Tienes x años " //
		System.out.println("Tienes " + edad + " años");
		
		sc.close();
	}
}
