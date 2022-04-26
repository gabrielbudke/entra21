package exemplo08;

import java.awt.*;

public class ExemploJTablePrincipal {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploJTable00();
            }
        });
    }
}
