package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 14. Solicite um número e faça o fatorial deste número, utilizando while
 */
public class Exercicio14 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
        int numeroCopia = numero;
        
        int fatorial = numero;
        while (numero > 1) {                         
            fatorial = fatorial * (numero - 1);            
            numero--;          
        }
        
        JOptionPane.showMessageDialog(null, "O fatorial de " + numeroCopia + " é: " + fatorial, "FATORIAL", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
