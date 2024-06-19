package diafinal;

import java.util.Scanner;

public class atv9mais1 {

	public static void main(String[] args) {
		int contador =0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < 20; i++) {
			System.out.print("Insira um número: ");
			int numero = scanner.nextInt();
			if (numero > 8) {
				contador++;
			}
		}
			
		System.out.println("Quantidade de números maiores do que 8: " + contador);
	}
}
	



