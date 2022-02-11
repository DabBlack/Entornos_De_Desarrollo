package examen_01_12_21;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		String cadena = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena de caracteres: ");
		cadena = sc.next();		
		
		System.out.println("\n" + "Cadena de caracteres original: ");
		System.out.println(cadena);
		
		System.out.println("\n" + "Cadena de caracteres cambiada: ");
		cambio(cadena);
	}

	
	public static void cambio(String cadena) {
		if (cadena == "a") {
//			"a" = "b";
		}
	}
	
}
