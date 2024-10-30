package entities;

public class notas {

		public String nome;
		public double nota1;
		public double nota2;
		public double nota3;
		
		public void calculo(double media) {
			 media = nota1 + nota2 + nota3;
			 
		  if (media >= 100*0.6) {
			 System.out.println("Final Grade: " + media);
			 System.out.println("PASS");
		}	
		  else {
			  System.out.println("Final Grade: " + media);
			  System.out.println("FAILED");
			  System.out.println("Faltam " + (60 - media) + " pontos");
			 }
}
}