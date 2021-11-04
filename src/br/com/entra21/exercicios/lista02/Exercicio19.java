package br.com.entra21.exercicios.lista02;

import java.util.Scanner;

/**
 * 19. Solicite o saldo, valor dos depósitos, parcela do empréstimo, valor dos saques.
 *     Apresente ao final o status da conta de acordo com o saldo atual.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio19 {
   public static void main(String[] args) {

      int opcaoMenu;
      Scanner scan = new Scanner(System.in);

      System.out.print("======== BEM VINDO AO BANCO ENTRA21 ========"
            + "\nAntes de tudo, precisamos que informe o seu saldo atual." + "\nDigite seu saldo atual: R$ ");

      double saldo = scan.nextDouble();

      do {
         System.out.print("Qual operação deseja fazer?" + "\n[1] Depósito" + "\n[2] Saque" + "\n[3] Apresentar o saldo"
               + "\n[0] Sair" + "\nOpção: ");

         opcaoMenu = scan.nextInt();

         switch (opcaoMenu) {
            case 0:
               System.out.println("Obrigado por usar nosso sistema ;) ");
               break;
            case 1:
               saldo = depositar(saldo);
               System.out.println("Depósito realizado com sucesso!" + "\n");
               break;
            case 2:       
               try {
                  saldo = sacar(saldo);   
                  System.out.println("Saque realizado com sucesso!" + "\n");
               } catch (Exception e) {
                  System.out.println("Operação inválida: " + e.getMessage());
               }       
                              
               break;
            case 3:
               apresentar(saldo);
               break;

            default:
               System.out.println("Opção inválida!\n");   
            break;
         }

      } while (opcaoMenu != 0);

      System.out.println("Seu saldo final é de: R$" + String.format("%.2f", saldo));

   }

   public static double depositar(double saldo) {

      Scanner scan = new Scanner(System.in);
      System.out.print("Informe o valor que deseja despositar: R$");

      double valorDeposito = scan.nextDouble();

      return saldo + valorDeposito;
   }

   public static double sacar(double saldo) throws Exception {
      Scanner scan = new Scanner(System.in);
      System.out.print("Informe o valor que deseja sacar: R$");

      double valorSaque = scan.nextDouble();

      if (valorSaque > saldo) {
         throw new Exception("Saldo insuficiente para saque!");
      }

      return saldo - valorSaque;
   }

   public static void apresentar(double saldo) {
      System.out.println("Seu saldo atual é de: R$" + String.format("%.2f", saldo) + "\n");
   }

}