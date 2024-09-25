package parte1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		//Creo las variables
		boolean lluvia;
		final boolean biblioteca;
		boolean tareas;
		String poder;
		boolean salir;
		
		//Creo el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pregunto al usuario si esta lloviendo
		System.out.println("¿Has terminado las tareas?");
		
		//El usuario lo escribe
		tareas = sc.nextBoolean();
		
		//Pregunto al usuario si esta lloviendo
		System.out.println("¿Esta lloviendo?");
		
		//El usuario lo escribe
		lluvia = sc.nextBoolean();
		
		//Pregunto al usuario si tiene que ir a la biblioteca
		System.out.println("¿Tienes que ir a la biblioteca?");
		
		//El usuario lo escribe
		biblioteca = sc.nextBoolean();
		
		/* Compruebo si no esta lloviendo y tiene las tareas hechas, si se 
		   cumplen las dos es true o si tiene que ir a la biblioteca , que si se cumple es true.*/
		salir = (tareas&&!lluvia) || biblioteca;
				
		poder = salir ? "Puede salir a la calle" : "No puede salir a la calle" ;
		
		System.out.println(poder);
		
		sc.close();
}
}
