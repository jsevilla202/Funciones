package funciones;

import java.util.Scanner;

public class Ej8 {
	public static double calculadora(double n1, double n2, int menu) {
		double resultado=0;
		switch(menu) {
		case 1-> resultado=n1+n2;
		case 2-> resultado=n1-n2;
		case 3-> resultado=n1*n2;
		case 4-> resultado=n1/n2;
		default->System.out.println("ERROR: El valor no está dentro del menú");
		}
		
		return(resultado);
	}

	public static void main(String[] args) {
		double n1;
		double n2;
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Interte un número entero: ");
		n1 = sc.nextDouble();
		
		System.out.print("Interte otro número entero: ");
		n2 = sc.nextDouble();
		
		System.out.println("¿Qué acción desea realizar?\n 1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División");
		System.out.print("Inserte aquí su respuesta: ");
		menu = sc.nextInt();
		
		System.out.println(calculadora(n1, n2, menu));
		sc.close();

	}

}
