package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;
/**
 * 15. Solicite um número e apresente:
 *  -> Os 50 números antecessores pares;
 *  -> Os 50 números sucessores ímpares.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio15 {
    public static void main(String[] args) {
                
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));

        String textoPares = "Os 50 números antecessores pares de [" + numero + "]\n";
        int numeroPar = numero;
        int countPares = 0;
        while (countPares < 50) {
            if(numeroPar % 2 == 0) {

                if((countPares + 1) == 49) {
                    textoPares += numeroPar + " e ";
                } else if(countPares == 49) {
                    textoPares += numeroPar + ".";
                } else {
                    textoPares += numeroPar + ", ";
                }
                countPares++;                                
            }
            
            numeroPar--;
        }

        String textoImpares = "Os 50 números sucessores ímpares de [" + numero + "]\n";
        int numeroImpar = numero;
        int countImpares = 0;
        while (countImpares < 50) {
            if(numeroImpar % 2 != 0) {

                if((countImpares + 1) == 49) {
                    textoImpares += numeroImpar + " e ";
                } else if(countImpares == 49) {
                    textoImpares += numeroImpar + ".";
                } else {
                    textoImpares += numeroImpar + ", ";
                }

                countImpares++;                                
            }
            
            numeroImpar++;
        }

        String texto = textoPares 
            + "\n--------------------------------------------------------------------------------" 
            + "\n" + textoImpares;

        JOptionPane.showMessageDialog(null, texto);
    }
}
