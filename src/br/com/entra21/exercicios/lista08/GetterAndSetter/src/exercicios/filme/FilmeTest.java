import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FilmeTest {

   @Test
   public void definirEObteTitulo() {
      Filme filme = new Filme();
      filme.setTitulo("Sociedade dos Poetas Mortos");
      assertEquals("Sociedade dos Poetas Mortos", filme.getTitulo());
   }

   public void definirEObterTituloOriginal() {
      Filme filme = new Filme();
      filme.setTituloOriginal("Dead Society Poets");
      assertEquals("Dead Society Poets", filme.getTituloOriginal());

   }

}
