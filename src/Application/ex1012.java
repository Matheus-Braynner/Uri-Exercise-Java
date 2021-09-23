package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTrianguloRetangulo = a * c / 2.0;
		areaCirculo = 3.14159 * Math.pow(c, 2);
		areaTrapezio = (a + b) * c / 2.0;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		
		sc.close();
	}

}
