package diafinal;

import java.util.Scanner;

public class atv5 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double soma = 0.0;

	    for (int i = 0; i < 10; i++) {
	      System.out.print("Insira número " + (i + 1) + ": ");
	      double numero = ler.nextDouble();
	      soma += numero;
	    }

	    System.out.printf("A soma é: ", soma);
	  }
	}


