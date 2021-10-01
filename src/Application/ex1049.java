package Application;

import java.util.Scanner;

public class ex1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String p1 = sc.next();
		String p2 = sc.next();
		String p3 = sc.next();
		
		if (p1.equalsIgnoreCase("vertebrado")) {
			if (p2.equalsIgnoreCase("ave")) {
				if (p3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (p2.equalsIgnoreCase("mamifero")) {
					if (p3.equalsIgnoreCase("onivoro")) {
						System.out.println("homem");
					} else {
						System.out.println("vaca");
					}
				}
			}
		}
		
		if (p1.equalsIgnoreCase("invertebrado")) {
			if (p2.equalsIgnoreCase("inseto")) {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (p2.equalsIgnoreCase("anelideo")) {
					if (p3.equalsIgnoreCase("hematofago")) {
						System.out.println("sanguessuga");
					} else {
						System.out.println("minhoca");
					}
				}
			}
		}
		
		sc.close();
	}

}
