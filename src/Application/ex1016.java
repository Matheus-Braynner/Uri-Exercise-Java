package Application;

import java.util.Scanner;

public class ex1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int distancia, diferencaMinutos;
		
		distancia = sc.nextInt();
		diferencaMinutos = (60 * distancia) / 30;
		
		System.out.printf("%d minutos%n", diferencaMinutos);
		
		sc.close();
	}

}
