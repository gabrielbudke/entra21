package br.com.entra21;

public class Calculadora {

    // Sobre carga de metodo é quando temos dois metodos com a mesma assinatura, mas com parâmetros diferentes

    public void somar(int numeroA, int numeroB) {
        int soma = numeroA + numeroB;
        System.out.println("Soma: " + soma);
    }

    public void somar(double numeroA, double numberB) {
        double soma = numeroA + numberB;
        System.out.println("Soma: " + soma);
    }
}
