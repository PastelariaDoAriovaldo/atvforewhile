package diafinal;

import java.util.Scanner;

public class atv3 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String userName = ler.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println("turn down for what, " + userName + "!");
        }
    }
}
	


