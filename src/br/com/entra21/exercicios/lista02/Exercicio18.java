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
      String horasNascimento = scan.nextLine();

      if (horasNascimento.length() == 8) {
         System.out.println(horasPorExtenso(horasNascimento));
      } else {
         System.out.println("O formato das horas é inválido!");
      }

   }

   public static String horasPorExtenso(String horasNascimento) {

      String horasPorExtenso = "";

      String[] arrayHoras = { "meia-noite", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezesete", "dezoito", "dezenove",
            "vinte", "vinte e uma", "vinte e duas", "vinte e três", "meia-noite" };

      String horas = horasNascimento.substring(0, 2);
      String minutos = horasNascimento.substring(3, 5);
      String segundos = horasNascimento.substring(6, 8);

      int horasConvertidasNumero = Integer.parseInt(horas);
      int minutosConvertidosNumero = Integer.parseInt(minutos);
      int segundosConvertidosNumero = Integer.parseInt(segundos);

      if (horasConvertidasNumero > 24) {
         throw new Error("As horas são inválidas!");
      }

      if (minutosConvertidosNumero >= 60) {
         throw new Error("Os minutos são inválidos!");
      }

      if (segundosConvertidosNumero >= 60) {
         throw new Error("Os segundos são inválidos!");
      }

      if (horasConvertidasNumero > 1 && horasConvertidasNumero < 24) {
         horasPorExtenso += arrayHoras[horasConvertidasNumero] + " horas";
      } else if (horasConvertidasNumero == 1) {
         horasPorExtenso += arrayHoras[horasConvertidasNumero] + " hora";
      } else {
         horasPorExtenso += arrayHoras[horasConvertidasNumero] + " hora";
      }

      return horasPorExtenso;
   }

}