package br.com.entra21.exercicios.lista02;

import javax.swing.JOptionPane;

public class Exercicio17 {
  public static void main(String[] args) {

    int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento:"));
    
    System.out.println(numerPorExtenso(anoNascimento));

  }
  
  public static String numerPorExtenso(int numero) {

    String numeroEmString = String.valueOf(numero);
    System.out.println(numeroEmString);

    String[] milhar = { "", "mil", "dois mil", "três mil", "quatro mil", "cinco mil", "seis mil",
      "sete mil", "oito mil", "nove mil" };

    String[] centena = { "cem", "cento", "duzentos", "trezentos", "quatrocentos", 
      "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos" };

    String[] dezena = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
    
    String[] unidade = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", 
      "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };

    int mil = 0;
    int cem = 0;
    int dez = 0;
    int uni = 0;
        

    if(numeroEmString.length() == 4) {
      mil = Integer.parseInt(numeroEmString.substring(0, 1));
      cem = Integer.parseInt(numeroEmString.substring(1, 2));
      dez = Integer.parseInt(numeroEmString.substring(2, 3));
      uni = Integer.parseInt(numeroEmString.substring(3, 4));
    } else {
      return "Ano inválido";
    }

    
    String numeroPorExtenso = "";

    if(mil > 0) {
      numeroPorExtenso += milhar[mil];
    }


    if(cem == 1) {
      if(dez != 0 || uni != 0) {
        numeroPorExtenso += " " + centena[cem] + " e ";
      } else {
        numeroPorExtenso += " e " + centena[cem - 1];
      }
    } else {
      if(dez != 0 || uni != 0) {
        numeroPorExtenso += " " + centena[cem] + " e ";
      } else {
        numeroPorExtenso += " e " + centena[cem];
      }
    }

    if(dez > 1) {
      numeroPorExtenso += dezena[dez] + " e ";   
    }


    if(dez == 1) {      
      uni = Integer.parseInt(numeroEmString.substring(2, 3).concat(numeroEmString.substring(3, 4)));
      numeroPorExtenso += unidade[uni];      
    } else {
      numeroPorExtenso += unidade[uni];
    }



    /*;

    if(mil > 0) {
      numeroPorExtenso +=  milhar[mil];
    }

    if(cem > 0) {
      numeroPorExtenso +=  centena[cem];
    }


    if(dez < 2) {
      uni = Integer.parseInt(numeroEmString.substring(2, 4));
      numeroPorExtenso += " e " + unidade[uni];      
    } else {
      numeroPorExtenso += " e " + dezena[dez - 1] + " e " + unidade[uni];
    }*/

    
    return numeroPorExtenso;

  }


}