package parte2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Creo las variables
		double num1;
		boolean aprox;
		int redondeo;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca un numero
		System.out.println("Introduzca un numero");
		
		//El usuario lo introduce
		num1 = sc.nextDouble();
		
		/* Compruebo si el numero introducido es 
		 mayor o igual al entero de ese numero + 0,5 */
		aprox = num1 >= (int)num1 + 0.5;
		
		/* Confirma si sacar el num1 +1 o el entero 
		del numero introducido */
		redondeo = (int) (aprox ? ++num1 : num1);
				
		//Saco por pantalla el numero redondeado
		System.out.println(redondeo);
		
				
		//Cierro el escaner
		sc.close();
		

	}

}
