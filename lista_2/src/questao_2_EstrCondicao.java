import java.util.Scanner;

public class questao_2_EstrCondicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("PAR");
		}
		else {
			System.out.printf("IMPAR");
		}
		
		sc.close();
	}

}
