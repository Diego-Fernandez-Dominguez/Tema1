package parte2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Creo las variables
		int num1, resto, suma; 
		final int MULTIPLO;
		
		//Creo el escaner
		Scanner sc = new Scanner (System.in);
		
		//Le pido al usuario que introduzca un numero entero
		System.out.println("Introduzca un numero entero: ");
		
		//Lo introduce
		num1= sc.nextInt();
		
		//Le pido al usuario que introduzca el multiplo
		System.out.println("Introduzca el multiplo: ");
		
		//Lo introduce
		MULTIPLO= sc.nextInt();
		
		//Calculo el resto del numero
		resto= num1 % MULTIPLO;
		
		/* Verifico si el resto de numero es cero, si es asi guardo
		 * la variable como cero, si no es asi resto el multiplo
		   con el resto, para que me diga cuanto le falta*/
		suma = (resto==0) ? 0 : (MULTIPLO - resto);
		
		//Saco por pantalla el resultado
		System.out.println("A tu numero (" + num1 + ") habria que sumarle " + suma + " para que sea multiplo de " + MULTIPLO);
		
		//Cierro el escaner
		sc.close();
		
	}
}
