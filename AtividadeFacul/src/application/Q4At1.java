package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Q4At1program;

public class Q4At1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Q4At1program questao = new Q4At1program();
		
		System.out.println("Insina seu nome: ");
		questao.nome = sc.nextLine();
		
		System.out.println("Insira o valor fixo do seu Salário: ");
		questao.salarioFixo = sc.nextDouble();
		
		System.out.println("Insira o número de vendas efetuadas em dinheiro: ");
		questao.numVendasEmDinhero = sc.nextDouble();
		
		System.out.println("Nome: " + questao.nome);
		System.out.printf("Salario fixo: R$%.2f", questao.salarioFixo);
		System.out.println();
		System.out.printf("Salario final: R$%.2f", questao.salarioFinal());
		
		sc.close();

	}

}
