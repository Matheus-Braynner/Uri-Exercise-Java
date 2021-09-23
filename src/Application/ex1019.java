package Application;

import java.util.Scanner;

public class ex1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int segundos = sc.nextInt();
		
		int horas = segundos / 3600;
		segundos = segundos % 3600;
		int minutos = segundos / 60;
		segundos = segundos % 60;
		int totalSegundos = segundos;
		System.out.printf("%d:%d:%d%n", horas, minutos,totalSegundos);
		
		
		sc.close();
	}

}
