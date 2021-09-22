package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPecas, qtdPecas, codPecas2, qtdPecas2;
		double valorPecas, valorPecas2, total;
		
		codPecas = sc.nextInt();
		qtdPecas = sc.nextInt();
		valorPecas = sc.nextDouble();
		codPecas2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valorPecas2 = sc.nextDouble();
		
		total = qtdPecas * valorPecas + qtdPecas2 * valorPecas2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
