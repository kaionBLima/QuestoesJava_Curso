package application;

import entities.Q3At1program;
import java.util.Scanner;
import java.util.Locale;

public class Q3At1 {
	
	public static void main(String[] arg) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Q3At1program questao = new Q3At1program();
	
	System.out.println("Insira respectivamente a distância em Km e os Litros abastecidos do seu automóvel:");
	
	questao.distancia = sc.nextDouble();
	questao.combustivel = sc.nextDouble();
	
	System.out.printf("Média = %.2f(km/L)", questao.calcConsumoMedio());
	
	sc.close();
	
	}
}
