import java.util.Locale;
import java.util.Scanner;

public class questao_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario;
		
		salario = horas * valor;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary =  U$ %.2f%n", salario);
		
		sc.close();

	}

}
