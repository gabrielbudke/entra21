package br.com.entra21.exercicios.lista01;

import javax.swing.JOptionPane;

/**
 * 3. Solicitar dois números inteiros e apresentar:
 *      a. A soma dos valores
 *      b. A subtração dos valores
 *      c. A multiplicação dos valores
 *      d. A divisão dos valores
 *      e. O produto dos valores
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio03 {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número inteiro: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número inteiro: "));

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        int produto1 = numero1 * numero2;        

        JOptionPane.showMessageDialog(null, "Primeiro número: " + numero1 +
                                            "\nSegundo número: " + numero2 +
                                            "\nSoma: " + soma + 
                                            "\nSubtração: " + subtracao + 
                                            "\nMultiplicação: " + multiplicacao + 
                                            "\nDivisão: " + divisao +
                                            "\nProduto da multiplicação (" + numero1 + " x " + numero2 + "):" + produto1);        
    }
}