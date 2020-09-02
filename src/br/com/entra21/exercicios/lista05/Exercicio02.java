package br.com.entra21.exercicios.lista05;
/**
 * 2. Faça um algoritmo que apresente todas as tabuadas de 1 até 10, conforme abaixo:
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio02 {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            for(int j=0; j<=10; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }

            System.out.println("\n");
        }

        
    }
}