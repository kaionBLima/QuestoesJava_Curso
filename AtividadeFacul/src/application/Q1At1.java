package application;

import java.util.Scanner;

public class Q1At1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		System.out.println("Soma = " + soma);
		
		sc.close();
	}

}
