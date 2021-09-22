package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num, numHoras;
		double salarioHora, salario;
			
		num = sc.nextInt();
		numHoras = sc.nextInt();
		salarioHora = sc.nextDouble();
		salario = salarioHora * numHoras;
		
		System.out.println("NUMBER = " + num);	
		System.out.printf("SALARY = U$ %.2f%n", salario);
			
		sc.close();
	}

}
