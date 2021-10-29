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
            + "\nAntes de tudo, precisamos que informe o seu saldo." + "\nDigite seu saldo: R$ ");

      double saldo = scan.nextDouble();

      do {
         System.out.print("Qual operação deseja fazer?" + "\n[1] Depósito" + "\n[2] Saque" + "\n[3] Apresentar o saldo"
               + "\n[0] Sair" + "\nOpção: ");

         opcaoMenu = scan.nextInt();

         switch (opcaoMenu) {
            case 1:
               saldo = depositar(saldo);
               break;
            case 2:
            
               trycatch

               break;
            case 3:
               apresentar(saldo);
               break;

         default:
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

   public static double sacar(double saldo) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Informe o valor que deseja sacar: R$");

      double valorSaque = scan.nextDouble();

      if (valorSaque > saldo) {
         throw new Error("Saldo insuficiente para saque!");
      }

      return saldo - valorSaque;
   }

   public static void apresentar(double saldo) {
      System.out.println("Seu saldo atual é de: R$" + String.format("%.2f", saldo));
   }

}