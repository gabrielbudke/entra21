package exercicios.brinquedo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrinquedoTest {

   @Test
   public void testDefinirEObterNome() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setNome("Carrinho");
      assertEquals("Carrinho", brinquedo.getNome());
   }

   @Test
   public void testDefinirEObterMarca() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setMarca("Mattel");
      assertEquals("Mattel", brinquedo.getMarca());
   }

   @Test
   public void testDefinirEObterModelo() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setModelo("Ferrari Enzo");
      assertEquals("Ferrari Enzo", brinquedo.getModelo());
   }

   @Test
   public void testDefinirEObterDescricao() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setDescricao("É um excelente colecionável e ótimo para presente!");
      assertEquals("É um excelente colecionável e ótimo para presente!", brinquedo.getDescricao());
   }

   @Test
   public void testDefinirEObterPreco() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setPreco(30.50);
      assertEquals(30.50, brinquedo.getPreco(), 0);
   }

   @Test
   public void testDefinirEObterCodigo() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setCodigo(75489);
      assertEquals(75489, brinquedo.getCodigo());
   }

   @Test
   public void testDefinirEObterCodigoBarras() {
      Brinquedo brinquedo = new Brinquedo();
      brinquedo.setCodigoBarras(7849654);
      assertEquals(7849654, brinquedo.getCodigoBarras());
   }

}
