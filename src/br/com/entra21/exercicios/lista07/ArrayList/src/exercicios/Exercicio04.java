package exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Desenvolver um algoritmo armazene dez números, apresente-os.
 *    - Remover o número que está na posição 3, apresentar os números armazenados. 
 *    - Remover o número que está na posição 4, apresentar os números armazenados e a quantidade de números que restaram no ArrayList.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio04 {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
            numeros.add(i + 1);
        }
        
        System.out.println(">> [Números]: " + numeros);
        
        // Removendo o número na 3ª posição
        numeros.remove(3);
        System.out.println(">> [Números depois da remoção de número na 3ª posição]: " + numeros);
        
        // Removendo o número na 4ª posição
        numeros.remove(4);
        System.out.println(">> [Números depois da remoção de número na 4ª posição]: " + numeros);
        
        System.out.println(">> [Quantidade de números restantes]: " + numeros.size());
                
    }
    
}
