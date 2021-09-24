package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorDinheiro = sc.nextDouble();
		int valor = 0;
		
		System.out.println("NOTAS:");
		valor = (int) valorDinheiro / 100;
		System.out.printf("%d nota(s) de R$ 100.00%n", valor);
		valorDinheiro = valorDinheiro % 100.0;
		valor = (int) valorDinheiro / 50;
		System.out.printf("%d nota(s) de R$ 50.00%n", valor);
		valorDinheiro = valorDinheiro % 50.0;
		valor = (int) valorDinheiro / 20;
		System.out.printf("%d nota(s) de R$ 20.00%n", valor);
		valorDinheiro = valorDinheiro % 20.0;
		valor = (int) valorDinheiro / 10;
		System.out.printf("%d nota(s) de R$ 10.00%n", valor);
		valorDinheiro = valorDinheiro % 10.0;
		valor = (int) valorDinheiro / 5;
		System.out.printf("%d nota(s) de R$ 5.00%n", valor);
		valorDinheiro = valorDinheiro % 5.0;
		valor = (int) valorDinheiro / 2;
		System.out.printf("%d nota(s) de R$ 2.00%n", valor);
		valorDinheiro = valorDinheiro % 2.0;
		
		System.out.println("MOEDAS:");
		
		valorDinheiro = valorDinheiro * 100;
		
		valor = (int) valorDinheiro / 100;
		System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
		valorDinheiro = valorDinheiro % 100.0;
		valor = (int) valorDinheiro / 50;
		System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
		valorDinheiro = valorDinheiro % 50.0;
		valor = (int) valorDinheiro / 25;
		System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
		valorDinheiro = valorDinheiro % 25.0;
		valor = (int) valorDinheiro / 10;
		System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
		valorDinheiro = valorDinheiro % 10.0;
		valor = (int) valorDinheiro / 5;
		System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
		valorDinheiro = valorDinheiro % 5.0;
		valor = (int) valorDinheiro / 1;
		System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
		valorDinheiro = valorDinheiro % 1.0;
		
		
		
		
		
		sc.close();
	}

}
