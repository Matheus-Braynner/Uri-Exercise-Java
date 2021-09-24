package Application;

import java.util.Scanner;

public class ex1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idadeEmDias = sc.nextInt();
		int anos = idadeEmDias / 365;
		idadeEmDias = idadeEmDias % 365;
		int meses = idadeEmDias / 30;
		idadeEmDias = idadeEmDias % 30;
		int dias = idadeEmDias;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();
	}

}
