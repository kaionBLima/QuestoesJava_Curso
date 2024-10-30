import java.util.Locale;
import java.util.Scanner;

public class questao_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valorUni1 = sc.nextDouble();
		
		int peca2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valorUni2 = sc.nextDouble();
		
		double conta;
		
		conta = (num1 * valorUni1) + (num2 * valorUni2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", conta);
		
		sc.close();
	}

}
