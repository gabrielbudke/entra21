package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 1. Solicite para o usuário um número e informe se este número é positivo ou não.
 *    Obs.: ​Lembrando que zero não é considerado um número positivo.
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