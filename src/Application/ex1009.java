package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		double salario, vendaComissao;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendaComissao = sc.nextDouble();
		salario = salario + vendaComissao * 0.15;
			
		System.out.printf("TOTAL = R$ %.2f%n", salario);
		sc.close();
	}

}
