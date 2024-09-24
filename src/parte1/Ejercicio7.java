package parte1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Creo las variables
		String nombre= "";
		String direcc= "";
		int telef= 0;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pido que el usuario introduzca su nombre
		System.out.println("Digame su nombre");
		
		//El usuario lo introduce
		nombre = sc.nextLine();
		
		//Pido que el usuario introduzca su direccion
		System.out.println("Digame su direccion");
		
		//El usuario lo introduce
		direcc = sc.nextLine();
		
		//Pido que el usuario introduzca su numero de telefono
		System.out.println("Digame su numero de telefono");
		
		//El usuario lo introduce
		telef= sc.nextInt();
		
		//Saco los resultados por pantalla
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direcc);
		System.out.println("Telefono: " + telef);
		
		//Cierro el escaner
		sc.close();

		
}
}
