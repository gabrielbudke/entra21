package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 9. Solicite ao usuário um texto e utilizando o while apresente caracter por caracter.
 *    
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
        String textoParaDesestruturar = JOptionPane.showInputDialog("Qual texto deseja desestruturar?");

        int index = 0;
        while (index < textoParaDesestruturar.length()) {
            System.out.println(textoParaDesestruturar.charAt(index));
            index++;
        }

    }
}
