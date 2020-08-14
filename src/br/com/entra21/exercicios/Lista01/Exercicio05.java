package br.com.entra21.exercicios.lista1;

import javax.swing.JOptionPane;

/**
 * 5. Solicitar nome do carro, valor do carro, valor de cada parcela e a quantidade de meses 
 * em que o carro foi financiado, ao final deve ser apresentado:
 *      a. Nome do carro
 *      b. Valor do carro
 *      c. Valor de cada parcela
 *      d. Quantidade de parcelas
 *      e. Valor total do financiamento
 *      f. Diferença entre o valor total do financiamento e valor do carro
 */
public class Exercicio05 {
    public static void main(String[] args) {

        String nomeCarro = JOptionPane.showInputDialog("Nome do carro:");
        double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Valor do carro:"));
        double valorParcela = Double.parseDouble(JOptionPane.showInputDialog("Valor da parcela:"));
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de meses:"));
        
        double valorFinanciamento = valorParcela * meses;
        double diferencaValorCarroFinanciamento = valorFinanciamento - valorCarro; 

        JOptionPane.showMessageDialog(null, "Nome do carro: " + nomeCarro
                                        + "\nValor do carro: " + String.format("%.2f", valorCarro)
                                        + "\nValor da parcela: " + String.format("%.2f", valorParcela)
                                        + "\nQuantidade de parcelas: " + meses
                                        + "\nValor total do financiamento: " + String.format("%.2f", valorFinanciamento)
                                        + "\nDiferença entre valor do financiamento e valor do carro: " + String.format("%.2f", diferencaValorCarroFinanciamento));

    }

}