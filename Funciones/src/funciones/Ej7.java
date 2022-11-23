package funciones;

import java.util.Scanner;

public class Ej7 {
	
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
	
	public static int divisoresprimos(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				if(esPrimo(i)==true) {
					c++;
				}
			}
		}
		return(c);
	}
	

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Interte un número entero: ");
		n = sc.nextInt();
		
		System.out.println(divisoresprimos(n));
		sc.close();

	}

}
