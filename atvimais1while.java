package diafinal;

import java.util.Scanner;

public class atvimais1while {
	
	public static void main(String[] args) {
		int contador = 0;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		while (i< 20) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();
			if (numero > 8) {
				contador++;
			}
			i++;
		
		}
		System.out.println("Quantidade de números maiores que 8: " + contador);
	}

}
