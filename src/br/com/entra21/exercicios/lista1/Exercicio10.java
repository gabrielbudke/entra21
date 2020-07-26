package br.com.entra21.exercicios.lista1;

import javax.swing.JOptionPane;

/**
 * 10. Solicite o ano de nascimento do usuário e apresente ao final a idade do mesmo.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));

        int idadeAtual = 2018 - anoNascimento;

        JOptionPane.showMessageDialog(null, "A sua idade em 2018 é: " + idadeAtual);

    }
}