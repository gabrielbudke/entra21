package br.com.entra21.exercicios.lista03;

import javax.swing.JOptionPane;
/**
 * 7. O comitê da seleção brasileira de futebol deseja obter algumas estatísticas dos 
 *    jogadores, para visualizar melhor o desempenho de seus atletas.
 *      
 *    Para tal deve-se solicitar as seguintes informações abaixo:
 *      ➔ Nome;
 *      ➔ Idade;
 *      ➔ Peso;
 *      ➔ Sexo;
 *      ➔ Altura;
 *      ➔ Quantidade de gols marcados;
 *      ➔ Quantidade de cartões amarelos recebidos;
 *      ➔ Quantidade de cartões vermelhos recebidos;
 * 
 *    OBS: Lembrando que um time de futebol terá 22 jogadores.
 *      
 *    Ao final deve-se apresentar as seguintes estatísticas:
 *      ➔ O jogador com o menor peso;
 *      ➔ O jogador com a maior altura;
 *      ➔ O jogador com o maior nome;
 *      ➔ A quantidade de jogadores do sexo F
 *      ➔ A quantidade de jogadores do sexo M
 *      ➔ O jogador com a menor quantidade de cartões amarelos recebidos;
 *      ➔ O jogador com o menor nome;
 *      ➔ O jogador com o maior peso;
 *      ➔ O jogador com a maior quantidade de cartões vermelhos recebidos;
 *      ➔ O jogador com a maior quantidade de cartões amarelos recebidos;
 *      ➔ O jogador com a menor quantidade de cartões vermelhos recebidos.
 * 
 */
/**
 * @author Gabriel B Sousa
 */

public class Exercicio07 {
    public static void main(String[] args) {
        
        int quantidadeJogadores = 0;
        
        // Quantidade de jogadores de cada sexo
        int quantidadeJogadoresMasculino = 0;
        int quantidadeJogadoresFeminino = 0;         

        // Jogador com maior nome
        int maiorNome = Integer.MIN_VALUE;       int menorNome = Integer.MAX_VALUE;
        String jogadorMaiorNome = "";            String jogadorMenorNome = "";
        
        //altura
        double maiorAltura = Double.MIN_VALUE;  double menorAltura = Double.MAX_VALUE;
        String jogadorMaisAlto = "";            String jogadorMaisBaixo = "";
       
        //peso
        double maiorPeso = Double.MIN_VALUE;    double menorPeso = Double.MAX_VALUE;
        String jogadorMaisGordo = "";          String jogadorMaisMagro = "";
        
        //cartao amarelo
        int maisAmarelo = Integer.MIN_VALUE;    int menosAmarelo = Integer.MAX_VALUE;
        String jogadorComMaisAmarelo = "";      String jogadorComMenosAmarelo = "";

        //cartao vermelho
        int maisVermelho = Integer.MIN_VALUE;   int menosVermelho = Integer.MAX_VALUE;
        String jogadorComMaisVermelho = "";     String jogadorComMenosVermelho = "";


        //dados dos jogadores
        while(quantidadeJogadores <= 21) {

            String sexo = JOptionPane.showInputDialog(null, "Sexo do " + (quantidadeJogadores + 1) + "° Jogador(a)", 
                "CADASTRO JOGADOR", JOptionPane.QUESTION_MESSAGE, 
                null, 
                new Object[] { 
                    "", "Masculino", "Feminino" 
                }, ""
            ).toString();


            String nome = JOptionPane.showInputDialog("Nome do " + (quantidadeJogadores + 1) + "° Jogador(a):").trim().toUpperCase();
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do " + nome + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso do " + nome + ":"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do " + nome + ":"));
            int quantidadeGols = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de gols marcados pelo " + nome + ":"));
            int quantidadeCartoesAmarelo = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cartões amarelos recebidos: "));
            int quantidadeCartoesVermelho = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cartões vermelhos recebidos: "));

            quantidadeJogadores = quantidadeJogadores + 1;

            if(sexo.equals("Masculino")){
                quantidadeJogadoresMasculino = quantidadeJogadoresMasculino + 1;
            }else if(sexo.equals("Feminino")){
                quantidadeJogadoresFeminino = quantidadeJogadoresFeminino + 1;
            }

            // Verifica o jogador com maior peso e menor peso
            if(peso > maiorPeso) {
                maiorPeso = peso;
                jogadorMaisGordo = nome;
            } 
            
            if(peso < menorPeso) {
                menorPeso = peso;
                jogadorMaisMagro = nome;
            }

            // Verifica o jogador mais alto e o mais baixo
            if (altura > maiorAltura) {
                maiorAltura = altura;
                jogadorMaisAlto = nome;

            }
            
            if(altura < menorAltura) {
                menorAltura = altura;
                jogadorMaisBaixo = nome;
            }

            // Verifica o jogador com maior e menor quantidade de cartão amarelo
            if(quantidadeCartoesAmarelo > maisAmarelo) {
                maisAmarelo = quantidadeCartoesAmarelo;
                jogadorComMaisAmarelo = nome;
            }
            
            if(quantidadeCartoesAmarelo < menosAmarelo) {
                menosAmarelo = quantidadeCartoesAmarelo;
                jogadorComMenosAmarelo = nome;
            }

            // Verifica o jogador com maior e menor quantidade de cartão vermelho
            if(quantidadeCartoesVermelho > maisVermelho) {
                maisVermelho = quantidadeCartoesVermelho;
                jogadorComMaisVermelho = nome;
            }
            
            if(quantidadeCartoesVermelho < menosVermelho) {
                menosVermelho = quantidadeCartoesVermelho;
                jogadorComMenosVermelho = nome;
            }

            // Jogador com o maior e menor nome
            if(nome.length() > maiorNome) {
                maiorNome = nome.length();
                jogadorMaiorNome = nome;
            }
            
            if(nome.length() < menorNome) {
                menorNome = nome.length();
                jogadorMenorNome = nome;
            }

        }

        JOptionPane.showMessageDialog(null, "Dados dos jogadores:" 
            + "\nO jogador com a maior altura: " + jogadorMaisAlto
            + "\nO jogador com a menor altura: " + jogadorMaisBaixo
            + "\nO jogador com maior nome: " + jogadorMaiorNome
            + "\nA quantidade de jogadores do sexo masculino: " +  quantidadeJogadoresMasculino
            + "\nA quantidade de jogadores do sexo feminino: " + quantidadeJogadoresFeminino
            + "\nO jogador com menor nome: " + jogadorMenorNome
            + "\nO jogador mais gordo: " + jogadorMaisGordo
            + "\nO jogador mais magro: " + jogadorMaisMagro
            + "\nO jogador com maior quantidade de cartões amarelos recebidos: " + jogadorComMaisAmarelo
            + "\nO jogador com a menor quantidade de cartões amarelos recebidos: " + jogadorComMenosAmarelo
            + "\nO jogador com a maior quantidade de cartões vermelhos recebidos: " + jogadorComMaisVermelho
            + "\nO jogador com a menor quantidade de cartões vermelhos recebidos: " + jogadorComMenosVermelho
        );   
        
    }

}