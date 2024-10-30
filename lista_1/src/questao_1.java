import java.util.Scanner;

public class questao_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma;
		
		soma = a + b;
		System.out.printf("Soma = " + soma);
		
		sc.close();
	}

}