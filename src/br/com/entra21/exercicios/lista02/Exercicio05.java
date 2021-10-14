import javax.swing.JOptionPane;

/**
 * 5. Solicite para o usuário um número e informe se este número é ímpar ou não.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio05 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        if (numero % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Número é Ímpar");

        } else {
            JOptionPane.showMessageDialog(null, "Número não é ímpar");
        }
    }
}