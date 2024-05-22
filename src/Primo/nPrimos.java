package Primo;

import java.util.Scanner;

public class nPrimos {
	
	public static void main(String[] args) {
		
		System.out.println("ingrese un numero");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int i = 0;
		int j = 0;
		int cont = 0;
		while (i < num) {
			if (num % i == 0) {
				cont++;
			}
			i++;
		}
		if (cont == 2) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
			
		}
		
		System.out.println("Nuevo codigo");
		//
	}
		

}
