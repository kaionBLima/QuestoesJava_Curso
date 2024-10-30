package application;

import java.util.Scanner;
import entities.Q6At1program;

public class Q6At1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();

		Q6At1program conversao = new Q6At1program(A, B);

		conversao.trocarValores();
		System.out.println("Após a troca:");
		conversao.exibirValores();

		sc.close();
	}
	

}
