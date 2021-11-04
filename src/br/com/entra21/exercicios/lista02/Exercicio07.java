package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

/**
 * 7. Solicite um número e apresente as seguintes informações:
 *      a. Se ele é par ou ímpar ou neutro;
 *      b. Se ele é negativo ou positivo;
 *      c. Se ele é um número maior que 10;
 *      d. Se ele é um número menor ou igual a 50;
 *      e. Se ele é um número menor que -10;
 *      f. Se ele é um número maior ou igual a 30;
 *      g. Se ele é um número diferente de 1;
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio07 {
    public static void main(String[] args) {

        String info = "";

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

        // VERIFICA SE É NEUTRO, PAR OU ÍMPAR
        if (numero == 0) {
            info = info + "a. Número é neutro";
        } else if ((numero % 2) == 0) {
            info = info + "a. Número é par";
        } else {
            info = info + "a. Número é ímpar";
        }

        info = info + "\n";

        // VERIFICA SE É POSITIVO OU PAR
        if (numero >= 1) {
            info = info + "b. Número é positivo";
        } else if (numero <= -1) {
            info = info + "b. Número é negativo";
        }

        info = info + "\n";

        // VERIFICA SE É MAIOR OU MENO QUE 10
        if (numero > 10) {
            info = info + "c. Número é maior que 10";
        } else {
            info = info + "c. Número é menor que 10";
        }

        info = info + "\n";

        // VERIFICA SE É MENOR OU IGUAL A 50
        if (numero <= 50) {
            info = info + "d. Número é menor ou igual a 50";
        } else {
            info = info + "d. Número é maior que 50";
        }

        info = info + "\n";

        // VERIFICA SE O NÚMERO É MENOR QUE -10
        if (numero < -10) {
            info = info + "e. Número é menor que -10";
        } else {
            info = info + "e. Número é maior que -10";
        }

        info = info + "\n";

        // VERIFICA SE O NÚMERO É MAIOR IGUAL A 30
        if (numero >= 30) {
            info = info + "f. Número é maior ou igual a 30";
        } else {
            info = info + "f. Número é menor que 30";
        }

        info = info + "\n";

        // VERIFICA SE O NÚMERO É DIFERENTE DE 1 OU IGAUL A ZERO
        if (numero != 1) {
            info = info + "g. Número é diferente de 1";
        } else {
            info = info + "g. Número é igual a zero";
        }

        JOptionPane.showMessageDialog(null, info);

    }
}