package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 12. Ler dois números e apresentar qual o maior.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio12 {
    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Número A: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Número B: "));

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "Número A maior que Número B");
        } else {
            JOptionPane.showMessageDialog(null, "Número B maior que Número A");
        }
    }
}