package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 3. Solicite o peso para o usuário até que o peso seja menor que 0 ou maior 
 *    que 300.00, apresente ao final a quantidade de pessoas que informaram o pesso.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio03 {
    public static void main(String[] args) {

        int totalPessoas = 0;

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: ", "PESAGEM",
        JOptionPane.QUESTION_MESSAGE));

        
        while(peso > 0 && peso < 300){
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: ", 
                "PESAGEM", JOptionPane.QUESTION_MESSAGE
            ));

            totalPessoas = totalPessoas + 1;
        }

        JOptionPane.showMessageDialog(null, "Quantidade de pessoas que informaram o peso: " + totalPessoas);
        
        
    }
    
}