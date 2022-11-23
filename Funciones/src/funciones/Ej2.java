package funciones;

import java.util.Scanner;

public class Ej2 {
	
	public static void rango(int n1, int n2) {
		for(int i =n1; i<=n2; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		n1 = sc.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		n2 = sc.nextInt();
		
		if(n2>n1) {
			rango(n1, n2);
		}
		else {
			rango(n2, n1);
		}
		
		sc.close();

	}

}
