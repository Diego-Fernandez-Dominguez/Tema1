package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Creo las variables
		int milimetros, centimetros, metros, total;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca los milimetros
		System.out.println("Introduzca los milimetros");
		
		//Lo introduce
		milimetros = sc.nextInt();
		
		//Pido al usuario que introduzca los centimetros
		System.out.println("Introduzca los milimetros");
		
		//Lo introduce
		centimetros = sc.nextInt();
		
		//Pido al usuario que introduzca los metros
		System.out.println("Introduzca los milimetros");
		
		//Lo introduce
		metros = sc.nextInt();
		
		//Calculo la suma
		total  = (milimetros / 10) + (metros*100) + centimetros;
		
		//Saco el resultado por pantalla
		System.out.println("La suma de los tres numeros en centimetros es: " + total);
		
		//Cierro el escaner
		sc.close();
		
	}
}
