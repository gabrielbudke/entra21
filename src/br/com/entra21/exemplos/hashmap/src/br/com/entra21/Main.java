package br.com.entra21;

import br.com.entra21.entities.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        exemplo01();
        exemplo02();
        exemplo03();
    }

    public static void exemplo01() {

        // Instancio o HashMap
        HashMap<String, Integer> idades = new HashMap<>();

        // Adiciona informações ao HashMap
        idades.put("João", 22);
        idades.put("Lucas", 15);

        if(idades.containsKey("Mateus")) {
            System.out.println("Não tem Mateus!");
        } else {
            System.out.println("Tem Matheus!");
        }

        // .get() retorna as informações pela chave que é passada dentro do parentese
        int idade = idades.get("João");
        System.out.println("A idade do João é " + idade);

        // Altera o valor de acordo com chave
        idades.put("Lucas", 27);

        // Remove de acordo com a chave
        idades.remove("Lucas");

    }

    public static void exemplo02() {
        HashMap<Integer, Produto> produtos = new HashMap<>();

        Produto cadeira = new Produto();
        cadeira.setId(1);
        cadeira.setNome("Cadeira");
        cadeira.setPreco(200.00);
        produtos.put(cadeira.getId(), cadeira);

        Produto mesa = new Produto();
        mesa.setId(2);
        mesa.setNome("Mesa");
        mesa.setPreco(2000.00);
        produtos.put(mesa.getId(), mesa);

        // Podemos utilizar um foreach para percorrer as chaves e valores do HashMap
        for (Map.Entry<Integer, Produto> produtoEntry: produtos.entrySet())  {
            int id = produtoEntry.getKey();
            Produto produto = produtoEntry.getValue();
            System.out.println("Produto: " + produto.getNome());
        }

        double soma = 0;
        for (Map.Entry<Integer, Produto> produtoEntry : produtos.entrySet()) {
            soma += produtoEntry.getValue().getPreco();
        }
        System.out.println("Soma: " + soma);



    }

    public static void exemplo03() {
        HashMap<String, List<Produto>> categorias = new HashMap<>();

        Produto carrinho = new Produto();
        carrinho.setId(1);
        carrinho.setNome("Carrinho");

        Produto boneca = new Produto();
        boneca.setId(2);
        boneca.setNome("Boneca");

        Produto mesa = new Produto();
        mesa.setId(3);
        mesa.setNome("Mesa");

        Produto cadeira = new Produto();
        cadeira.setId(3);
        cadeira.setNome("Cadeira");

        Produto armario = new Produto();
        armario.setId(4);
        armario.setNome("Armário");


        List<Produto> brinquedos = new ArrayList<>();
        brinquedos.add(carrinho);
        brinquedos.add(boneca);

        List<Produto> moveis = new ArrayList<>();
        moveis.add(cadeira);
        moveis.add(mesa);
        moveis.add(armario);

        categorias.put("Brinquedos", brinquedos);
        categorias.put("Moveis", moveis);

        System.out.println("Categorias: " + categorias);
    }
}