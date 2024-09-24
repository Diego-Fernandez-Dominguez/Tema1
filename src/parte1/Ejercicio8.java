package parte1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Creo las variables
		String nombre = "";
		int edad=0;
		
		//Creo el esaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca su nombre
		System.out.println("Escribame su nombre");
		
		//Lo introduce
		nombre = sc.nextLine();
		
		//Pido al usuario que introduzca su edad
		System.out.println("Digame su edad");
		
		//Lo introduce
		edad = sc.nextInt();
		
		//Saco los resultados por pantalla
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		//Cierro el escaner
		sc.close();
	}
}
