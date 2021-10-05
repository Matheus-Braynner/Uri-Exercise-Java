package Application;
import java.util.Locale;
import java.util.Scanner;

public class ex1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		for (int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			if (n > 0) {
				count++;
			}
		}
		System.out.printf("%d valores positivos%n", count);
		sc.close();
	}

}
