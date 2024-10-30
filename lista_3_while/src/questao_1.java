import java.util.Scanner;

public class questao_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int avaliaSenha = sc.nextInt();
		
		while (avaliaSenha != senha) {
			System.out.println("Senha inválida.");
			avaliaSenha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
