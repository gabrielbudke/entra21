package br.com.entra21.exercicios.lista03;
/**
 * 16. Faça um temporizador começando com 23:59:59 até 00:00:00.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio16 {
    public static void main(String[] args) {

        int horas = 23;
        int minutos = 59;
        int segundos = 59;
        
        while (horas >= 0) {
            while (minutos >= 0) {
                while (segundos >= 0) {
                    System.out.println(String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d",segundos));                    
                    segundos--;                    
                }

                segundos = 59;
                minutos--;
            }
            
            minutos = 59;
            horas--;
        }
        
    }
}
