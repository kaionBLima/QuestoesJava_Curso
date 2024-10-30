import java.util.Scanner;

public class questao_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora = 24, duracao;
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORAS", duracao);
		}
		else {
			duracao = hora - horaInicial + horaFinal;
			System.out.printf("O JOGO DUROU %d HORAS", duracao);
		}
		
		sc.close();
	}

}
