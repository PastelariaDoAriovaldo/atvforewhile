package diafinal;

import java.util.Scanner;

public class atv6 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int somaIdades = 0;
	    
	    for (int i = 0; i < 20; i++) {
	      System.out.print("Idade da pessoa " + (i + 1) + ": ");
	      int idade = ler.nextInt();
	      somaIdades += idade;
	    }

	    System.out.println("A soma das idades é: " + somaIdades);
	  }
	}


