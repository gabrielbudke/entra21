package br.com.entra21.exemplos.arraylist;

import java.util.ArrayList;

public class ExemploArrayList02 {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João Cleber");
        nomes.add("Kleitinho");        

        int quantidadeDeItensNoArray = nomes.size();
        System.out.println("Quantidade itens no array: " + quantidadeDeItensNoArray);

        String maiorNome = "";

        if(nomes.get(0).length() > maiorNome.length()) {
            maiorNome = nomes.get(0);
        }

        if (nomes.get(1).length() > maiorNome.length()) {
            maiorNome = nomes.get(1);            
        }

        System.out.println("O maior nome é: " + maiorNome);


        String menorNome = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

        if(nomes.get(0).length() < menorNome.length()) {
            menorNome = nomes.get(0);
        }

        if(nomes.get(1).length() < menorNome.length()) {
            menorNome = nomes.get(1);
        }

        System.out.println("O menor nome é: " + menorNome);

    }
}
