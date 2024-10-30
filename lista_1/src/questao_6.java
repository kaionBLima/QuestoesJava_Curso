import java.util.Locale;
import java.util.Scanner;

public class questao_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double triangRet = A * C / 2;
		
		double pi = 3.14159;
		double circulo = pi * (C * C);
		
		double trapezio = (A + B) * C/2;
		
		double quadrado = B * B;
		
		double retangulo = A * B;
		
		System.out.printf("TRINGULO: %.3f%n", triangRet);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETÂNGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
