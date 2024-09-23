package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario que ingrese su edad
		System.out.println("Introduzca su edad"); 
		
		//El usuario ingresa su edad
		int edad = sc.nextInt();
		
		/* El programa saca por pantalla el texto "Su edad el proximo año será: " 
		y escribe su edad + 1 */
		System.out.println("Su edad el proximo año será: " + (edad+1) );
		
		sc.close();
	}

}


