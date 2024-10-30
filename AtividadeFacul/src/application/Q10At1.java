package application;

import java.util.Scanner;
import entities.Q10At1program;

public class Q10At1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q10At1program compra = new Q10At1program();

		System.out.print("Digite o valor total da compra: R$ ");
		compra.valorTotal = sc.nextDouble();

		compra.exibirPrestacoes();

		sc.close();
	}
}
