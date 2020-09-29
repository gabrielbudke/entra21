package br.com.entra21.exercicios.lista06;

import javax.swing.JOptionPane;

/**
 * 8. Solicite ao usuário quantos números ele deseja cadastrar, crie um vetor com este tamanho, 
 *    solicite os números ao usuário e armazene no vetor.
 * 
 *    Após isto criar um vetor de ímpares e outro de pares com o tamanho do vetor original.
 *    
 *    Armazenar os números pares do vetor original no vetor par.
 *    Armazenar os números ímpares do vetor original no vetor ímpar.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        int[] arrayOriginal;
        int[] arrayDePares, arrayDeImpares;
        
        String textoArrayOriginal = "";
        String textoArrayPares = "", textoArrayImpares = "";

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja cadastrar?"));
        arrayOriginal = new int[quantidade];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° número:"));
            
            if ((i + 1) == arrayOriginal.length) {
                textoArrayOriginal+= arrayOriginal[i];
            } else {
                textoArrayOriginal+= arrayOriginal[i] + ", ";            
            }
        }

        arrayDePares = new int[arrayOriginal.length];
        arrayDeImpares = new int[arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++) {
            if(arrayOriginal[i] % 2 == 0) {
                arrayDePares[i] = arrayOriginal[i];

                if ((i + 1) == arrayOriginal.length) {
                    textoArrayPares+= arrayOriginal[i];
                } else {
                    textoArrayPares+= arrayOriginal[i] + ", ";            
                }

            } else {
                arrayDeImpares[i] = arrayOriginal[i];

                if ((i + 1) == arrayOriginal.length) {
                    textoArrayImpares+= arrayOriginal[i];
                } else {
                    textoArrayImpares+= arrayOriginal[i] + ", ";            
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Array original: " + textoArrayOriginal 
            + "\nArray par: " + textoArrayPares 
            + "\nArray ímpar: " + textoArrayImpares, 
            "EXERCICIO 08", JOptionPane.INFORMATION_MESSAGE);

        




    }
}
