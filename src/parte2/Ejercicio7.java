package parte2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Creo las variables
		int adultos, infantiles;
		double total;
		final int precioAdul = 20; 
		final double precioInfan = 15.50, descuento = 0.05;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca las entradas de adultos
		System.out.println("Introduzca las entradas de adultos");
		
		//Lo introduce
		adultos = sc.nextInt();
		
		//Pido al usuario que introduzca las entradad infantiles
		System.out.println("Introduzca las entradas infantiles");
		
		//Lo introduce
		infantiles = sc.nextInt();
		
		//Calculo la suma
		total  = (adultos*precioAdul) + (infantiles*precioInfan);
		
		//Compruebo si se le puede aplicar el descuento al total
		total = total >= 100 ? (total-(total * descuento)) : total ;
		
		//Saco el resultado por pantalla
		System.out.println("El precio total seria de: " + total);
		
		//Cierro el escaner
		sc.close();
		
	}
}
