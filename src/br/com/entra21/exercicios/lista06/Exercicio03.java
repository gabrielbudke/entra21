package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;
/**
 * 3. Desenvolver um programa que armazene preços, deve-se solicitar ao usuário a 
 *    quantidade de registros que o mesmo deseja armazenar. Após isto, solicitar os 
 *    preços de acordo com a quantidade de registros.
 * 
 *    Ao final apresentar todos os preços e o total dos preços.
 * 
 *    Observação: não deve ser solicitado o preço total e sim utilizar o vetor
 */
/**
 * @author Gabriel Sousa
 */

public class Exercicio03 {
    public static void main(String[] args) {

        int quantidadeRegistros = Integer.parseInt(JOptionPane.showInputDialog("Quantos preços você deseja cadastrar?"));

        double[] precos = new double[quantidadeRegistros];
        double total = 0;
        
        String texto = "PREÇOS CADASTRADOS:" + "\n";

        for(int i = 0; i < precos.length; i++) {
            precos[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° preço:"));

            total += precos[i];
            texto += (i + 1) + "° preço: R$" + precos[i] + "\n";
        }

        texto += "Total: R$" + total;

        JOptionPane.showMessageDialog(null, texto);

        
    }
}
