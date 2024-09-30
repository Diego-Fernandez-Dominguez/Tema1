package parte2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Creo las variables
		double num1;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca un numero
		System.out.println("Introduzca un numero");
		
		//El usuario lo introduce
		num1 = sc.nextDouble();

		/* Le sumo 0,5 a num1, para saber si es mayor o menor que
		 * num1 +0.5 y, trunco el resultado. Si es mayor o igual
		   que num1 + 0.5 se redondeara al numero mas alto*/
		System.out.println((int)(num1 + 0.5));
				
		//Cierro el escaner
		sc.close();
		

	}

}
