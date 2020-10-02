package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 13. Solicite um número e apresentar a tabuada do mesmo até 1000.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio13 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:", "TABUADA", JOptionPane.QUESTION_MESSAGE));

        System.out.println("======= TABUADA =======");

        int index = 0;        
        while (index <= 1000) {
            System.out.println(numero + " x " + index + " = " + (numero * index));
            index++;
        }
        
    }
}
