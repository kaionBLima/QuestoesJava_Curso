package application;

import java.util.Locale;
import java.util.Scanner;
import entities.retangulo;

public class prog_retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo retangulo = new retangulo();
		System.out.println("Indique a base e altura do retângulo: ");
		
		retangulo.base = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
