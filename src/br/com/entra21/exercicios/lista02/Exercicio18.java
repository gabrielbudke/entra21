package br.com.entra21.exercicios.lista02;

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

      String horasNascimentoPorExtenso;
      Scanner scan = new Scanner(System.in);

      System.out.print(
            "==== ALGORITMO PARA ESCREVER AS HORAS POR EXTENSO ====" + "\nInforme a hora de nascimento (HH:MM:SS): ");
      String horasNascimento = scan.nextLine();

      if (horasNascimento.length() == 8) {

         String horas = horasNascimento.substring(0, 2);
         String minutos = horasNascimento.substring(3, 5);
         String segundos = horasNascimento.substring(6, 8);

         String horasPorExtenso = horasPorExtenso(horas);
         String minutosPorExtenso = minutosPorExtenso(minutos);
         String segundosPorExtenso = segundosPorExtenso(segundos);

         if (minutosPorExtenso.length() > 0 && segundosPorExtenso.length() > 0) {
            horasNascimentoPorExtenso = "A horas do nascimento é: " + horasPorExtenso + ", " + minutosPorExtenso + " e "
                  + segundosPorExtenso;
         } else if (minutosPorExtenso.length() > 0 && segundosPorExtenso.length() == 0) {
            horasNascimentoPorExtenso = "A horas do nascimento é: " + horasPorExtenso + " e " + minutosPorExtenso;
         } else if (minutosPorExtenso.length() == 0 && segundosPorExtenso.length() > 0) {
            horasNascimentoPorExtenso = "A horas do nascimento é: " + horasPorExtenso + " e " + segundosPorExtenso;
         } else {
            horasNascimentoPorExtenso = "As horas do nascimento são: " + horasPorExtenso;
         }

         System.out.println(horasNascimentoPorExtenso);
      } else {
         System.out.println("O formato das horas é inválido!");
      }

   }

   public static String horasPorExtenso(String horas) {

      String horasPorExtenso = "";

      String[] arrayHoras = { "meia-noite", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",
            "vinte", "vinte e uma", "vinte e duas", "vinte e três", "meia-noite" };

      int horasConvertidasNumero = Integer.parseInt(horas);

      if (horasConvertidasNumero > 24) {
         throw new Error("As horas são inválidas!");
      }
      /*
       * 
       * 
       * if (segundosConvertidosNumero >= 60) { throw new
       * Error("Os segundos são inválidos!"); }
       */
      if (horasConvertidasNumero > 1 && horasConvertidasNumero < 24) {
         horasPorExtenso += arrayHoras[horasConvertidasNumero] + " horas";
      } else if (horasConvertidasNumero == 1) {
         horasPorExtenso += arrayHoras[horasConvertidasNumero] + " hora";
      } else {
         horasPorExtenso += arrayHoras[horasConvertidasNumero];
      }

      return horasPorExtenso;
   }

   public static String minutosPorExtenso(String minutos) {

      String minutosPorExtenso = "";

      String[] dezena = { "", "", "vinte", "trinta", "quarenta", "cinquenta" };
      String[] unidade = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };

      int minutosConvertidosNumero = Integer.parseInt(minutos);

      if (minutosConvertidosNumero >= 60) {
         throw new Error("Os minutos são inválidos!");
      }

      if (minutosConvertidosNumero == 0) {
         return "";
      }

      if (minutosConvertidosNumero == 1) {
         minutosPorExtenso = unidade[minutosConvertidosNumero] + " minuto";
      } else if (minutosConvertidosNumero < 20) {
         minutosPorExtenso = unidade[minutosConvertidosNumero] + " minutos";
      } else {
         String minutoDezena = minutos.substring(0, 1);
         String minutoUnidade = minutos.substring(1, 2);

         int minutoDezenaConvertidoNumero = Integer.parseInt(minutoDezena);
         int minutoUnidadeConvertidoNumero = Integer.parseInt(minutoUnidade);

         if (minutoUnidadeConvertidoNumero == 0) {
            minutosPorExtenso = dezena[minutoDezenaConvertidoNumero] + " minutos";
         } else {
            minutosPorExtenso = dezena[minutoDezenaConvertidoNumero] + " e " + unidade[minutoUnidadeConvertidoNumero]
                  + " minutos";
         }

      }

      return minutosPorExtenso;

   }

   public static String segundosPorExtenso(String segundos) {

      String segundosPorExtenso = "";

      String[] dezena = { "", "", "vinte", "trinta", "quarenta", "cinquenta" };
      String[] unidade = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };

      int segundosConvertidosNumero = Integer.parseInt(segundos);

      if (segundosConvertidosNumero >= 60) {
         throw new Error("Os segundos são inválidos!");
      }

      if (segundosConvertidosNumero == 0) {
         return "";
      }

      if (segundosConvertidosNumero == 1) {
         segundosPorExtenso = unidade[segundosConvertidosNumero] + " segundo";
      } else if (segundosConvertidosNumero < 20) {
         segundosPorExtenso = unidade[segundosConvertidosNumero] + " segundos";
      } else {
         String segundosDezena = segundos.substring(0, 1);
         String segundosUnidade = segundos.substring(1, 2);

         int segundosDezenaConvertidosNumero = Integer.parseInt(segundosDezena);
         int segundosUnidadeConvertidosNumero = Integer.parseInt(segundosUnidade);

         if (segundosUnidadeConvertidosNumero == 0) {
            segundosPorExtenso = dezena[segundosDezenaConvertidosNumero] + " segundos";
         } else {
            segundosPorExtenso = dezena[segundosDezenaConvertidosNumero] + " e "
                  + unidade[segundosUnidadeConvertidosNumero] + " segundos";
         }

      }

      return segundosPorExtenso;

   }
}