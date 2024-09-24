package parte1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Creo la variable
		double num;
		boolean par;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca un numero
		System.out.println("Introduzca un numero, diré true si es par: ");
		
		//El usuario lo introduce
		num = sc.nextInt();
		
		/*Si el resto es 0, es par y pone true, 
		si es resto es 0 poner false */
		par = (num%2==0);
		
		//Saco true o false por pantalla
		System.out.println(par);
		
		//Cierro el escaner
		sc.close();
		
		
	}
}
