package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {


        //qtd inicial de jogadores
        int jogadores = 0;
        
        //sexo
        int masculino = 0;                      int feminino = 0;

        //maior e menor nome
        int maiorNome = Integer.MIN_VALUE;       int menorNome = Integer.MAX_VALUE;
        String jogadorMaiorNome = "";            String jogadorMenorNome = "";
        
        //altura
        double maiorAltura = Double.MIN_VALUE;  double menorAltura = Double.MAX_VALUE;
        String jogadorMaisAlto = "";            String jogadorMaisBaixo = "";
       
        //peso
        double maiorPeso = Double.MIN_VALUE;    double menorPeso = Double.MAX_VALUE;
        String jogadorMaisPesado = "";          String jogadorMaisLeve = "";
        
        //cartao amarelo
        int maisAmarelo = Integer.MIN_VALUE;    int menosAmarelo = Integer.MAX_VALUE;
        String jogadorMaisAmarelo = "";         String jogadorMenosAmarelo = "";

        //cartao vermelho
        int maisVermelho = Integer.MIN_VALUE;   int menosVermelho = Integer.MAX_VALUE;
        String jogadorMaisVermelho = "";        String jogadorMenosVermelho = "";


        //dados dos jogadores
        while(jogadores <= 21){
            String sexo = JOptionPane.showInputDialog(null, "Sexo do Jogador", "CADASTRO JOGADOR",
        JOptionPane.QUESTION_MESSAGE, 
        null,
        new Object[]{
            "", "Masculino", "Feminino"
        },
        ""
        ).toString();
            String nome = JOptionPane.showInputDialog("Nome do Jogador (a): ").trim().toUpperCase();
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do Jogador (a): "));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso do Jogador (a): "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do Jogador (a): "));
            int gols = Integer.parseInt(JOptionPane.showInputDialog("Gols marcados pelo Jogador (a): "));
            int amarelo = Integer.parseInt(JOptionPane.showInputDialog("Cartões amarelos recebidos: "));
            int vermelho = Integer.parseInt(JOptionPane.showInputDialog("Cartões vermelhos recebidos: "));

            jogadores = jogadores + 1;

            if(sexo.equals("Masculino")){
                masculino = masculino + 1;
            }else if(sexo.equals("Feminino")){
                feminino = feminino + 1;
            }

            if(peso > maiorPeso){
                maiorPeso = peso;
                jogadorMaisPesado = nome;
            }else if(peso < menorPeso){
                menorPeso = peso;
                jogadorMaisLeve = nome;
            }

            if (altura > maiorAltura){
                maiorAltura = altura;
                jogadorMaisAlto = nome;

            }else if(altura < menorAltura){
                menorAltura = altura;
                jogadorMaisBaixo = nome;
            }

            if(amarelo > maisAmarelo){
                maisAmarelo = amarelo;
                jogadorMaisAmarelo = nome;
            }else if(amarelo < menosAmarelo){
                menosAmarelo = amarelo;
                jogadorMenosAmarelo = nome;
            }

            if(vermelho > maisVermelho){
                maisVermelho = vermelho;
                jogadorMaisVermelho = nome;
            }else if(vermelho < menosVermelho){
                menosVermelho = vermelho;
                jogadorMenosVermelho = nome;
            }

            if(nome.length() > maiorNome){
                maiorNome = nome.length();
                jogadorMaiorNome = nome;
            }else if(nome.length() < menorNome){
                menorNome = nome.length();
                jogadorMenorNome = nome;
            }

        }

        JOptionPane.showMessageDialog(null, "Dados dos jogadores:" 
                     + "\nO jogador com a maior altura: " + jogadorMaisAlto
                     + "\nO jogador com maior nome: " + jogadorMaiorNome
                     + "\nA quantidade de jogadores do sexo masculino: " + masculino 
                     + "\nA quantidade de jogadores do sexo feminino: " + feminino
                     + "\nO jogador com a menor quantidade de cartões amarelos recebidos: " + jogadorMenosAmarelo
                     + "\nO jogador com menor nome: " + jogadorMenorNome
                     + "\nO jogador com maior peso: " + jogadorMaisPesado
                     + "\nO jogador com a maior quantidade de cartões vermelhos recebidos: " + jogadorMaisVermelho
                     + "\nO jogador com maior quantidade de cartões amarelos recebidos: " + jogadorMaisAmarelo
                     + "\nO jogador com a menor quantidade de cartões vermelhos recebidos: " + jogadorMenosVermelho);   
        
    }

}