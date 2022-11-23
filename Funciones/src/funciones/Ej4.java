package funciones;

import java.util.Scanner;

public class Ej4 {
	
	public static int mayor(int n1, int n2) {
		if(n1<n2) {
		return n2;
		}
		else {
			return n1;
		}
		
	}

	public static void main(String[] args) {
		int n1;
		int n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Interte un número entero: ");
		n1 = sc.nextInt();
		
		System.out.print("Interte otro número entero: ");
		n2 = sc.nextInt();

		System.out.println(mayor(n1, n2));
		sc.close();
	}

}
