import java.util.Locale;
import java.util.Scanner;

public class questao_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double area;
		double pi = 3.14159;
		
		area = pi * (raio * raio);
		
		System.out.printf("A = %.5f%n", area);
		
		sc.close();
	}

}
