package br.com.entra21.exemplos;

public class ManipulandoString {
    public static void main(String[] args) {
        
        String nome = "Curso de Java";
        System.out.println(nome);

        // Retorna a quantidade de caracteres
        System.out.println("Tamanho da string: " + nome.length());

        // Verifica se a váriavel String contém valor
        if(nome.equals("")) {
            System.out.println("Váriavel vazia!");
        } else if(nome.equals("Curso de Java")) {
            System.out.println("Curso encontrado!");
        } else {
            System.out.println("Nenhum curso encontrado!");
        }

        // Remove os espaços no inícios e final
        String jogoDoAno = " God of War ";
        System.out.println(jogoDoAno.trim());

        // Altera o texto para caixa alta
        System.out.println(jogoDoAno.toUpperCase());

        // Altera o texto para caixa baixa
        System.out.println(jogoDoAno.toLowerCase());

        // Pega um caracter em determinada posição
        System.out.println(jogoDoAno.trim().charAt(0));

        // Pega uma palavra em determinado intervalor
        System.out.println(jogoDoAno.trim().substring(0, 3));

    }
}