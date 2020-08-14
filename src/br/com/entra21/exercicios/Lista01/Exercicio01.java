package br.com.entra21.exercicios.lista1;

import javax.swing.JOptionPane;

/**
 * Enunciado:
 * 1. Solicite um número para o usuário e apresente ao final seu antecessor e o sucessor.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        int numero, antecessor, sucessor;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        antecessor = numero - 1;
        sucessor = numero + 1;

        JOptionPane.showMessageDialog(null, "Número: " + numero + 
                                            "\nSucessor: " + sucessor + 
                                            "\nAntecessor: " + antecessor);
    
    }
}