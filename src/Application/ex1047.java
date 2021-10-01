package Application;

import java.util.Scanner;

public class ex1047 {

	public static void main(String[] args) {
		//   MY SOLUCTION X INDIAN SOLUCTION
		 
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		int duracaoHoras = horaFinal - horaInicial;

		if (duracaoHoras < 0) {
			duracaoHoras = 24 + (horaFinal - horaInicial);
		}
		
		int duracaoMinutos = minutoFinal - minutoInicial;
		
		if (duracaoMinutos < 0) {
			duracaoMinutos = 60 +(minutoFinal - minutoInicial);
			duracaoHoras--;
			 if(duracaoHoras < 0) {
	                duracaoHoras = 23;
	            }
		}
		
		if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
			System.out.println("O JOGO DUROU 24 HORA (S) E 0 MINUTO (S)");
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO (S)%n", duracaoHoras, duracaoMinutos);
		}
		sc.close();
		
		 
		/*Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();

		if (minutoFinal < minutoInicial) {
			minutoFinal += 60;
			horaFinal -= 1;
			minutoFinal -= minutoInicial;
			if (horaFinal < horaInicial) {
				horaFinal += 24;
				horaFinal -= horaInicial;
			} else {
				horaFinal -= horaInicial;
			}
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horaFinal, minutoFinal);
		}
		
		else if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)%n");
		}
		
		else if (minutoFinal > minutoInicial){
			minutoFinal -= minutoInicial;
			if (horaFinal < horaInicial){
				horaFinal += 24;
				horaFinal -= horaInicial;
			} else {
				horaFinal -= horaInicial;
			}
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horaFinal, minutoFinal);
		}
		sc.close();
		*/
	}

}
