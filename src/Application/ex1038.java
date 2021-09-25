package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÓDIGO --- ESPECIFICAÇÃO --- PREÇO");
		System.out.println("   1  --- CACHORRO QUENTE -- R$ 4.00");
		System.out.println("   2  ---    X - SALADA   -- R$ 4.50");
		System.out.println("   3  ---    X-BACON      -- R$ 5.00");
		System.out.println("   4  --- TORRADA SIMPLES -- R$ 2.00");
		System.out.println("   5  ---   REFRIGERANTE  -- R$ 1.50");
		
		int produto = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0.0;
		
		switch (produto) {
		case 1: 
			total = 4.00 * quantidade;
			break;
		case 2: 
			total = 4.50 * quantidade;
			break;
		case 3: 
			total = 5.00 * quantidade;
			break;
		case 4: 
			total = 2.00 * quantidade;
			break;
		case 5: 
			total = 1.50 * quantidade;
			break;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
