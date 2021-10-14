import javax.swing.JOptionPane;

/**
 * 3. Solicite para o usuário dois números e apresente o seguinte menu:
 * 
 *   MENU
 *   1 - SOMAR
 *   2 - SUBTRAIR
 *   3 - MULTIPLICAR
 *   4 - DIVIDIR
 * 
 * Após usuário escolher o número do menu, deve-se apresentar o cálculo dos dois números 
 * solicitados de acordo com o menu solicitado.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio03 {
    public static void main(String[] args) {

        int soma, sub, multiplica, divide;

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Número: "));

        int opcao = Integer.parseInt(JOptionPane
                .showInputDialog("MENU" + "\n1 - Somar" + "\n2 - Subtrair" + "\n3 - Multiplicar" + "\n4 - Dividir"));

        if (opcao == 1) {
            soma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "Soma: " + soma);

        } else if (opcao == 2) {
            sub = numero1 - numero2;
            JOptionPane.showMessageDialog(null, "Subtração: " + sub);

        } else if (opcao == 3) {
            multiplica = numero1 * numero2;
            JOptionPane.showMessageDialog(null, "Multiplicação: " + multiplica);

        } else if (opcao == 4) {
            divide = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "Divisão: " + divide);

        } else {
            JOptionPane.showMessageDialog(null, "Opção não disponível");
        }

    }
}