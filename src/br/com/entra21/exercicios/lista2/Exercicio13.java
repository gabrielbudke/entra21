package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 13. Ler dois números e apresentar qual o menor;
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio13 {
    public static void main(String[] args) {
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Número A: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Número B: "));
        
        if (n1 < n2) {
            JOptionPane.showMessageDialog(null, "Número A é menor que o Número B");
        } else {
            JOptionPane.showMessageDialog(null, "Número B é menor que o Número A");
        }

    }
}