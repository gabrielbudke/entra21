package br.com.entra21.exercicios.lista1;

import javax.swing.JOptionPane;

/**
 * 6. Desenvolver um algoritmo que solicite quatro notas e apresente a média ao final.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio06 {
    public static void main(String[] args) {
        
        String boletim = "";

        double nota_1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));
        double nota_2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
        double nota_3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3: "));
        double nota_4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4: "));

        double media =  (nota_1 + nota_2 + nota_3 + nota_4) / 4;

        boletim = "Nota 1: " + nota_1 + 
                "\nNota 2: " + nota_2 + 
                "\nNota 3: " + nota_3 + 
                "\nNota 4: " + nota_4 +
                "\nMédia Final: " + media; 

        JOptionPane.showMessageDialog(null, boletim);
    }
}