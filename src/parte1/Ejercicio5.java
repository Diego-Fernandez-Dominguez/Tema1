package parte1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		double radio = 0;
		double longitud = 0;
		double area = 0;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que ingrese el radio
		System.out.println("Introduzca el radio");

		// El usuario ingresa el radio
		radio = sc.nextInt();
		
		longitud = (2 * Math.PI * radio);
		area = (Math.PI * Math.pow(radio, 2));
		
		// El programa saca por pantalla el texto  //
		System.out.println("La longitud es: " + longitud );
		System.out.println("El area es: " + area );

		sc.close();
	}
}