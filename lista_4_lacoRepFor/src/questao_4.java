import java.util.Scanner;
import java.util.Locale;

public class questao_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for (int i = 0;i < n; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			
			if(num2 == 0) {
				System.out.printf("Divisão impossível");
			}
			else {
			System.out.printf("%.1f", num1/num2);
		}
		}
		
		sc.close();
	}

}
