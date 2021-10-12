package br.com.entra21.exercicios.lista07.ArrayList.src.exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Desenvolver um algoritmo que crie um ArrayList para armazenar char, deve-se 
 *    armazenar 15 caracteres, apresentar todos os caracteres armazenados no ArrayList.
 * 
 *    Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        List<Character> caracteres = new ArrayList<>();
        
        caracteres.add('A');
        caracteres.add('B');
        caracteres.add('C');
        caracteres.add('D');
        caracteres.add('E');
        caracteres.add('F');
        caracteres.add('G');
        caracteres.add('H');
        caracteres.add('I');
        caracteres.add('J');
        caracteres.add('K');
        caracteres.add('L');
        caracteres.add('M');
        caracteres.add('N');
        caracteres.add('O');
        caracteres.add('P');
       
        System.out.println("Caracteres: " + caracteres.toString());
        
    }
    
}
