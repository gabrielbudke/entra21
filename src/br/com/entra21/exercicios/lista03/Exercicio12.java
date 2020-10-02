package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 12. Solicite o nome, valor, quantidade enquanto a quantidade de produtos 
 *     for menor que 5. Ao final deve-se aplicar um desconto de R$ 150,00.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio12 {
    public static void main(String[] args) {

        double valorTotalProduto = 0;

        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor unitário do produto " + nomeProduto + "?"));
        int qtdProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual quantidade do produto [" + nomeProduto + "] você deseja cadastrar?" 
            + "\n(Qtd do produto precisa ser MENOR que 5 para terminar o programa)"));

        while (qtdProduto > 5) {

            valorTotalProduto += qtdProduto * valorProduto;

            nomeProduto = JOptionPane.showInputDialog("Informe um novo produto:");            
            valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor unitário do produto " + nomeProduto + "?"));
            qtdProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual quantidade do produto [" + nomeProduto + "] você deseja cadastrar?"
                + "\n(Qtd do produto precisa ser MENOR que 5 para terminar o programa)"));                                

        }

        double valorDesconto = 150.00;

        valorTotalProduto = valorTotalProduto - valorDesconto;

        JOptionPane.showMessageDialog(null, "Total da compra c/ R$150.00 de desconto: " + valorTotalProduto, "EXERCÍCIO 11", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
