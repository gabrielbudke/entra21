package br.com.entra21.exemplos.joptionpane;

import javax.swing.JOptionPane;

public class ExemploJOptionPaneOption {
    public static void main(String[] args) {

        int opcao = JOptionPane.showOptionDialog(null, 
            "Selecione o menu desejado!", "MENU SISTEMA", 
            0, JOptionPane.QUESTION_MESSAGE, 
            null, new Object[] {
                "Cadastro", "Edição", "Listar"
            }, "Edição");

        if(opcao == 0) {
            System.out.println("Cadastro selecionado");
        } else if(opcao == 1) {
            System.out.println("Edição selecionado");
        } else if (opcao == 2){
            System.out.println("Listar selecionado");
        }
        
    }
}