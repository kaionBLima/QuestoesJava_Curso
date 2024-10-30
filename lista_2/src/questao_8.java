import java.util.Scanner;
import java.util.Locale;

public class questao_8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000.0) {
			imposto = 0.0;
			System.out.printf("Isento de imposto");
		}
		else if(salario <= 3000.0) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("R$%.2f", imposto);
		}
		else if(salario <= 4500) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; 
			System.out.printf("R$%.2f", imposto);
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$%.2f", imposto);
		}
		
		sc.close();
}

}
