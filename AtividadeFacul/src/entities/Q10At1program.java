package entities;

public class Q10At1program {

	public double valorTotal;
	
	public double calcularPrestacao() {
	  int NUM_PRESTACOES = 5;
	  return valorTotal / NUM_PRESTACOES;
	    }

	public void exibirPrestacoes() {
	   double prestacao = calcularPrestacao();
	   System.out.printf("O valor de cada prestação é: R$ %.2f%n", prestacao);
	    }
	}
