import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FilmeTest {

   @Test
   public void testDefinirEObteTitulo() {
      Filme filme = new Filme();
      filme.setTitulo("Sociedade dos Poetas Mortos");
      assertEquals("Sociedade dos Poetas Mortos", filme.getTitulo());
   }

   @Test
   public void testDefinirEObterTituloOriginal() {
      Filme filme = new Filme();
      filme.setTituloOriginal("Dead Society Poets");
      assertEquals("Dead Society Poets", filme.getTituloOriginal());
   }

   @Test
   public void testDefinirEObterGenero() {
      Filme filme = new Filme();
      filme.setGenero("Drama");
      assertEquals("Drama", filme.getGenero());
   }

   @Test
   public void testDefinirEObterDiretor() {
      Filme filme = new Filme();
      filme.setDiretor("Peter Weir");
      assertEquals("Peter Weir", filme.getDiretor());
   }

   @Test
   public void testDefinirEObterAnoLancamento() {
      Filme filme = new Filme();
      filme.setAnoLancamento(1998);
      assertEquals(1998, filme.getAnoLancamento());
   }

   @Test
   public void testDefinirEObterValorOrcamento() {
      Filme filme = new Filme();
      filme.setValorOrcamento(16400000.00);
      assertEquals(16400000.00, filme.getValorOrcamento(), 0);
   }

   @Test
   public void testDefinirEObterValorFaturamento() {
      Filme filme = new Filme();
      filme.setValorFaturamento(235860116.00);
      assertEquals(235860116, filme.getValorFaturamento(), 0);
   }

}
