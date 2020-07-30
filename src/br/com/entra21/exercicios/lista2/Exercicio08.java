package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 8. A padaria do joão necessita armazenar os pedidos dos seus clientes, cada cliente 
 * pedirá três produtos do cardápio, porém para que o cliente possa solicitar estes 
 * produtos o cardápio deve ser apresentado para ele. Ao final de o cliente solicitar os 
 * produtos, deve-se apresentar o nome dos produtos com seus valores e um totalizador.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio08 {
    public static void main(String[] args) {

        double preco_1, preco_2, preco_3;
        
        String produto_1 = JOptionPane.showInputDialog("MENU"
            + "\n|Tipo         |Nome                                   |Valor"
            + "\n|Bolos        |Bolo Brigadeiro                        |R$ 29.50"
            + "\n|Bolos        |Bolo Floresta Negra                    |R$ 2.00" 
            + "\n|Bolos        |Bolo Leite com Nutella                 |R$ 29.23"
            + "\n|Bolos        |Bolo Mousse de Chocolate               |R$ 7.10"
            + "\n|Bolos        |Bolo Nega Maluca                       |R$ 19.33"
            + "\n|Doces        |Bomba de Creme                         |R$ 17.71"
            + "\n|Doces        |Bomba de Morango                       |R$ 4.82"
            + "\n|Sanduíches   |Filé Mignon c/ Fritas e Cheddar        |R$ 21.16"
            + "\n|Sanduíches   |Hambúrguer c/ queijos, champion        |R$ 12.70"
            + "\n|Pizzas       |Calabresa                              |R$ 8.98"
            + "\n|Pizzas       |Napolitana                             |R$ 0.42"
            + "\n|Pizzas       |Peruana                                |R$ 18.36"
            + "\n|Pizzas       |Portuguesa                             |R$ 27.50");

        String produto_2 = JOptionPane.showInputDialog("MENU"
            + "\n|Tipo         |Nome                                   |Valor"
            + "\n|Bolos        |Bolo Brigadeiro                        |R$ 29.50"
            + "\n|Bolos        |Bolo Floresta Negra                    |R$ 2.00" 
            + "\n|Bolos        |Bolo Leite com Nutella                 |R$ 29.23"
            + "\n|Bolos        |Bolo Mousse de Chocolate               |R$ 7.10"
            + "\n|Bolos        |Bolo Nega Maluca                       |R$ 19.33"
            + "\n|Doces        |Bomba de Creme                         |R$ 17.71"
            + "\n|Doces        |Bomba de Morango                       |R$ 4.82"
            + "\n|Sanduíches   |Filé Mignon c/ Fritas e Cheddar        |R$ 21.16"
            + "\n|Sanduíches   |Hambúrguer c/ queijos, champion        |R$ 12.70"
            + "\n|Pizzas       |Calabresa                              |R$ 8.98"
            + "\n|Pizzas       |Napolitana                             |R$ 0.42"
            + "\n|Pizzas       |Peruana                                |R$ 18.36"
            + "\n|Pizzas       |Portuguesa                             |R$ 27.50");

        String produto_3 = JOptionPane.showInputDialog("MENU"
            + "\n|Tipo         |Nome                                   |Valor"
            + "\n|Bolos        |Bolo Brigadeiro                        |R$ 29.50"
            + "\n|Bolos        |Bolo Floresta Negra                    |R$ 2.00" 
            + "\n|Bolos        |Bolo Leite com Nutella                 |R$ 29.23"
            + "\n|Bolos        |Bolo Mousse de Chocolate               |R$ 7.10"
            + "\n|Bolos        |Bolo Nega Maluca                       |R$ 19.33"
            + "\n|Doces        |Bomba de Creme                         |R$ 17.71"
            + "\n|Doces        |Bomba de Morango                       |R$ 4.82"
            + "\n|Sanduíches   |Filé Mignon c/ Fritas e Cheddar        |R$ 21.16"
            + "\n|Sanduíches   |Hambúrguer c/ queijos, champion        |R$ 12.70"
            + "\n|Pizzas       |Calabresa                              |R$ 8.98"
            + "\n|Pizzas       |Napolitana                             |R$ 0.42"
            + "\n|Pizzas       |Peruana                                |R$ 18.36"
            + "\n|Pizzas       |Portuguesa                             |R$ 27.50");


        if (produto_1.equalsIgnoreCase("bolo brigadeiro")) {
                    preco_1 = 29.50;   
        } else if (produto_1.equalsIgnoreCase("bolo floresta negra")) {
                    preco_1 = 2.00;
        } else if (produto_1.equalsIgnoreCase("bolo leite com nutella")) {
                    preco_1 = 29.23;
        } else if (produto_1.equalsIgnoreCase("bolo mousse de chocolate")) {
                    preco_1 = 7.10;
        } else if (produto_1.equalsIgnoreCase("bolo nega maluca")) {
                    preco_1 = 19.33;
        } else if (produto_1.equalsIgnoreCase("bomba de creme")) {
                    preco_1 = 17.71; 
        } else if (produto_1.equalsIgnoreCase("bomba de morango")) {
                    preco_1 = 4.82;
        } else if (produto_1.equalsIgnoreCase("file mignon c/ fritas e cheddar")) {
                    preco_1 = 21.16;
        } else if (produto_1.equalsIgnoreCase("hamburguer c/ queijo, champion")) {
                    preco_1 = 12.70;
        } else if (produto_1.equalsIgnoreCase("calabresa")) {
                    preco_1 = 8.98;
        } else if (produto_1.equalsIgnoreCase("napolitana")) {
                    preco_1 = 0.42;
        } else if (produto_1.equalsIgnoreCase("peruana")) {
                    preco_1 = 18.36;
        } else if (produto_1.equalsIgnoreCase("portuguesa")) {
                    preco_1 = 27.50;
        } else {
            preco_1 = 0;
        }

        
        if (produto_2.equalsIgnoreCase("bolo brigadeiro")) {
            preco_2 = 29.50;   
        } else if (produto_2.equalsIgnoreCase("bolo floresta negra")) {
            preco_2 = 2.00;
        } else if (produto_2.equalsIgnoreCase("bolo leite com nutella")) {
            preco_2 = 29.23;
        } else if (produto_2.equalsIgnoreCase("bolo mousse de chocolate")) {
            preco_2 = 7.10;
        } else if (produto_2.equalsIgnoreCase("bolo nega maluca")) {
            preco_2 = 19.33;
        } else if (produto_2.equalsIgnoreCase("bomba de creme")) {
            preco_2 = 17.71; 
        } else if (produto_2.equalsIgnoreCase("bomba de morango")) {
            preco_2 = 4.82;
        } else if (produto_2.equalsIgnoreCase("file mignon c/ fritas e cheddar")) {
            preco_2 = 21.16;
        } else if (produto_2.equalsIgnoreCase("hamburguer c/ queijo, champion")) {
            preco_2 = 12.70;
        } else if (produto_2.equalsIgnoreCase("calabresa")) {
            preco_2 = 8.98;
        } else if (produto_2.equalsIgnoreCase("napolitana")) {
            preco_2 = 0.42;
        } else if (produto_2.equalsIgnoreCase("peruana")) {
            preco_2 = 18.36;
        } else if (produto_2.equalsIgnoreCase("portuguesa")) {
            preco_2 = 27.50;
        } else {
            preco_2 = 0;
        }

        if (produto_3.equalsIgnoreCase("bolo brigadeiro")) {
                preco_3 = 29.50;   
        }else if (produto_3.equalsIgnoreCase("bolo floresta negra")){
                preco_3 = 2.00;
        } else if (produto_3.equalsIgnoreCase("bolo leite com nutella")) {
                preco_3 = 29.23;
        } else if (produto_3.equalsIgnoreCase("bolo mousse de chocolate")) {
                preco_3 = 7.10;
        } else if (produto_3.equalsIgnoreCase("bolo nega maluca")) {
                preco_3 = 19.33;
        } else if (produto_3.equalsIgnoreCase("bomba de creme")) {
                preco_3 = 17.71; 
        } else if (produto_3.equalsIgnoreCase("bomba de morango")) {
                preco_3 = 4.82;
        } else if (produto_3.equalsIgnoreCase("file mignon c/ fritas e cheddar")) {
                preco_3 = 21.16;
        } else if (produto_3.equalsIgnoreCase("hamburguer c/ queijo, champion")) {
                preco_3 = 12.70;
        } else if (produto_3.equalsIgnoreCase("calabresa")) {
                preco_3 = 8.98;
        } else if (produto_3.equalsIgnoreCase("napolitana")) {
                preco_3 = 0.42;
        } else if (produto_3.equalsIgnoreCase("peruana")) {
                preco_3 = 18.36;
        } else if (produto_3.equalsIgnoreCase("portuguesa")) {
                preco_3 = 27.50;
        } else {
            preco_3 = 0;
        }

        double total = preco_1 + preco_2 + preco_3;

        JOptionPane.showMessageDialog(null, 
                                "Tipo: " + produto_1 + "  " + preco_1
                              + "\nTipo: " + produto_2 + "   " + preco_2
                              + "\nTipo: " + produto_3 + "  " + preco_3
                              + "\nTotal: " + total);

    }
}