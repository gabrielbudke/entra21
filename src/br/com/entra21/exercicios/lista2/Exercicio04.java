package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 4.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio04{
    public static void main(String[] args){

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Número: "));

        if (numero %2 == 0){
            JOptionPane.showMessageDialog(null, "Número Par");

        }else{
            JOptionPane.showMessageDialog(null, "Número não é Par!");
            
        }

        
    }
}