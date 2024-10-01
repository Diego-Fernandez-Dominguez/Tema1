package parte2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Creo la variable para guardar los segundos
		int segundos;
		
		//Creo la variable para guardar los minutos
		int minutos;
		
		//Creo la variable para guardar el resto de los minutos
		int minuSegundos;
		
		//Creo la variable para guardar las horas
		int horas;
		
		//Creo la variable para guardar el resto de las horas
		int horasMin;
		
		//Creo el escaner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca los segundos
		System.out.println("Introduzca una cantidad de segundos");
		
		//El usuario lo introduce
		segundos= sc.nextInt();
		
		//Calculo las horas y su resto
		horas=segundos/3600;
		horasMin = segundos%3600;
		
		//Calculo los minutos y su resto
		minutos = horasMin/60;
		minuSegundos = horasMin%60;
		
		//Calculo los segundos utilizando el resto de los minutos
		segundos= minuSegundos%60;
		
		//Saco por pantalla el resultado
		System.out.println("Horas: " + horas+ "\nMinutos: " + minutos + "\nSegundos: " + segundos );

		//Cierro el escaner
		sc.close();
		
	}
}
