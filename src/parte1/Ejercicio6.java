package parte1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		//Creo las variables
		
		double num1 = 0;
		double num2= 0;
		double suma= 0;
		double resta= 0;
		double multiplicacion= 0;
		double division= 0;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca el primer numero
		System.out.println("Introduca el primer numero:");
		
		//El usuario introduce el primer numero
		num1 = sc.nextDouble();
		
		//Le pido al usuario que introduzca el segundo numero
		System.out.println("Introduzca el segundo numero:");
		
		//El usuario introduce el primer numero
		num2= sc.nextDouble();
		
		/* Realiza las operaciones de suma, resta, multiplicacion y 
	 	division con los dos numeros */
		suma= num1+num2;
		resta= num1-num2;
		multiplicacion= num1*num2;
		division= num1/num2;
		
		//Pongo por pantalla los resultados
		System.out.println("La suma de los dos numeros son; " + suma );
		System.out.println("La resta de los dos numeros son; " + resta );
		System.out.println("La multiplicacion de los dos numeros son; " + multiplicacion );
		System.out.println("La division de los dos numeros son; " + division );
		
		//Cierro el escaner
		sc.close();
		

}
	
}
