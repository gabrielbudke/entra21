package br.com.entra21.exemplos.joptionpane;

import javax.swing.JOptionPane;

public class ExemploJOptionPaneMessage {
    public static void main(String[] args) {
        
        String turma = "Java";
        String professor = "Francisco Lucas";

        String informacaoCurso = "Turma: " + turma + "\nProfessor: " + professor;

        JOptionPane.showMessageDialog(null, informacaoCurso);

    }
}