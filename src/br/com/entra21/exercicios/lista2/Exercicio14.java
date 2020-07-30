package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 14.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio14{
    public static void main(String[] args){

        double nA = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor numérico: "));
        double nB = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor numérico: "));
        double nC = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor numérico: "));

        if (nA < nB && nB < nC && nC > nA){
            JOptionPane.showMessageDialog(null, "Numero A: " + nA + "\nNúmero B: " + nB + "\nNúmero C: " +nC);
        }else if (nA < nB && nB > nC && nC > nA){
            JOptionPane.showMessageDialog(null, "Numero A: " + nA + "\nNúmero B: " + nC + "\nNúmero C: " +nB);
        }else if (nA < nB && nB > nC && nC < nA){
            JOptionPane.showMessageDialog(null, "Numero A: " + nC + "\nNúmero B: " + nA + "\nNúmero C: " +nB);
        }else if (nA > nB && nB < nC && nC > nA){
            JOptionPane.showMessageDialog(null, "Numero A: " + nB + "\nNúmero B: " + nA + "\nNúmero C: " +nC);
        }else if (nA > nB && nB > nC && nC < nA){
            JOptionPane.showMessageDialog(null, "Numero A: " + nC + "\nNúmero B: " + nB + "\nNúmero C: " +nA);
        }else if (nA > nB && nB < nC && nC < nA){
            JOptionPane.showMessageDialog(null, "Numero A: " + nB + "\nNúmero B: " + nC + "\nNúmero C: " +nA);
        }
    }
}