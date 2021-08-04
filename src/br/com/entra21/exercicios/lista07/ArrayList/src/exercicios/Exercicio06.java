/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * 6. Desenvolver um algoritmo que crie um ArrayList para armazenar números inteiros.
 *    Solicite ao usuário 15 números e ao final apresente os números que estão 
 *    armazenados no ArrayList.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio06 {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<Integer>();              
        int numero = 0;      
        
        for (int i = 0; i < 15; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));            
            numeros.add(numero);            
        }
        
        JOptionPane.showMessageDialog(null, "Números: " + numeros);
        
    }
    
}
