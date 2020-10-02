package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

/**
 * 8. Solicitar a quantidade de caracteres que serão digitados. Após isto solicitando umcaracter por vez e armazenar o texto, no final deve-se apresentar o texto.
 */
public class Exercicio08 {
    public static void main(String[] args) {

        String concatenaCaracteres = "\"";
        int quantidadeCaracteres = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de caracteres você deseja digitar?"));

        int contador = 0;
        while (contador < quantidadeCaracteres) {

            try {
                char caracter = JOptionPane.showInputDialog("Digite um caracter (caso deseje um espaço, não informe nada):").charAt(0);                                
                concatenaCaracteres += caracter;
            } catch (Exception e) {                
                char caracter = " ".charAt(0);                
                concatenaCaracteres += caracter;
            }                        
                        
            contador++;
        }

        concatenaCaracteres += "\"";

        JOptionPane.showMessageDialog(null, concatenaCaracteres);
        
    }
}