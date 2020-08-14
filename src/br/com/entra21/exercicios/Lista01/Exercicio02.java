package br.com.entra21.exercicios.lista01;

import javax.swing.JOptionPane;

/**
 * 2. Calcule a quantidade de litros de água ingeridos em determinado período e o valor pago.
 * Para tal deve-se solicitar ao usuário a média da quantidade de litros ingeridos por dia, a 
 * quantidade de anos e o valor pago pela água.
 * Exemplo:
 *      - Quantidade de água: 3
 *      - Quantiade de anos consumidos: 17
 *      - Valor por Litro: R$ 9.75
 * 
 * Saída:
 *      - Quantidade de Litros consumidos: 18.615 L
 *      - Valor Total Pago: R$ 181.496, 25
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio02 {
    public static void main(String[] args) {

        double quantidadeAguaPorDia = Double.parseDouble(
            JOptionPane.showInputDialog("Quantidade de litros de água ingerido por dia: "));

        double anosConsumindo = Double.parseDouble(
            JOptionPane.showInputDialog("Anos consumindo: "));

        double valorLitro = Double.parseDouble(
            JOptionPane.showInputDialog("Valor por litro: "));


        double litrosConsumidosPorAno = (quantidadeAguaPorDia * 365) * anosConsumindo;
        double valorPago = ((valorLitro * quantidadeAguaPorDia) * 365) * anosConsumindo; 

        JOptionPane.showMessageDialog(null, 
            "Quantidade de litros consumidos: " + litrosConsumidosPorAno + 
            "\nValor total pago: R$" + valorPago);
        
    }
}