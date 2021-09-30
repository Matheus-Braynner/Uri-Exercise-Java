package Application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ex1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] lados = new double[3];
		
		for (int i = 0; i < lados.length; i++) {
			lados[i] = sc.nextDouble();
		}
		
		Arrays.sort(lados);
		
		double a = lados[2];
		double b = lados[1];
		double c = lados[0];
		
		if( a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO RETANGULO");  
			}
			else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
			}
			else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
			}
			 if(a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
			}
			 else if(a == b || b == c) {
			System.out.println("TRIANGULO ISOSCELES");
			}
		}
		sc.close();
	}

}
