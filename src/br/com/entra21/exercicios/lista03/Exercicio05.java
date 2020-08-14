package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;
/**
 * 5. Solicite para o usuário dois números. Apresente o seguinte menu e de acordo com a 
 *    escolha deve ser apresentado a operação aritmética, isto deve ocorrer até que o 
 *    mesmo escolha a opção de sair:
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio05 {
    public static void main(String[] args) {

        String menu;

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro número: "));

        menu = "MENU" 
            + "\n| 1 | Somar" 
            + "\n| 2 | Subtrair" 
            + "\n| 3 | Multiplicar" 
            + "\n| 4 | Dividir" 
            + "\n| 5 | Sair";

        String opcao = JOptionPane.showInputDialog(null, menu, "CALCULADORA", 
            JOptionPane.QUESTION_MESSAGE, null, 
            new Object[]{
                "", "Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"
            },
            ""
        ).toString();

        while(!opcao.equals("Sair")) {

            if(opcao.equals("Somar")) {
                double soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma);

            } else if(opcao.equals("Subtrair")) {
                double subracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "Resultado da subtração: " + subracao);

            } else if(opcao.equals("Multiplicar")){
                double multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "Resultado da multiplicação: " + multiplicacao);

            } else if(opcao.equals("Dividir")) {

                if(n1 == 0 || n2 == 0) {
                    JOptionPane.showMessageDialog(null, "Não é possível fazer divisão por 0!!");
                } else {
                    double divisao = n1/n2;
                    JOptionPane.showMessageDialog(null, "Resultado da divisão: " + divisao);
                }
                    
            }
        
            opcao = JOptionPane.showInputDialog(null, menu, "CALCULADORA", 
                JOptionPane.QUESTION_MESSAGE, null, 
                new Object[] {
                    "", "Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"
                }, ""
            ).toString();

        }

        JOptionPane.showMessageDialog(null, "Obrigado por usar a calculadora!!");

    }
    
}