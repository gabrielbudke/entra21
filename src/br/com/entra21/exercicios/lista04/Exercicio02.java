package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;
/**
 * 2. Crie um vetor para guardar 10 nomes e apresente os dez nomes.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio02 {
    public static void main(String[] args) {

        String[] nomes = new String[10];

        nomes[0] = "Gabriel";
        nomes[1] = "Marcos";
        nomes[2] = "Juliana";
        nomes[3] = "Andre";
        nomes[4] = "Pedro";
        nomes[5] = "Jonas";
        nomes[6] = "Kaio";
        nomes[7] = "Ian";
        nomes[8] = "Matheus";
        nomes[9] = "Kleber";
        
        JOptionPane.showMessageDialog(null, nomes[0] 
            + "\n" + nomes[1] 
            + "\n" + nomes[2] 
            + "\n" + nomes[3] 
            + "\n" + nomes[4] 
            + "\n" + nomes[5] 
            + "\n" + nomes[6] 
            + "\n" + nomes[7] 
            + "\n" + nomes[8] 
            + "\n" + nomes[9]);
                           
        

        








    }
    
}