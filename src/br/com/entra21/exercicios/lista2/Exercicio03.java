package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 3.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio03{
    public static void main(String[] args){

        int numero1 = Integer.parseInt(
            JOptionPane.showInputDialog("Primeiro Número: "));
        int numero2 = Integer.parseInt(
            JOptionPane.showInputDialog("Segundo Número: "));
            
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU"
                        + "\n1" + "      " + "Soma"
                        + "\n2" + "      " + "Subtrai"
                        + "\n3" + "      " + "Multiplica"
                        + "\n4" + "      " + "Divide"));

        if (opcao == 1){
            int soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "Soma: " + soma);

        }else if (opcao == 2){
            int sub = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "Subtração: " + sub);

        }else if (opcao == 3){
            int multiplica = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "Multiplicação: " + multiplica);

        }else if(opcao == 4){
            int divide = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "Divisão: " + divide);

        }else{
            JOptionPane.showMessageDialog(null, "Opção não disponível");
        }

        

        


                        
        
    }
}