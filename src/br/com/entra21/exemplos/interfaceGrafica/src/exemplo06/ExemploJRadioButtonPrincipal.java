package exemplo06;

import java.awt.*;

public class ExemploJRadioButtonPrincipal {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploJRadioButton00();
            }
        });
    }
}
