package br.com.entra21.exemplos.joptionpane;

import javax.swing.JOptionPane;

public class ExemploJOptionPaneInput {
    public static void main(String[] args) {
        
        String mensagem;

        // Permite entradas de dados
        String nome = JOptionPane.showInputDialog("Nome:");
        String sobrenome = JOptionPane.showInputDialog("Sobrenome:");
        String nomeCompleto = nome + " " + sobrenome;

        /* O método JOptionPane.showInputDialog retorna um valor do tipo String. 
        *  portanto é necessário realizar o cast para o tipo da váriavel que 
        *   deseja armzenar a informaçao 
        */ 
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));

        mensagem = "Nome Completo: " + nomeCompleto 
                + "\nIdade: " + idade;

        JOptionPane.showMessageDialog(null, mensagem);

    }
}