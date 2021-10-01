package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salarioAjustado = 0.0, reajuste;
		double salarioFuncionario = sc.nextDouble();
		
		if (salarioFuncionario > 0 && salarioFuncionario <= 400) {
			reajuste = salarioFuncionario * 0.15;
			salarioAjustado = salarioFuncionario + reajuste;
			System.out.printf("Novo salario: %.2f%n", salarioAjustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		} else if (salarioFuncionario > 400 && salarioFuncionario <= 800) {
			reajuste = salarioFuncionario * 0.12;
			salarioAjustado = salarioFuncionario + reajuste;
			System.out.printf("Novo salario: %.2f%n", salarioAjustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		} else if (salarioFuncionario > 800 && salarioFuncionario <= 1200) {
			reajuste = salarioFuncionario * 0.1;
			salarioAjustado = salarioFuncionario + reajuste;
			System.out.printf("Novo salario: %.2f%n", salarioAjustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		} else if (salarioFuncionario > 1200 && salarioFuncionario <= 2000) {
			reajuste = salarioFuncionario * 0.07;
			salarioAjustado = salarioFuncionario + reajuste;
			System.out.printf("Novo salario: %.2f%n", salarioAjustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		} else {
			reajuste = salarioFuncionario * 0.04;
			salarioAjustado = salarioFuncionario + reajuste;
			System.out.printf("Novo salario: %.2f%n", salarioAjustado);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		sc.close();
	}

}
