package diafinal;

import java.util.Scanner;

public class atv9mais2 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			if (numero % 2 == 0) {
				contador++;
			}
		}
		System.out.println("Quantidade de números pares: " + contador);
	}

}
