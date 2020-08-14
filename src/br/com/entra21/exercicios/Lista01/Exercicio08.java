package br.com.entra21.exercicios.lista1;

import javax.swing.JOptionPane;

/**
 * 8. Desenvolver um algoritmo que solicite a conta de luz, conta de água , valor da NET,
 * valor da Vivo, valor da Oi, valor do IPTU, valor do IPVA e o valor do seguro do carro
 * e apresentar as seguintes informações:
 *      > Valor das contas de Telefone;
 *      > Valor dos impostos;
 *      > Valor do restante das contas;
 *      > Valor Total de todas as contas.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        double valorLuz = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta de luz:"));
        double valorAgua = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta de água:"));
        double valorNet = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta da Net:"));
        double valorVivo = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta da Vivo:"));
        double valorOi = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta da Oi:"));
        double valorIptu = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta do IPTU:"));
        double valorIpva = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta do IPVA:"));
        double valorSeguroCarro = Double.parseDouble(JOptionPane.showInputDialog("Valor do seguro do carro:"));

        double valorContaTelefone = valorNet + valorOi + valorVivo;
        double valorImpostos = valorIptu + valorIpva;
        double valorDemaisContas = valorSeguroCarro + valorAgua + valorLuz;

        JOptionPane.showMessageDialog(null, 
            "Total das contas de telefone: " + valorContaTelefone 
            + "\nTotal dos impostos: " + valorImpostos
            + "\nTotal das demais contas: " + valorDemaisContas
            + "\n-----------------------------------"
            + "\nValor total das contas: " + (valorContaTelefone + valorImpostos + valorDemaisContas), 
            "CONTAS", JOptionPane.INFORMATION_MESSAGE);

    }
}