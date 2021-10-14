import java.util.Scanner;

/**
 * 18. Solicite para o usuário a hora de nascimento e apresente por extenso.
 * Exemplo: 19:03:29 deverá apresentar para o usuário “dezenove horas, três
 * minutos e vinte e nove segundos”
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio18 {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      System.out.print("Informe a hora de nascimento (HH:MM:SS): ");
      String horaNascimento = scan.nextLine();

      String horas = horaNascimento.substring(0, 2);
      String minutos = horaNascimento.substring(3, 5);
      String segundos = horaNascimento.substring(6, 8);

      int horasConvertidasNumero = Integer.parseInt(horas);

      System.out.println("Hora do nascimento: " + segundos);

   }

   public static boolean validaHoraNascimento(String horas, String minutos, String segundos) {
      int horasConvertidaNumero = Integer.parseInt(horas);
      System.out.println(horasConvertidaNumero);

      return true;
   }

   public static String horasPorExtenso() {

      String[] horas = { "meia-noite", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez" };

      return "";
   }

}