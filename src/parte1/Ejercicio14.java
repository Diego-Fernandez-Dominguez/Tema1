package parte1;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		//Creo las variables
		int nota1;
		int nota2;
		int nota3;
		double media;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca las notas del primer trimestre
		System.out.println("Introduzca la nota del primer trimestre");
		
		//El usuario lo introduce
		nota1 = sc.nextInt();
		
		//Pido al usuario que introduzca las notas del primer trimestre
		System.out.println("Introduzca la nota del segundo trimestre");

		//El usuario lo introduce
		nota2 = sc.nextInt();

		//Pido al usuario que introduzca las notas del primer trimestre
		System.out.println("Introduzca la nota del tercer trimestre");

		//El usuario lo introduce
		nota3 = sc.nextInt();
		
		//Hago la media de las 3 notas
		media = ( (double)(nota1 + nota2 + nota3)) / 3;
				
		//Saco por pantalla el boletin (entero)
		System.out.println("Expediente: " + (int) media);
		
		//Saco por pantalla el expediente (decimales)
		System.out.println("Boletin: " +  media);
				
		//Cierro el escaner
		sc.close();
		

	}

}
