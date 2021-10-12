package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 4. Solicite para o usuário um número e informe se este número é par ou não.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio04{
    public static void main(String[] args){

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Informe um número: "));

        if ((numero % 2) == 0){
            JOptionPane.showMessageDialog(null, "Número é Par");

        }else{
            JOptionPane.showMessageDialog(null, "Número não é Par!");
            
        }

        
    }
}