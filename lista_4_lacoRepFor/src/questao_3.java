import java.util.Scanner;
import java.util.Locale;

public class questao_3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int casos = sc.nextInt();
		 
		 for (int i = 0;i < casos;i++) {
			 double teste1 = sc.nextDouble();
			 double teste2 = sc.nextDouble();
			 double teste3 = sc.nextDouble();
	
			double media = (2 * teste1 + 3 * teste2 + 5 * teste3) / 10;
			 System.out.printf("%.1f", media);
		 }
		
		 sc.close();
	}

}
