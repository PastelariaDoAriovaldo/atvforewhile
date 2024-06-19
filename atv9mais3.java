package diafinal;

import java.util.Scanner;

public class atv9mais3 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			if (numero >= 0 && numero <= 100) {
				contador++;
			}
		}
		System.out.println("Quantidade de números entre 0 a 100: " + contador);
			
		}
	
	
}