package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 11.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio11{
    public static void main(String[] args){

        //Notas 
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4: "));
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog("Nota 5: "));    
        //Media
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        if(media <= 5.99){
            JOptionPane.showMessageDialog(null, "   Boletim "
            + "\nNota 1| " + nota1
            + "\nNota 2| " + nota2
            + "\nNota 3| " + nota3
            + "\nNota 4| " + nota4
            + "\nNota 5| " + nota5            
            + "\nStatus| Reprovado");
        }else if(media <=7.99){
            JOptionPane.showMessageDialog(null, "   Boletim "
            + "\nNota 1| " + nota1
            + "\nNota 2| " + nota2
            + "\nNota 3| " + nota3
            + "\nNota 4| " + nota4
            + "\nNota 5| " + nota5            
            + "\nStatus| Recuperação");
        }else{
            JOptionPane.showMessageDialog(null,"   Boletim "
            + "\nNota 1| " + nota1
            + "\nNota 2| " + nota2
            + "\nNota 3| " + nota3
            + "\nNota 4| " + nota4
            + "\nNota 5| " + nota5 
            + "Situação| Aprovado");
        }

    }
}