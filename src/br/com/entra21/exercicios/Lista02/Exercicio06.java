package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 6. Solicite um número e apresente se ele é diferente de 1.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio06{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        if (numero != 1){
            JOptionPane.showMessageDialog(null, "Diferente de 1!!");

        }else{
            JOptionPane.showMessageDialog(null, "Igual a 1!!");
        }
    }
}