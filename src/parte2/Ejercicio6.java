package parte2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Creo la variable para guardar los milimetros
		int milimetros;
		
		//Creo la variable para guardar los centimetros
		int centimetros;
		
		//Creo la variable para guardar los metros
		int metros;
		
		//Creo la variable para guardar la suma de las variables anteriores convertidas a cm
		int total;
		
		//Creo el escaner para que pueda leer teclado
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
		
		//Calculo la suma, transformando los milimetros y metros a centimetros
		total  = (milimetros / 10) + (metros*100) + centimetros;
		
		//Saco el resultado por pantalla
		System.out.println("La suma de los tres numeros en centimetros es: " + total);
		
		//Cierro el escaner
		sc.close();
		
	}
}
