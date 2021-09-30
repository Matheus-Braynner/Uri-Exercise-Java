package Application;

import java.util.Scanner;

public class ex1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horarioInicial = sc.nextInt();
		int horarioFinal = sc.nextInt();
		int duracao;
		
		if (horarioInicial >= horarioFinal) {
			duracao = 24 + horarioFinal - horarioInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		} else {
			duracao = horarioFinal - horarioInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		}
		sc.close();
	}

}
