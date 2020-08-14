package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 4. Faça um programa que solicite a quantidade de carros que o usuário deseja
 *    cadastrar, após isto solicite para o usuário o modelo, valor e ano do carro
 *    até que atinja a quantidade de carros para cadastro.
 * 
 *    Apresente ao final:
 *      ● Média do ano dos carros;
 *      ● Média do valor dos carros;
 *      ● Quantidade de carros que começam com a letra G;
 *      ● Quantidade de carros que começam com a letra A.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio04 {
    public static void main(String[] args) {
    
        String modeloCarro;
        char primeiraLetraCarro;
        int quantidadeCarrosLetraA = 0, quantidadeCarrosLetraG = 0;
        double valorDoCarro, valorTotalDosCarros = 0;
        int anoDoCarro, totalDeAnos = 0;

        int atual = 0;

        int quantidadeCarro = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de carros que você deseja cadastrar: "));
        

        while(quantidadeCarro > atual){
            
            modeloCarro = JOptionPane.showInputDialog("Digite o modelo do carro: ").trim().toUpperCase();            
            primeiraLetraCarro = modeloCarro.charAt(0);

            valorDoCarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro: "));
            valorTotalDosCarros = valorTotalDosCarros + valorDoCarro;

            anoDoCarro = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: "));
            totalDeAnos = totalDeAnos + anoDoCarro;
        
            if(primeiraLetraCarro == 'A'){
                quantidadeCarrosLetraA += 1;                

            }else if(primeiraLetraCarro == 'G'){
                quantidadeCarrosLetraG += 1;                
            }

            atual = atual + 1;
            
        }    
    
        double mediaDeAnoDosCarros = (totalDeAnos / quantidadeCarro);
        double mediaDeValorDosCarros = (valorTotalDosCarros / quantidadeCarro);

        if(quantidadeCarro == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum carro para cadastro!");
        } else {
            JOptionPane.showMessageDialog(null, "Media dos anos dos carros: " + mediaDeAnoDosCarros
                                            + "\nMedia de valores dos carros: " + mediaDeValorDosCarros
                                            + "\nQuantidade de carros que começam com a letra G: " + quantidadeCarrosLetraG
                                            + "\nQuantidade de carros que começam com a letra A: " + quantidadeCarrosLetraA);

        }

    }
    
}