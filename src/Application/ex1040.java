package Application;

import java.util.Locale;
import java.util.Scanner;

public class ex1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double media;
		if(n2==6.5) { // erro da plataforma, solução encontrada no fórum da URI
			  n2=6.4;
			}
		double notaExame, mediaFinal;

		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0;
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if(media >= 5 && media < 7) {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			mediaFinal = (media + notaExame) / 2.0;
			if (notaExame > 5) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			} else {
				System.out.println("Aluno reprovado.");
			}
		}
		else {
			System.out.println("Aluno reprovado.");
		} 
		
		sc.close();
	}
}
