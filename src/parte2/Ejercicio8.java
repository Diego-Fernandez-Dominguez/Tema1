package parte2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Creo las variables
		int centimetros;
		double metros;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca las entradas de adultos
		System.out.println("Introduzca la longitud de la tirada en metros");
		
		//Lo introduce
		metros = sc.nextDouble();
		
		//Calculo el cambio de metros a centimetros
		centimetros = (int)(metros*100);
		
		//Saco el resultado por pantalla
		System.out.println("Se ha lanzado un total de: 3" + centimetros +"cm");
		
		//Cierro el escaner
		sc.close();
		
	}
}
