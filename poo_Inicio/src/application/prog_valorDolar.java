package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class prog_valorDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? "); //Qual o valor do dolar?
		double valueDollar = sc.nextDouble();
		
		System.out.printf("How many dollars be bought? "); //Quantos dorelares você vai comprar?
		double valuePresent = sc.nextDouble();
		
		double calc = CurrencyConverter.calculator(valueDollar, valuePresent);	
		System.out.printf("Amount to be paid in reais = %.2f%n", calc);
		
		sc.close();
	}

}
