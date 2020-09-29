package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 9. Crie um vetor para armazenar as notas de uma disciplina. A disciplina deveconter 4 notas.
 *    
 *    Solicite para o usuário o nome e as quatro notas, armazenando as notas em um vetor.
 *    Após armazenar as notas faça o cálculo da média.
 * 
 *    Apresentar as 4 notas e a média.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio09 {
    public static void main(String[] args) {

        double[] notas = new double[4];
        double total = 0;
        String textoNotas = "";

        String disciplina = JOptionPane.showInputDialog(null, "Escolha uma disciplina:", 
            "SISTEMA ESCOLA", JOptionPane.QUESTION_MESSAGE, null, 
            new Object[] { 
                "", "Português", "Matemática", "Biologia", "Física", "Inglês", "Geografia", "História"
            }, "").toString();


        for (int i = 0; i < notas.length; i++) {
            String label = "Digite a " + (i + 1) + "° nota";            
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, label, "Disciplina: " + disciplina, JOptionPane.QUESTION_MESSAGE));
            total += notas[i];
            textoNotas+= (i + 1) + "° Nota: " + notas[i] + "\n";
        }

        double media = total / notas.length;

        JOptionPane.showMessageDialog(null, "Disciplina: " + disciplina
            + "\n" + textoNotas
            + "\nMédia: " + media, 
            "BOLETIM", JOptionPane.INFORMATION_MESSAGE);
        
    }   
} 