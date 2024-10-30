import java.util.Scanner;

public class questao_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0;
		int tipoComb = sc.nextInt();
		
		while (tipoComb != 4) {
			if (tipoComb == 1) {
				alcool = alcool + 1;
			}
			else if (tipoComb == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipoComb == 3) {
				diesel = diesel + 1;
			}
			else {
				System.out.println("Fora da faixa de 1 a 4. Digite novamente outro valor: ");
			}
			
			tipoComb = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
