package exercicios.janela;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanelaTest {

   @Test
   public void testDefinirEObterMarca() {
      Janela janela = new Janela();
      janela.setMarca("Leroy Merlin");
      assertEquals("Leroy Merlin", janela.getMarca());
   }

   @Test
   public void testDefinirEObterComprimento() {
      Janela janela = new Janela();
      janela.setComprimento(1.00);
      assertEquals(1.00, janela.getComprimento(), 0);
   }

   @Test
   public void testDefinirEObterAltura() {
      Janela janela = new Janela();
      janela.setAltura(2.45);
      assertEquals(2.45, janela.getAltura(), 0);
   }

   @Test
   public void testDefinirEObterLargura() {
      Janela janela = new Janela();
      janela.setLargura(3.52);
      assertEquals(3.52, janela.getLargura(), 0);
   }

   @Test
   public void testDefinirEObterPreco() {
      Janela janela = new Janela();
      janela.setPreco(3500.00);
      assertEquals(3500.00, janela.getPreco(), 0);
   }

   @Test
   public void testDefinirEObterInsulfilm() {
      Janela janela = new Janela();
      janela.setInsulfilm(true);
      assertEquals(true, janela.isInsulfilm());
   }

}
