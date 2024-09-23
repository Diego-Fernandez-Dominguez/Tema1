package parte1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int nota1 = 0;

		int nota2 = 0;

		double media = 0;
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que ingrese la nota 1
		System.out.println("Introduzca la nota 1");

		// El usuario ingresa la nota 1
		nota1 = sc.nextInt();

		// Pido al usuario que ingrese ingrese la nota 2
		System.out.println("Introduzca la nota 2");

		// El usuario ingresa la nota 2
		nota2 = sc.nextInt();

		media = ((nota1 + nota2)/2);
				
		// El programa saca por pantalla el texto "La media de las dos notas es: x " //
		System.out.println("La media de las dos notas es: " + media);
		
		sc.close();
	}
}