import java.util.Scanner;

public class questao_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.printf("SÃO MÚLTIPLOS");
		}
		else {
			System.out.printf("NÃO SÃO MÚLTIPLOS");
		}
		
		sc.close();
	}

}
