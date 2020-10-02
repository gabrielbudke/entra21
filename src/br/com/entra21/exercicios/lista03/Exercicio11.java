package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 11. Solicite o nome, valor e a quantidade de produtos, enquanto o nome 
 *     for diferente de sair, ao final deve-se aplicar ao valor total da 
 *     compra um desconto de 5%.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio11 {
    public static void main(String[] args) {

        double valorTotalProduto = 0;

        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: (Digite \"Sair\" para terminar o programa)");

        while (!nomeProduto.equalsIgnoreCase("sair")) {
            int qtdProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual quantidade do produto [" + nomeProduto + "] você deseja cadastrar?"));
            double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor unitário do produto " + nomeProduto + "?"));

            valorTotalProduto += qtdProduto * valorProduto;

            nomeProduto = JOptionPane.showInputDialog("Digite um novo produto: (Digite \"Sair\" para terminar o programa)");

        }

        double valorDesconto = valorTotalProduto * (5.0/100.0);

        valorTotalProduto = valorTotalProduto - valorDesconto;

        JOptionPane.showMessageDialog(null, "Total da compra c/ 5% de desconto: " + valorTotalProduto, "EXERCÍCIO 11", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
