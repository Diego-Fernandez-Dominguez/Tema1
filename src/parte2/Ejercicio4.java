package parte2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Creo la variable para guardar el numero X
		double numX;
		
		//Creo la variable para guardar el numero A
		double numA;
		
		//Creo la variable para guardar el numero B
		double numB;
		
		//Creo la variable para guardar el numero C
		double numC;
		
		//Creo la variable para guardar el numero Y
		double numY;
		
		//Creo el escaner para leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Le pido al usuario que introduzca "A"
		System.out.println("Introduzca el numero 'A'");
		
		//El usuario lo introduce
		numA=sc.nextDouble();
		
		//Le pido al usuario que introduzca "B"
		System.out.println("Introduzca el numero 'B'");
		
		//El usuario lo introduce
		numB=sc.nextDouble();
		
		//Le pido al usuario que introduzca "C"
		System.out.println("Introduzca el numero 'C'");
		
		//El usuario lo introduce
		numC=sc.nextDouble();
		
		//Le pido al usuario que introduzca "X"
		System.out.println("Introduzca el numero 'X'");
		
		//El usuario lo introduce
		numX=sc.nextDouble();
		
		//Hago la operacion de segundo grado y guardo el resultado en "Y"
		numY= numA * Math.pow(numX, 2) + numB * numX + numC;
		
		//Saco or pantalla el resultado de "Y"
		System.out.println("El valor de 'Y' es: " + numY);
		
		//Cierro el escaner
		sc.close();
		
		
	}

}
