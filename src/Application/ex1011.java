package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, pi = 3.14159, volumeEsfera;
		
		raio = sc.nextDouble();
		volumeEsfera = 4.0/3 * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volumeEsfera);
		
		sc.close();
	}

}
