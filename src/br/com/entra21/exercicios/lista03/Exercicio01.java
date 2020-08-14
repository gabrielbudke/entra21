package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 1. Solicite nomes ao usuário até que o mesmo digite fim para o nome
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio01 {

    public static void main(String[] args) {

        //Solicitar nome do usario até ele digitar fim
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");

        while(!nome.equalsIgnoreCase("fim")){
            nome = JOptionPane.showInputDialog("Digite novamente o seu nome:  " + 
                                            "\n(Para sair digite \"fim\")");            
        }            
    }
    
}