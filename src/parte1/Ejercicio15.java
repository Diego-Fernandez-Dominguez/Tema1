package parte1;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		
		//Creo las variables
		final double IVA= 0.21 ;
		double precio ;
		double total;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
				
		//Pido al usuario que introduzca el precio
		System.out.println("Introduzca el precio");
		
		//El usuario lo introduce
		precio = sc.nextDouble();
		
		//Calculo el precio con el IVA
		total = precio * IVA + precio;
		
		//Saco por pantala el total con IVA
		System.out.println("El precio con IVA es: " + total);
		
		//Cierro el escaner
		sc.close();

	}
}
