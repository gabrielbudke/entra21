package br.com.entra21.exercicios.lista2;

import javax.swing.JOptionPane;

/**
 * 8.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio08{
    public static void main(String[] args){

    String produto1 = JOptionPane.showInputDialog(
                                      "MENU"
        + "\n|Tipo         |Nome                                   |Valor"
        + "\n|Bolos        |Bolo Brigadeiro                        |R$ 29.50"
        + "\n|Bolos        |Bolo Floresta Negra                    |R$ 2.00" 
        + "\n|Bolos        |Bolo Leite com Nutella                 |R$ 29.23"
        + "\n|Bolos        |Bolo Mousse de Chocolate               |R$ 7.10"
        + "\n|Bolos        |Bolo Nega Maluca                       |R$ 19.33"
        + "\n|Doces        |Bomba de Creme                         |R$ 17.71"
        + "\n|Doces            |Bomba de Morango                   |R$ 4.82"
        + "\n|Sanduíches   |Filé Mignon c/ Fritas e Cheddar        |R$ 21.16"
        + "\n|Sanduíches   |Hambúrguer c/ queijos, champion        |R$ 12.70"
        + "\n|Pizzas       |Calabresa                              |R$ 8.98"
        + "\n|Pizzas       |Napolitana                             |R$ 0.42"
        + "\n|Pizzas       |Peruana                                |R$ 18.36"
        + "\n|Pizzas       |Portuguesa                             |R$ 27.50");

    String produto2 = JOptionPane.showInputDialog(
                                      "MENU"
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

    String produto3 = JOptionPane.showInputDialog(
                                       "MENU"
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

    double preco1 = 0;
    
        if (produto1.equalsIgnoreCase("bolo brigadeiro")){
                    preco1 = 29.50;   
        }else if (produto1.equalsIgnoreCase("bolo floresta negra")){
                    preco1 = 2.00;
        }else if (produto1.equalsIgnoreCase("bolo leite com nutella")){
                    preco1 = 29.23;
        }else if (produto1.equalsIgnoreCase("bolo mousse de chocolate")){
                    preco1 = 7.10;
        }else if (produto1.equalsIgnoreCase("bolo nega maluca")){
                    preco1 = 19.33;
        }else if (produto1.equalsIgnoreCase("bomba de creme")){
                    preco1 = 17.71; 
        }else if (produto1.equalsIgnoreCase("bomba de morango")){
                    preco1 = 4.82;
        }else if (produto1.equalsIgnoreCase("file mignon c/ fritas e cheddar")){
                    preco1 = 21.16;
        }else if (produto1.equalsIgnoreCase("hamburguer c/ queijo, champion")){
                    preco1 = 12.70;
        }else if (produto1.equalsIgnoreCase("calabresa")){
                    preco1 = 8.98;
        }else if (produto1.equalsIgnoreCase("napolitana")){
                    preco1 = 0.42;
        }else if (produto1.equalsIgnoreCase("peruana")){
                    preco1 = 18.36;
        }else if (produto1.equalsIgnoreCase("portuguesa")){
                    preco1 = 27.50;
        }else{
               
}

        double preco2 = 0;
        
        if (produto2.equalsIgnoreCase("bolo brigadeiro")){
            preco2 = 29.50;   
        }else if (produto2.equalsIgnoreCase("bolo floresta negra")){
            preco2 = 2.00;
        }else if (produto2.equalsIgnoreCase("bolo leite com nutella")){
            preco2 = 29.23;
        }else if (produto2.equalsIgnoreCase("bolo mousse de chocolate")){
            preco2 = 7.10;
        }else if (produto2.equalsIgnoreCase("bolo nega maluca")){
            preco2 = 19.33;
        }else if (produto2.equalsIgnoreCase("bomba de creme")){
            preco2 = 17.71; 
        }else if (produto2.equalsIgnoreCase("bomba de morango")){
            preco2 = 4.82;
        }else if (produto2.equalsIgnoreCase("file mignon c/ fritas e cheddar")){
            preco2 = 21.16;
        }else if (produto2.equalsIgnoreCase("hamburguer c/ queijo, champion")){
            preco2 = 12.70;
        }else if (produto2.equalsIgnoreCase("calabresa")){
            preco2 = 8.98;
        }else if (produto2.equalsIgnoreCase("napolitana")){
            preco2 = 0.42;
        }else if (produto2.equalsIgnoreCase("peruana")){
            preco2 = 18.36;
        }else if (produto2.equalsIgnoreCase("portuguesa")){
            preco2 = 27.50;
        }else{
       
}
        double preco3 =0;

        if (produto3.equalsIgnoreCase("bolo brigadeiro")){
                preco3 = 29.50;   
        }else if (produto3.equalsIgnoreCase("bolo floresta negra")){
                preco3 = 2.00;
        }else if (produto3.equalsIgnoreCase("bolo leite com nutella")){
                preco3 = 29.23;
        }else if (produto3.equalsIgnoreCase("bolo mousse de chocolate")){
                preco3 = 7.10;
        }else if (produto3.equalsIgnoreCase("bolo nega maluca")){
                preco3 = 19.33;
        }else if (produto3.equalsIgnoreCase("bomba de creme")){
                preco3 = 17.71; 
        }else if (produto3.equalsIgnoreCase("bomba de morango")){
                preco3 = 4.82;
        }else if (produto1.equalsIgnoreCase("file mignon c/ fritas e cheddar")){
                preco3 = 21.16;
        }else if (produto3.equalsIgnoreCase("hamburguer c/ queijo, champion")){
                preco3 = 12.70;
        }else if (produto3.equalsIgnoreCase("calabresa")){
                preco3 = 8.98;
        }else if (produto3.equalsIgnoreCase("napolitana")){
                preco3 = 0.42;
        }else if (produto3.equalsIgnoreCase("peruana")){
                preco3 = 18.36;
        }else if (produto3.equalsIgnoreCase("portuguesa")){
                preco3 = 27.50;
        }else{

}

        double total = preco1 + preco2 + preco3;

        JOptionPane.showMessageDialog(null, 
                                "Tipo: " + produto1 + "  " + preco1
                              + "\nTipo: " + produto2 + "   " + preco2
                              + "\nTipo: " + produto3 + "  " + preco3
                              + "\nTotal: " + total);

    }
}