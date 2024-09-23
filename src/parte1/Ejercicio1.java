package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double numero = 0;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario que ingrese un numero
		System.out.println("Introduzca un número"); 
		
		//El usuario ingresa el numero
		numero = sc.nextDouble();
		
		/* El programa saca por pantalla el texto "Ha escrito el numero" 
		y escribe el numero escrito anteriormente */
		System.out.println("Ha escrito el número: " + numero );
		
		sc.close();
	}

}