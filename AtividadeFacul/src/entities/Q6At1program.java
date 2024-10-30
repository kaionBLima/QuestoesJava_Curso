package entities;

public class Q6At1program {
    private int valorA;
    private int valorB;

    public Q6At1program(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void definirValores(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void trocarValores() {
        int auxiliar = valorA;
        valorA = valorB; 
        valorB = auxiliar;
    }

    public void exibirValores() {
        System.out.println("A = " + valorA);
        System.out.println("B = " + valorB);
    }
}
