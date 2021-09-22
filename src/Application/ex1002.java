package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		double areaCirculo;
		raio = sc.nextDouble();
		areaCirculo = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", areaCirculo);
		
		sc.close();

	}

}
