package br.com.entra21.exercicios.lista01;

import javax.swing.JOptionPane;

/**
 * 9. Solicite dois números e inverta os valores destas variáveis.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
        int aux, numero_1, numero_2;
        
        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));

        aux = numero_1;
        numero_1 = numero_2;
        numero_2 = aux;

        JOptionPane.showMessageDialog(null, "Número 1: " + numero_1 + "\nNúmero 2: " + numero_2);

    }
}