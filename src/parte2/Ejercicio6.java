package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Creo la variable para guardar los milimetros
		double milimetros;
		
		//Creo la variable para guardar los centimetros
		double centimetros;
		
		//Creo la variable para guardar los metros
		double metros;
		
		//Creo la variable para guardar la suma de las variables anteriores convertidas a cm
		double total;
		
		//Creo el escaner para que pueda leer teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca los milimetros
		System.out.println("Introduzca los milimetros");
		
		//Lo introduce
		milimetros = sc.nextDouble();
		
		//Pido al usuario que introduzca los centimetros
		System.out.println("Introduzca los milimetros");
		
		//Lo introduce
		centimetros = sc.nextDouble();
		
		//Pido al usuario que introduzca los metros
		System.out.println("Introduzca los milimetros");
		
		//Lo introduce
		metros = sc.nextDouble();
		
		//Calculo la suma, transformando los milimetros y metros a centimetros
		total  = (milimetros / 10) + (metros*100) + centimetros;
		
		//Saco el resultado por pantalla
		System.out.println("La suma de los tres numeros en centimetros es: " + total);
		
		//Cierro el escaner
		sc.close();
		
	}
}
