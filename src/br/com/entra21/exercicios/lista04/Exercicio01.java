package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;

/**
 * 1. Crie um vetor para guardar 16 números inteiros. 
 *    Preencha todas as posições com números e apresente a soma destes números.
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio01 {

    public static void main(String[] args) {
        
        int[] inteiros = new int[16];

        inteiros[0] = 21;
        inteiros[1] = 52;
        inteiros[2] = 72;
        inteiros[3] = 58;
        inteiros[4] = 74;
        inteiros[5] = 87;
        inteiros[6] = 12;
        inteiros[7] = 25;
        inteiros[8] = 45;
        inteiros[9] = 3;
        inteiros[10] = 10;
        inteiros[11] = 82;
        inteiros[12] = 33;
        inteiros[13] = 87;
        inteiros[14] = 37;
        inteiros[15] = 92;

        int soma = inteiros[0] 
            + inteiros[1] 
            + inteiros[2] 
            + inteiros[3] 
            + inteiros[4] 
            + inteiros[5] 
            + inteiros[6] 
            + inteiros[7] 
            + inteiros[8] 
            + inteiros[9] 
            + inteiros[10] 
            + inteiros[11] 
            + inteiros[12] 
            + inteiros[13] 
            + inteiros[14] 
            + inteiros[15];
            
        JOptionPane.showMessageDialog(null, soma);

    }
    
}