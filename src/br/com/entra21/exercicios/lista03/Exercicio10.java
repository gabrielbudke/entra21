package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        
        int contA = 0; int contB = 0; int contC = 0; int contD = 0; 
        int contE = 0; int contF = 0; int contG = 0; int contH = 0; 
        int contI = 0; int contJ = 0; int contK = 0; int contL = 0;
        int contM = 0; int contN = 0; int contO = 0; int contP = 0; 
        int contQ = 0; int contR = 0; int contS = 0; int contT = 0; 
        int contU = 0; int contV = 0; int contW = 0; int contX = 0;
        int contY = 0; int contZ = 0;
              
        String textoParaContabilizarLetras = JOptionPane.showInputDialog("Digite um texto:").toUpperCase();

        int index = 0;
        while (index < textoParaContabilizarLetras.length()) {
            
            switch (textoParaContabilizarLetras.charAt(index)) {
                case 'A':
                    contA++;
                    break;
                case 'B':
                    contB++;
                    break;                    
                case 'C':
                    contC++;
                    break;
                case 'D':
                    contD++;
                    break;
                case 'E':
                    contE++;
                    break;
                case 'F':
                    contF++;
                    break;
                case 'G':
                    contG++;
                    break;
                case 'H':
                    contH++;
                    break;
                case 'I':
                    contI++;
                    break;
                case 'J':
                    contJ++;
                    break;
                case 'K':
                    contK++;
                    break;
                case 'L':
                    contL++;
                    break;
                case 'M':
                    contM++;
                    break;
                case 'N':
                    contN++;
                    break;
                case 'O':
                    contO++;
                    break;                
                case 'P':
                    contP++;
                    break;
                case 'Q':
                    contQ++;
                    break;
                case 'R':
                    contR++;
                    break;
                case 'S':
                    contS++;
                    break;
                case 'T':
                    contT++;
                    break;
                case 'U':
                    contU++;
                    break;
                case 'V':
                    contV++;
                    break;
                case 'W':
                    contW++;
                    break;
                case 'X':
                    contX++;
                    break;
                case 'Y':
                    contY++;
                    break;
                case 'Z':
                    contZ++;
                    break;
                default:
                    break;
            }

            index++;
        }

        JOptionPane.showMessageDialog(null, "Quantidade das letras da palavra: " + textoParaContabilizarLetras 
            + "\nA = " + contA
            + "\nB = " + contB
            + "\nC = " + contC
            + "\nD = " + contD
            + "\nE = " + contE
            + "\nF = " + contF
            + "\nG = " + contG
            + "\nH = " + contH
            + "\nI = " + contI
            + "\nJ = " + contJ
            + "\nK = " + contK
            + "\nL = " + contL
            + "\nM = " + contM
            + "\nN = " + contN
            + "\nO = " + contO
            + "\nP = " + contP
            + "\nQ = " + contQ
            + "\nR = " + contR
            + "\nS = " + contS
            + "\nT = " + contT
            + "\nU = " + contU
            + "\nV = " + contV
            + "\nW = " + contW
            + "\nX = " + contX
            + "\nY = " + contY
            + "\nZ = " + contZ);



    }
}
