package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 6.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio06{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        
        if (numero != 1){
            JOptionPane.showMessageDialog(null, "Diferente de 1 !!");

        }else{
            JOptionPane.showMessageDialog(null, "Igual a 1 !!");
        }
    }
}