import java.util.Locale;
import java.util.Scanner;

public class questao_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    int d = sc.nextInt();
	    int subtracao;
	    
	    subtracao = a - b - c - d;
	    
	    System.out.printf("Diferença = " + subtracao);
	    
	    sc.close();
	}

}
