import java.util.Scanner;
import java.util.Locale;

public class questao_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double escolha = sc.nextInt();
		double valor;
		int quantidade = sc.nextInt();
		
		if (escolha == 1) {
			valor = 4.00 * quantidade;
			System.out.printf("Total: R$%.2f", valor);
	} else if (escolha == 2) {
			valor = 4.50 * quantidade;
			System.out.printf("Total: R$%.2f", valor);
	} else if (escolha == 3) {
			valor = 5.00 * quantidade;
			System.out.printf("Total: R$%.2f", valor);
	} else if (escolha == 4) {
			valor = 2.00 * quantidade;
			System.out.printf("Total: R$%.2f", valor);
	} else if (escolha == 5) {
			valor = 1.50 * quantidade;
			System.out.printf("Total: R$%.2f", valor);
	} else {
		System.out.printf("Opção Inválida!");
	}

		sc.close();
} 
}
