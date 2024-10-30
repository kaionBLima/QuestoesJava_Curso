package util;

public class CurrencyConverter {
	
	public static double calculator(double valueDollar, double valuePresent) {
		return (valueDollar * valuePresent)* 6 / 100 + (valueDollar * valuePresent);
	}
}
