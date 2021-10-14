import javax.swing.JOptionPane;

/**
 * 2. Solicite para o usuário um número e informe se este número é negativo ou não.
 *    Obs.: ​Lembrando que zero não é considerado um número negativo.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio02 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Negativo");

        } else {
            JOptionPane.showMessageDialog(null, "Não é Negativo!");
        }

    }
}