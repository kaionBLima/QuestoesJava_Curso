package entities;

public class salarioFuncionario {

	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoPorcenSalario(double porcentagem) {
		salarioBruto += salarioBruto *(porcentagem/100.00);
	}
	
	public String toString() {
		return nome 
				+ ", $ " 
				+ String.format("%.2f", salarioLiquido());
 }

}
