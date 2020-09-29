package br.com.entra21.exercicios.lista06;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 6. Crie um vetor que irá armazenar 10 números. Estes números deverão ser número aleatórios. 
 *    
 *    Ao final apresente:
 *      ➔ Todos os números armazenados;
 *      ➔ A somatória final dos números;
 *      ➔ A média dos números;
 *      ➔ Quantidade de números pares;
 *      ➔ Quantidade de números positivos;
 *      ➔ Quantidade de números ímpares;
 *      ➔ Quantidade de números negativos;
 *      ➔ Quantidade de números neutros.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio06 {
    public static void main(String[] args) {

        String arrayDeNumeros = "Números: [ ";
        Random aleatorio = new Random();
            
        int[] numeros = new int[10];
        int quantidadeNumerosPares = 0, quantidadeNumerosImpares = 0;
        int quantidadeNumerosPositivos = 0, quantidadeNumerosNegativos = 0, quantidadeNumerosNeutro = 0;
        int somaTotalDosNumeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (aleatorio.nextInt(200) + 1) - 100;            
                    
            if(i < 9) {
                arrayDeNumeros+= numeros[i] + ", ";
            } else {
                arrayDeNumeros+= numeros[i] + " ";
            }

            // Verifica número positivo e negativo
            if (numeros[i] == 0) {
                quantidadeNumerosNeutro++;
            } else if(numeros[i] > 0) {
                quantidadeNumerosPositivos++;
            } else {
                quantidadeNumerosNegativos++;
            }

            // Verifica se é par ou ímpar
            if((numeros[i] % 2) == 0) {
                quantidadeNumerosPares++;
            } else {
                quantidadeNumerosImpares++;
            }

            somaTotalDosNumeros+= numeros[i];
        }

        double media = somaTotalDosNumeros / numeros.length;

        arrayDeNumeros+= "]";        

        JOptionPane.showMessageDialog(null, arrayDeNumeros 
            + "\nNúmeros neutros: " + quantidadeNumerosNeutro
            + "\nNúmeros positivos: " + quantidadeNumerosPositivos
            + "\nNúmeros negativos: " + quantidadeNumerosNegativos
            + "\nNúmeros pares: " + quantidadeNumerosPares
            + "\nNúmeros impares: " + quantidadeNumerosImpares
            + "\nSoma: " + somaTotalDosNumeros
            + "\nMédia: " + media);
        
        
        


    }
}
