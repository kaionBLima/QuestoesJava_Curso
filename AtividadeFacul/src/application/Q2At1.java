package application;

import java.util.Scanner;
import java.util.Locale;

public class Q2At1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois numeros: ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		double soma = a + b;
		double subtracao = a - b;
		double divisao = a / b;
		double multiplicacao = a * b;
		
		System.out.printf("Soma = %.2f", soma);
		System.out.println();
		
		System.out.printf("Subtração = %.2f", subtracao);
		System.out.println();
		
		System.out.printf("Divisão = %.2f", divisao);
		System.out.println();
		
		System.out.printf("Multiplicação = %.2f", multiplicacao);
		
		sc.close();
	}

}
