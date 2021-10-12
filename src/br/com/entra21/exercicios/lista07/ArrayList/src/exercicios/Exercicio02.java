package br.com.entra21.exercicios.lista07.ArrayList.src.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Desenvolver um algoritmo que crie um ArrayList para armazenar nomes, deve-se 
 *    armazenar 9 nomes, apresentar todos os nomes contidos no ArrayList.
 * 
 *    Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio02 {

    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        
        nomes.add("João Cleber");
        nomes.add("Pedro Henrique");
        nomes.add("Carlos Silva");
        nomes.add("Kratos");
        nomes.add("Naruto Uzumaki");
        nomes.add("Sasuke Itachi");
        nomes.add("Sakura Haruno");
        nomes.add("Vegeta");
        nomes.add("Rock Lee");        
        
        System.out.println("Nomes: " + nomes.toString());
        
        
        
        
    }
    
}
