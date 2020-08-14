package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 2. Solicite a idade para o usuário até que ele digite uma idade maior que 128.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio02 {
    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));

        while(idade <  128){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente a sua idade: " + 
                                                                "\n(Para sair digite uma idade maior que 128)"));
        }
        
    }

}