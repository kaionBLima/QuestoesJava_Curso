package application;

import java.util.Scanner;
import entities.Q5At1program;
import java.util.Locale;

public class Q5At1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Q5At1program media = new Q5At1program();
		
		System.out.println("Insira o nome do aluno: ");
		media.nome = sc.nextLine();
		
		System.out.println("Insira as 3 notas do aluno: ");
		media.nota1 = sc.nextDouble();
		media.nota2 = sc.nextDouble();
		media.nota3 = sc.nextDouble();
		
		System.out.printf("Nome: " + media.nome);
		System.out.println();
		System.out.printf("Média = %.2f", media.mediaNota());
		
		sc.close();
	}

}
