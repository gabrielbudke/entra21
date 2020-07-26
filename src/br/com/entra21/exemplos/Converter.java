package br.com.entra21.exemplos;

public class Converter {
    public static void main(String[] args) {
        
        // Converte uma String para o tipo int
        int idade = Integer.parseInt("2");
        System.out.println(idade);

        // Converte uma String para o tipo double
        double valor = Double.parseDouble("1.57");
        System.out.println(valor);

        // Converte String para char
        char caractere = "Java".charAt(0);
        System.out.println(caractere);

        // Converte String para boolean
        boolean vivo = Boolean.parseBoolean("true");
        System.out.println(vivo);

    }
    
}