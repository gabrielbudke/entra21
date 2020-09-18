package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;
/**
 * 5. Solicite para o usuário 5 pesos e apresente a soma total dos pesos e a média dos pesos.
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio05 {
    public static void main(String[] args) {

        double[] pesos = new double[5];

        pesos[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° peso: "));
        pesos[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° peso: "));
        pesos[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3° peso: "));
        pesos[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4° peso: "));        
        pesos[4] = Double.parseDouble(JOptionPane.showInputDialog("Digite o 5° peso: "));

        double soma = pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4];

        double media = soma / pesos.length;

        System.out.println(media);
        
        
    }


    
}