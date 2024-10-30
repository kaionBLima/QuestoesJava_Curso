package entities;

public class Q4At1program {

	public String nome;
	public double salarioFixo;
	public double numVendasEmDinhero;
	
	public double comissao () {
		return numVendasEmDinhero * 0.15;
	}
	
	public double salarioFinal() {
		return salarioFixo + comissao();
	}
}
