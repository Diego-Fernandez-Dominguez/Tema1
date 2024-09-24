package parte1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Creo las variables
		int edad;
		boolean mayor;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca su edad
		System.out.println("Introduzca su edad: ");
		
		//Lo introduce
		edad = sc.nextInt();
		
		/*Si la edad es mayor o igual a 18 
		es true, si no lo es es false */
		mayor = (edad >= 18);
		
		//Saco true o false por pantalla
		System.out.println(mayor);
		
		//Cierro el escaner
		sc.close();
		
		
	}
}
