package br.com.entra21.exercicios.lista04;

import javax.swing.JOptionPane;
/**
 * 4. Crie dois vetores para guardar o nome e preço de 7 produtos e apresente o 
 *    nome e preço dos ​sete produtos. 
 *    
 *    Crie um vetor para armazenar as notas de uma disciplina. A disciplina deve 
 *    conter 4 notas. Solicite para o usuário o nome e as quatro notas, armazenando 
 *    as notas em um vetor, realize a média destas notas e apresente.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio04 {
    public static void main(String[] args) {

        double[] notas = new double[4];
        String aluno;
        
        aluno = JOptionPane.showInputDialog("Nome do aluno: ");

        notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Nota 1: ")); 
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Nota 2: ")); 
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Nota 3: ")); 
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog("Nota 4: ")); 

        double soma = notas[0] + notas[1] + notas[2] + notas[3];
        double media = soma / notas.length;

        System.out.println("Aluno: " + aluno 
            + "\nMédia: " + media);
 
    }
    
}