package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 1.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio01{
    public static void main(String[] args){

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Número: "));

        if (numero > 0){
            JOptionPane.showMessageDialog(null, "Positivo");
        }else{
            JOptionPane.showMessageDialog(null, "Não é Positivo!");
        }
        
    }
}