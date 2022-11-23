package funciones;

import java.util.Scanner;

public class Ej1 {
	
	public static void eco(int n){
		for(int i = 1; i<=n; i++) {
		System.out.println("Eco…");
		}
	}

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el número de veces que quiera repetir el mensaje: ");
		n = sc.nextInt();
		
		eco(n);
		sc.close();

	}

}
