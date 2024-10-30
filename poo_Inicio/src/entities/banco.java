package entities;
import java.util.Scanner;


public class banco {

	
	public int numberAccount;
	public String name;
	public String decisao;
	
	public boolean dec() {
	if (decisao == "y") {
		System.out.print("Enter initial deposit value: ");
	} else if (decisao == "n") {
		System.out.print("closed operation");
	}
	}
	
	public banco(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	
	
}
