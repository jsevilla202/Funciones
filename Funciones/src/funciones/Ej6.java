package funciones;

import java.util.Scanner;

public class Ej6 {
	
	public static boolean esPrimo(int n) {
		boolean primo = true;
		
		for(int i = 1, k = 0; i!=n;i++) {
			//Si el resto del número introducido entre el contador es 0, se le suma 1 a la variable "k"
			if(n%i==0) {
				k++;
				//Si la variable "k" llega a 3, ya no es primo por lo que nombramos la variable "primo" falsa y salimos del bucle con break
				if(k>=3) {
					primo = false;
					break;
				}
			}
	}
		if(primo==false){
			return false;
		}
		else {
			return true;
		}
	}
		
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Interte un número entero: ");
		n = sc.nextInt();
		
		System.out.println(esPrimo(n));
		sc.close();

	}

}
