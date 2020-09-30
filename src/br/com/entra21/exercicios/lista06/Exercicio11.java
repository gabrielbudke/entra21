package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 11. Solicitar 5 nomes para o usuário armazenando ao vetor.
 * 
 *     Exemplo do vetor de nomes:
 *     ______________________________________________________
 *     | Lucas  |  Paula   |  Lúcia  |  Pedro  |  Jennifer  |
 *     |________|__________|_________|_________|____________|
 * 
 *     Apresentar da seguinte forma os nomes:
 *      Lucas, Paulo, Lúcia, Pedro e Jennifer.    
 * 
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio11 {
    public static void main(String[] args) {

        String textoNomes = "";
        
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Informe um nome:");

            if((i + 2) == nomes.length) {                
                textoNomes += nomes[i] + " e ";
            } else if((i + 1) == nomes.length) {
                textoNomes += nomes[i] + ".";
            } else {
                textoNomes += nomes[i] + ", ";
            }

        }        

        JOptionPane.showMessageDialog(null, "Nomes: " + textoNomes);
        
    }
}
