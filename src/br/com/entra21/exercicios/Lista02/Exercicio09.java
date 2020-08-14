package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 9. Solicite quatros números e verifique se pode ser um quadrado.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio09{
    public static void main(String[] args) {
        
        int numero_1, numero_2, numero_3, numero_4;
        
        numero_1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Número"));
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Número"));
        numero_3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro Número"));
        numero_4 = Integer.parseInt(JOptionPane.showInputDialog("Quarto Número"));
        
        
        if(numero_1 == numero_2 && numero_2 == numero_3 && numero_3 == numero_4) {
            JOptionPane.showMessageDialog(null, "Pode ser um quadrado perfeito");
        } else {
            JOptionPane.showMessageDialog(null, "Não pode ser um quadrado");
        }

    }
}