package Application;

import java.util.Scanner;

public class ex1044 {

	public static void main(String[] args) {
		/* Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int mod1, mod2;
		
		if (x > y) {
			mod1 = x % y;
			if (mod1 == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} else if (x < y) {
			mod2 = y % x;
			if (mod2 == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} else {
			System.out.println("Nao sao Multiplos");
		}
			
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int inv = 0;
		
		if (x < y) {
			inv = x;
			x = y;
			y = inv;
		} 
		if (x % y == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}

}
