package parte1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		double pesetas;
		double euros;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero de pesetas");
		
		pesetas = sc.nextInt();
		
		euros = pesetas / 166;
		
		System.out.println(pesetas + " peseta/s son " + euros + " euro/s");
		
		sc.close();
	}

}
