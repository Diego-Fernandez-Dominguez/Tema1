package parte1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		//Creo las variables
		double pesetas;
		double euros;
		
		//Creo el escaner
		Scanner sc = new Scanner (System.in);
		
		//Le pido al usuario que introduzca el numero de pesetas
		System.out.println("Introduzca un numero de pesetas");
		
		//Lo introduce
		pesetas = sc.nextInt();
		
		//Convierto las pesetas a euros
		euros = pesetas / 166;
		
		//Pongo el total por pantallas
		System.out.println(pesetas + " peseta/s son " + euros + " euro/s");
		
		//Cierro el escaner
		sc.close();
	}

}
