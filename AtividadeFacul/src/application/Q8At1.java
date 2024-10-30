package application;

import java.util.Scanner;
import entities.Q8At1program;

public class Q8At1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Q8At1program conversao = new Q8At1program();
		
		System.out.println("Digite o valor da cotação do dolar: ");
		conversao.cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dólares disponível U$: ");
		conversao.dolar = sc.nextDouble();
		
		System.out.printf("Valor dos dólares em reais: R$%.2f", conversao.conversaoReal());
		
		sc.close();
	}

}
