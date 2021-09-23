package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1014 {

	public static void main(String[] args) {
		 	Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int x;
			double y, consumoMedio;
			
			x = sc.nextInt();
			y = sc.nextDouble();
			
			consumoMedio = x / y;
			
			System.out.printf("%.3f km/l %n", consumoMedio);
			
			sc.close();
	}

}
