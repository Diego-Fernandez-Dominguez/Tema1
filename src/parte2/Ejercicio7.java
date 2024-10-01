package parte2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Creo la variable para guardar el numero de entrada de los adultos
		int adultos;
		
		//Creo la variable para guardar el numero de entradas infantiles
		int infantiles;

		//Creo la variable para guardar la suma del precio de las entradas adultas e infantiles
		double total;
		
		//Creo una constante para guardar el precio de las entradas adultas
		final int PRECIO_ADUL = 20; 
		
		//Creo una constante para guardar el precio de las entradas infantiles
		final double PRECIO_INFAN = 15.50;
		
		//Creo una constante para guardar el descuento de las entradas
		final double DESCUENTO = 0.05;
		
		//Creo el escaner para leer por teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca las entradas de adultos
		System.out.println("Introduzca las entradas de adultos");
		
		//Lo introduce
		adultos = sc.nextInt();
		
		//Pido al usuario que introduzca las entradad infantiles
		System.out.println("Introduzca las entradas infantiles");
		
		//Lo introduce
		infantiles = sc.nextInt();
		
		//Calculo la suma de ambos tipos de entrada, multiplicando la cantidad por el precio y sumandolas.
		total  = (adultos*PRECIO_ADUL) + (infantiles*PRECIO_INFAN);
		
		//Compruebo si se le puede aplicar el descuento al total. Si se puede, lo aplico
		total = total >= 100 ? (total-(total * DESCUENTO)) : total ;
		
		//Saco el resultado por pantalla
		System.out.println("El precio total seria de: " + total);
		
		//Cierro el escaner
		sc.close();
		
	}
}
