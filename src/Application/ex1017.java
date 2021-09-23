package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tempoGasto, velocidadeMedia;
		double litrosNecessario;
		
		tempoGasto = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		litrosNecessario = (tempoGasto * velocidadeMedia) / 12.0;
		
		System.out.printf("%.3f%n", litrosNecessario);
		
		sc.close();
	}

}
