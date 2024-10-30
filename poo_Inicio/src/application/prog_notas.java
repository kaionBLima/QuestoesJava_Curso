package application;
import java.util.Scanner;
import java.util.Locale;
import entities.notas;

public class prog_notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		notas notasAluno = new notas();
		notasAluno.nome = sc.nextLine();
		notasAluno.nota1 = sc.nextDouble();
		notasAluno.nota2 = sc.nextDouble();
		notasAluno.nota3 = sc.nextDouble();
		
		notasAluno.calculo(0);
	
		sc.close();
	}

	
}
