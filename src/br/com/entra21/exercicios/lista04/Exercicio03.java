package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;
/**
 * 3. Crie dois vetores para guardar o nome e preço de 7 produtos e apresente o 
 *    nome e preço dos ​sete produtos.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio03 {
    public static void main(String[] args) {

    double[] precos = new double[7];

    precos[0] = 25.50;
    precos[1] = 47.78;       
    precos[2] = 25.58;
    precos[3] = 19.50;
    precos[4] = 71.99;
    precos[5] = 35.50;    
    precos[6] = 48.25;   

    String[] produtos = new String[7];
    
    produtos[0] ="bolo nega maluca".toUpperCase(); 
    produtos[1] ="bolo de prestigio".toUpperCase();     
    produtos[2] ="bolo de cenoura".toUpperCase(); 
    produtos[3] ="pizza napolitana".toUpperCase(); 
    produtos[4] ="pizza portuguesa".toUpperCase(); 
    produtos[5] ="pizza calabresa".toUpperCase(); 
    produtos[6] ="pizza baco".toUpperCase();
    
    JOptionPane.showMessageDialog(null, "Cardápio:"
            + "\nBolo: " + produtos[0] + " - Preço: " + precos[0]
            + "\nBolo: " + produtos[1] + " - Preço: " + precos[1]
            + "\nBolo: " + produtos[2] + " - Preço: " + precos[2]
            + "\nPizza: " + produtos[3] + " - Preço: " + precos[3]
            + "\nPizza: " + produtos[4] + " - Preço: " + precos[4]
            + "\nPizza: " + produtos[5] + " - Preço: " + precos[5]
            + "\nPizza: " + produtos[6] + " - Preço: " + precos[6]);
            
    }

}
   
