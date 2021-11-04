package br.com.entra21.exercicios.lista07.ArrayList.src.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 07. Desenvolver um algoritmo  e armazene 25 nomes em  uma ArrayList e ao final apresentar:
 *    -> Todos os nomes no ArrayList;
 *    -> Nome com o maior nome;
 *    -> Nome com o menor nome;
 *    -> Quantidade de pessoas que têm o nome Paulo;
 *    -> Quantidade de pessoas que têm o nome Ana;
 *    -> Quantidade de pessoas que têm a primeira letra do nome começando com uma vogal.
 */
/**
 * @author Gabriel B. de Sousa
 */
public class Exercicio07 {
   public static void main(String[] args) {
      
      ArrayList<String> nomes = new ArrayList<>();
      Scanner scan = new Scanner(System.in);

      for (int i = 0; i < 5; i++) {
         System.out.print("Informe o " + (i + 1) + "° nome: ");
         String nome = scan.nextLine();
         nomes.add(nome);
      }
      scan.close();
      
      System.out.println("> Nomes: " + nomes);
      maiorNome(nomes);
      menorNome(nomes);
      quantidadePessoasComNomePaulo(nomes);
      quantidadePessoasComNomeAna(nomes);
      quantidadePessoasComLetraVogalNoInicio(nomes);

   }
   
   public static void maiorNome(ArrayList<String> nomes) {    
      String maiorNome = "";
      
      for (int i = 0; i < nomes.size(); i++) {
         if(nomes.get(i).length() > maiorNome.length()) {
            maiorNome = nomes.get(i);
         }
      }

      System.out.println("> O maior nome é: " + maiorNome);      
   }

   public static void menorNome(ArrayList<String> nomes) {

      String menorNome = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";

      for (int i = 0; i < nomes.size(); i++) {
         if(nomes.get(i).length() < menorNome.length()) {
            menorNome = nomes.get(i);
         }
      }

      System.out.println("> O menor nome é: " + menorNome);
   }

   public static void quantidadePessoasComNomePaulo(ArrayList<String> nomes) {

      int quantidadePessoasComNomePaulo = 0;

      for (int i = 0; i < nomes.size(); i++) {
         if(nomes.get(i).equalsIgnoreCase("Paulo")) {
            quantidadePessoasComNomePaulo++;
         }
      }

      System.out.println("> Quantidade de pessoas que têm o nome Paulo: " + quantidadePessoasComNomePaulo);
      
   }

   public static void quantidadePessoasComNomeAna(ArrayList<String> nomes) {
      int quantidadePessoasComNomeAna = 0;

      for (int i = 0; i < nomes.size(); i++) {
         if(nomes.get(i).equalsIgnoreCase("Ana")) {
            quantidadePessoasComNomeAna++;
         }
      }

      System.out.println("> Quantidade de pessoas que têm o nome Ana: " + quantidadePessoasComNomeAna);

   }

   public static void quantidadePessoasComLetraVogalNoInicio(ArrayList<String> nomes) {
      
      Character[] vogais = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
      ArrayList<Character> arrayVogais = new ArrayList<>();
      arrayVogais.addAll(Arrays.asList(vogais));

      int quantidadePessoasComLetraVogalNoInicio = 0;

      for (int i = 0; i < nomes.size(); i++) {
         char primeiraLetra = nomes.get(i).trim().charAt(0);         
         if(arrayVogais.contains(primeiraLetra)) {
            quantidadePessoasComLetraVogalNoInicio++;
         }         
      }

      System.out.println("> Quantidade de pessoas que têm uma vogal na primeira letra do nome: " + quantidadePessoasComLetraVogalNoInicio);
      
   }


}
