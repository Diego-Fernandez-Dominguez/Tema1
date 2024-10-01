package parte2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Creo la variable para guardar el numero introducido por el usuario
		int num1; 
		
		//Creo la variable para guardar el resto
		int resto;
		
		//Creo la variable para guardar la comprobacion del resto
		int comprobacion;
		
		//Creo la constante para guardar el multiplo
		final int MULTIPLO=7;
		
		//Creo el escaner para leer teclado
		Scanner sc = new Scanner (System.in);
		
		//Le pido al usuario que introduzca un numero entero
		System.out.println("Introduzca un numero entero: ");
		
		//Lo introduce
		num1= sc.nextInt();
		
		//Calculo el resto del numeor
		resto= num1 % MULTIPLO;
		
		/* Verifico si el resto de numero es cero, si es asi guardo
		 * la variable como cero, si no es asi resto el multiplo
		   con el resto, para que me diga cuanto le falta*/
		comprobacion = (resto==0) ? 0 : (MULTIPLO - resto);
		
		//Saco por pantalla el resultado
		System.out.println("A tu numero (" + num1 + ") habria que sumarle " + comprobacion + " para que sea multiplo de " + MULTIPLO);
		
		//Cierro el escaner
		sc.close();
		
	}
}
