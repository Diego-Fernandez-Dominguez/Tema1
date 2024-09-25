package parte1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		//Creo las variables
		double peras;
		double manzanas;
		final double kiloManzana = 2.35;
		final double kiloPera = 1.95;
		double precManzanas;
		double precPeras;
		double total;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca los kilos de manzanas
		System.out.println("Cuantos kilos de manzanas has comprado");
		
		//El usuario lo introduce
		manzanas = sc.nextDouble();
		
		//Pido al usuario que introduzca los kilos de peras
		System.out.println("Cuantos kilos de peras has comprado");
		
		//El usuario lo introduce
		peras = sc.nextDouble();
		
		//Calculo el precio total de las manzanas
		precManzanas = manzanas * kiloManzana;
		
		//Calculo el precio total de las peras
		precPeras = peras * kiloPera;
		
		//Calculo el precio total 
		total = precPeras + precManzanas;
		
		//Saco el total por pantalals
		System.out.println("El precio total será de: " + total);
		
		//Cierro el escaner
		sc.close();
		
	}
}
