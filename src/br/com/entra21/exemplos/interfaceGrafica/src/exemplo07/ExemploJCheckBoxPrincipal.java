package exemplo07;

import java.awt.*;

public class ExemploJCheckBoxPrincipal {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploJCheckBox00();
            }
        });
    }
}
