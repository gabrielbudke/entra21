package br.com.entra21.exemplos.arraylist;

import java.util.ArrayList;

public class ExemploArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Retorna os valores de acordo com a posição
        System.out.println("Números:");
        System.out.println("1ª posição: " + numeros.get(0));        
        System.out.println("2ª posição: " + numeros.get(1));        
        System.out.println("3ª posição: " + numeros.get(2));     
        
        // Retorna o tamanho do ArrayList
        System.out.println("Tamanho: " + numeros.size());

        // Remove o valor de acordo do o inídce passado
        numeros.remove(1);

        for(int i = 40; i < 100; i += 10) {
            numeros.add(i);
        }

        System.out.println("Novo tamanho: " + numeros.size());

        System.out.println("Números:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        
    }
}