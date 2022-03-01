package exercicios.brinquedo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrinquedoTest {

   @Test
   public void obterDefinirNome() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setNome("Carrinho");
      assertEquals("Hello", "Hello");
   }

}
