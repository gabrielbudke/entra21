package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;
/**
 * 7. Solicite a altura de 4 animais, apresente ao final a altura do animal com a menor altura.
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio07 {
    public static void main(String[] args) {
        
        double menorAltura = Double.MAX_VALUE;        
        double[] alturas = new double[4];

        alturas[0] = Double.parseDouble(JOptionPane.showInputDialog("Peso do 1º animal: "));
        alturas[1] = Double.parseDouble(JOptionPane.showInputDialog("Peso do 2º animal: "));        
        alturas[2] = Double.parseDouble(JOptionPane.showInputDialog("Peso do 3º animal: "));
        alturas[3] = Double.parseDouble(JOptionPane.showInputDialog("Peso do 4º animal: "));

        if(alturas[0] < menorAltura) {
            menorAltura = alturas[0];
        }

        if(alturas[1] < menorAltura) {
            menorAltura = alturas[1];
        }

        if(alturas[2] < menorAltura) {
            menorAltura = alturas[2];
        }

        if(alturas[3] < menorAltura) {
            menorAltura = alturas[3];
        }

        JOptionPane.showMessageDialog(null, "Animal com menor altura: " + menorAltura);

    }
    
}