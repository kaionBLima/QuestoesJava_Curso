package application;

import java.util.Scanner;
import java.util.Locale;
import entities.salarioFuncionario;

public class prog_salarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		salarioFuncionario salFunc = new salarioFuncionario();
		System.out.println("Nome: ");
		salFunc.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		salFunc.salarioBruto = sc.nextDouble();
		System.out.println("Taxa/Desconto do Salário: ");
		salFunc.taxa = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Funcionário: " + salFunc);
		System.out.println();
		System.out.print("Qual a porcentagem de aumento para este funcionário: ");
		double porcentagem = sc.nextDouble();
		
		salFunc.aumentoPorcenSalario(porcentagem);
		
		System.out.print("Dados atualizados do Funcionário: " + salFunc);
		sc.close();
		
	}

}
