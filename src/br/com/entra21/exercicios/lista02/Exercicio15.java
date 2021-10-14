import javax.swing.JOptionPane;

/**
 * 15. Ler três números e apresentar os valores em ordem decrescente.
 */
/**
 * @author Gabriel B Sousa
 */
public class Exercicio15 {
    public static void main(String[] args) {

        double numero_A = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor numérico: "));
        double numero_B = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor numérico: "));
        double numero_C = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor numérico: "));

        if (numero_A < numero_B && numero_B < numero_C && numero_C > numero_A) {
            JOptionPane.showMessageDialog(null,
                    "Numero A: " + numero_C + "\nNúmero B: " + numero_B + "\nNúmero C: " + numero_A);
        } else if (numero_A < numero_B && numero_B > numero_C && numero_C > numero_A) {
            JOptionPane.showMessageDialog(null,
                    "Numero A: " + numero_B + "\nNúmero B: " + numero_C + "\nNúmero C: " + numero_A);
        } else if (numero_A < numero_B && numero_B > numero_C && numero_C < numero_A) {
            JOptionPane.showMessageDialog(null,
                    "Numero A: " + numero_B + "\nNúmero B: " + numero_A + "\nNúmero C: " + numero_C);
        } else if (numero_A > numero_B && numero_B < numero_C && numero_C > numero_A) {
            JOptionPane.showMessageDialog(null,
                    "Numero A: " + numero_C + "\nNúmero B: " + numero_A + "\nNúmero C: " + numero_B);
        } else if (numero_A > numero_B && numero_B > numero_C && numero_C < numero_A) {
            JOptionPane.showMessageDialog(null,
                    "Numero A: " + numero_A + "\nNúmero B: " + numero_B + "\nNúmero C: " + numero_C);
        } else if (numero_A > numero_B && numero_B < numero_C && numero_C < numero_A) {
            JOptionPane.showMessageDialog(null,
                    "Numero A: " + numero_A + "\nNúmero B: " + numero_C + "\nNúmero C: " + numero_B);

        }

    }
}