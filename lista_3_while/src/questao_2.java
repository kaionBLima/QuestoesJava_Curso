import java.util.Scanner;
import java.util.Locale;

public class questao_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.printf("Primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.printf("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.printf("Terceiro");
			}
			else if (x > 0 && y < 0) {
				System.out.printf("Quarto");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		System.out.println("Parei.");
		
		sc.close();
	}

}
