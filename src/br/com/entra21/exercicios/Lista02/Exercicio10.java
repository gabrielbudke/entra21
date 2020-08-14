package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 10. Solicite quatro números e verifique se pode ser um retângulo.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Lado Superior"));
        int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Lado Esquerdo"));
        int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Lado Inferior"));
        int ladoD = Integer.parseInt(JOptionPane.showInputDialog("Lado Direito"));

        if (ladoA == ladoC && ladoB == ladoD && ladoA != ladoB && ladoC != ladoD) {
            JOptionPane.showMessageDialog(null, "Retangulo Perfeito!!");

        } else {  
            JOptionPane.showMessageDialog(null, "Não pode ser um retangulo");
        }

    }
}