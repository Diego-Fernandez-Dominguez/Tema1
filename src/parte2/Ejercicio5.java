package parte2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Creo las variables
		int segundos, minutos, minuSegundos, horas, horasMin;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca lso segundos
		System.out.println("Introduzca una cantidad de segundos");
		
		//El usuario lo introduce
		segundos= sc.nextInt();
		
		//Calculo las horas
		horas=segundos/3600;
		horasMin = segundos%3600;
		
		//Calculo los minutos
		minutos = horasMin/60;
		minuSegundos = horasMin%60;
		
		//Calculo los segundos
		segundos= minuSegundos%60;
		
		//Saco por pantalla el resultado
		System.out.println("Horas: " + horas+ "\nMinutos: " + minutos + "\nSegundos: " + segundos );

		//Cierro el escaner
		sc.close();
		
	}
}
