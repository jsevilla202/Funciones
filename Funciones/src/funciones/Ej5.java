package funciones;

import java.util.Scanner;

public class Ej5 {
	
	public static boolean vocal(String letra) {
		if(letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
		return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Interte una letra: ");
		letra = sc.next();
		letra=letra.toLowerCase();
		
		System.out.println(vocal(letra));
		sc.close();

	}

}
