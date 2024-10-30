package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Q7At1program;

public class Q7At1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Q7At1program converter = new Q7At1program();
		
		System.out.println("Digite a temperatura em ºC: ");
		converter.celsius = sc.nextDouble();
		
		System.out.print("Temperatura em Fahrenheit: " + converter.conversaoFahrenheit());
		
		sc.close();
	}

}
