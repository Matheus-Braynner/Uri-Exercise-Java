package Application;

import java.util.Scanner;

public class ex1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int maiorAb = (a + b + Math.abs(a - b)) / 2;
		int maiorAbc = (maiorAb + c + Math.abs(maiorAb - c)) / 2;
		
		System.out.println(maiorAbc + " eh o maior");
		
		sc.close();
	}

}
