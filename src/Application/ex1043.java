package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double p, areaTrapezio;
		
		if (x < y + z && y < z + x && z < x + y) {
			p = x + y + z;
			System.out.printf("Perimetro = %.1f%n", p);
		} else {
			areaTrapezio = (x + y) * z / 2.0;
			System.out.printf("Area = %.1f%n", areaTrapezio);
		}
		
		sc.close();
	}

}
