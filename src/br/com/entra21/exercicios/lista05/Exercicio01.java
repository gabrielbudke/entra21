package br.com.entra21.exercicios.lista05;

import javax.swing.JOptionPane;
/**
 * 1. Faça um algoritmo que apresente a tabuada de acordo com o número informado:
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio01 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
    }
    
}