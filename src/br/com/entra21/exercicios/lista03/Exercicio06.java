package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;
/**
 * 6. A padaria do joão necessita armazenar os pedidos dos seus clientes, cada cliente poderá 
 *    realizar quantos pedidos desejar, porém para que o cliente possa solicitar estes produtos 
 *    o cardápio deve ser apresentado para ele. 
 *    
 *    Ao final de o cliente solicitar os produtos, deve-se apresentar o total dos pedidos e a 
 *    quantidade de produtos consumidos. O critério para que não seja mais solicitado o código 
 *    do produto ao cliente é se o mesmo informar o código 16.
 * 
 *    Ao final apresentar:
 *      ● A quantidade de bolos escolhidos;
 *      ● A quantidade de doces escolhidos;
 *      ● A quantidade de Sanduíches escolhidos;
 *      ● A quantidade de pizzas escolhidas;
 *      ● A média dos produtos;
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio06 {
    public static void main(String[] args) {
        
        //Variavel preco   
        double preco = 0;
        double precoTotal = 0;
        
        //variavel qtd de produtos    
        int quantidadeTotal = 0;
        
        //Variavel qtd de bolos    
        int quantidadeBolo = 0;
        
        //Variavel qtd de doces
        int quantidadeDoce = 0;
        
        //Variavel qtd Sanduiche
        int quantidadeSanduiche = 0;
        
        //Variavel qtd Pizzas
        int quantidadePizza =0;

        // Apresentação do cardápio
        int cardapio = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione um produto:"
            + "\n|CÓDIGO            |TIPO        |NOME                                       |VALOR"
            + "\n|1                 |Bolos       |Bolo Brigadiro                             |R$ 29,50" 
            + "\n|2                 |Bolos       |Bolo Floresta Negra                        |R$ 2,00" 
            + "\n|3                 |Bolos       |Bolo Leite com Nutella                     |R$ 29,23" 
            + "\n|4                 |Bolos       |Bolo Mousse de Chocolate                   |R$ 7,10" 
            + "\n|5                 |Bolos       |Bolo Nega Maluca                           |R$ 19,33" 
            + "\n|6                 |Doces       |Bomba de Creme                             |R$ 17,71" 
            + "\n|7                 |Doces       |Bomba de Morango                           |R$ 4,82" 
            + "\n|8                 |Sanduíche   |Filé-mignon c/ fritas e cheddar            |R$ 21,16" 
            + "\n|9                 |Sanduíche   |Hambúrguer c/ queijos, champignon e rúcula |R$ 12,70" 
            + "\n|10                |Sanduíche   |Provolone com salame                       |R$ 19,70"      
            + "\n|11                |Sanduíche   |Vegetariano de beringela                   |R$ 28,22" 
            + "\n|12                |Pizzas      |Calabresa                                  |R$ 8,98" 
            + "\n|13                |Pizzas      |Napolitana                                 |R$ 0,42" 
            + "\n|14                |Pizzas      |Peruana                                    |R$ 18,36" 
            + "\n|15                |Pizzas      |Portuguesa                                 |R$ 27,50" 
            + "\n|16                |SAIR")
        );
            
            
        while (cardapio != 16) {                     
            
            //if do preço
            if(cardapio == 1) {
                preco = 29.50;
            } else if(cardapio == 2) {
                preco = 2.00;
            } else if(cardapio == 3) {
                preco = 29.23;
            } else if(cardapio == 4) {
                preco = 7.10;
            } else if(cardapio == 5) {
                preco = 19.33;
            } else if(cardapio == 6) {
                preco = 17.71;
            } else if(cardapio == 7) { 
                preco = 4.82;
            } else if(cardapio == 8) {
                preco = 21.16;
            } else if(cardapio == 9) {
                preco = 12.70;
            } else if(cardapio == 10) {
                preco = 19.70;
            } else if(cardapio == 11) { 
                preco = 28.22; 
            } else if(cardapio == 12) { 
                preco = 8.98; 
            } else if(cardapio == 13) {
                preco = 0.42; 
            } else if(cardapio == 14) { 
                preco = 18.36;
            } else if(cardapio == 15) {
                preco = 27.50;
            } else {
                preco = 0;
            };

            precoTotal = precoTotal + preco;
            quantidadeTotal = quantidadeTotal + 1;
            
            // Verifica a quantidade de bolos, doces, sanduíches e pizzas
            if (cardapio >=1 && cardapio <=5) {
                quantidadeBolo = quantidadeBolo + 1;
            } else if(cardapio == 6 || cardapio == 7) {
                quantidadeDoce = quantidadeDoce + 1;
            } else if(cardapio >= 8 && cardapio <= 11) {
                quantidadeSanduiche = quantidadeSanduiche + 1;
            } else if(cardapio >= 12 && cardapio <= 15) {
                quantidadePizza = quantidadePizza + 1;
            }


            cardapio = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione novamente um produto ou digite (16) para sair:"
                + "\n|Código            |Tipo        |Nome                                       |Valor" 
                + "\n|1                 |Bolos       |Bolo Brigadiro                             |R$ 29,50" 
                + "\n|2                 |Bolos       |Bolo Floresta Negra                        |R$ 2,00" 
                + "\n|3                 |Bolos       |Bolo Leite com Nutella                     |R$ 29,23" 
                + "\n|4                 |Bolos       |Bolo Mousse de Chocolate                   |R$ 7,10" 
                + "\n|5                 |Bolos       |Bolo Nega Maluca                           |R$ 19,33" 
                + "\n|6                 |Doces       |Bomba de Creme                             |R$ 17,71" 
                + "\n|7                 |Doces       |Bomba de Morango                           |R$ 4,82" 
                + "\n|8                 |Sanduíche   |Filé-mignon c/ fritas e cheddar            |R$ 21,16" 
                + "\n|9                 |Sanduíche   |Hambúrguer c/ queijos, champignon e rúcula |R$ 12,70" 
                + "\n|10                |Sanduíche   |Provolone com salame                       |R$ 19,70"      
                + "\n|11                |Sanduíche   |Vegetariano de beringela                   |R$ 28,22" 
                + "\n|12                |Pizzas      |Calabresa                                  |R$ 8,98" 
                + "\n|13                |Pizzas      |Napolitana                                 |R$ 0,42" 
                + "\n|14                |Pizzas      |Peruana                                    |R$ 18,36" 
                + "\n|15                |Pizzas      |Portuguesa                                 |R$ 27,50" 
                + "\n|16                |SAIR")
            );
        
        }
        
        JOptionPane.showMessageDialog(null, "Total dos pedidos: " + precoTotal 
            + "\nQuantidade de produtos: " + quantidadeTotal);
            
        JOptionPane.showMessageDialog(null, "Quantidade de Bolos: " + quantidadeBolo 
            + "\nQuantidade de Doces: " + quantidadeDoce 
            + "\nQuantidade de Sanduíches: " + quantidadeSanduiche 
            + "\nQuantidade de Pizzas: " + quantidadePizza);
    
    }
    
}