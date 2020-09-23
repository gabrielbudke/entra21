package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 1. Desenvolver um programa que armazene 25 nomes, para tal utilize 
 *    um vetor com 25 posições e o comando for​ para armazenar os valores.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio01 {
    public static void main(String[] args) {
            
        String[] nomes = new String[25];

        // Solicita as informações para serem armazenadas no array
        for(int i = 0; i < nomes.length; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da " + i + "ª posição:");
        }

        // Apresenta as informações do array
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }

        System.out.println(nomes);



    }
    
}
