package parte2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Creo las variables
		int segundos, minutos, horas;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca lso segundos
		System.out.println("Introduzca una cantidad de segundos");
		
		//El usuario lo introduce
		segundos= sc.nextInt();
		
		//Calculo los minutos
		minutos= segundos/60;
		
		//Calculo las horas
		horas=segundos/3600;
		
		//Saco por pantalla el resultado
		System.out.println("Segundos: " + segundos + "\n Minutos: " + minutos + "\n Horas: " + horas);

		//Cierro el escaner
		sc.close();
		
	}
}
