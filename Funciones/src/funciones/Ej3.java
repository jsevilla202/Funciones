package funciones;

import java.util.Scanner;

public class Ej3 {
	
	public static void areavolumen(double radio, double altura, int n) {
		switch(n) {
		case 1-> System.out.println(2*Math.PI*(altura+radio));
		case 2-> System.out.println(Math.PI*Math.pow(radio, 2)*altura);
		default-> System.out.println("ERROR: Valor no identificado en el menú");
		}
	}

	public static void main(String[] args) {
		double altura;
		double radio;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la altura del cilindro: ");
		altura = sc.nextDouble();
		
		System.out.print("Introduzca el radio del cilindro: ");
		radio = sc.nextDouble();
		
		System.out.print("¿Qué desea hacer?\n 1. Calcular el area\n 2. Calcular el volumen\nIntroduzca su respuesta: ");
		n = sc.nextInt();
		
		areavolumen(radio, altura, n);
		sc.close();
	}

}
