package br.com.entra21.exemplos.getterAndSetter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.entra21.exemplos.getterAndSetter.src.Janela;

public class JanelaTeste {

   @Test
   public void testaSetAltura() {
      Janela janela = new Janela();
      janela.setAltura(1.50f);
      assertEquals(1.50f, janela.getAltura(), 00);
   }

   @Test
   public void testaSetLargura() {
      Janela janela = new Janela();
      janela.setLargura(2.0f);
      assertEquals(2.0f, janela.getLargura(), 00);
   }

   @Test
   public void testaSetPreco() {
      Janela janela = new Janela();
      janela.setPreco(250.50f);
      assertEquals(250.50f, janela.getPreco(), 00);
   }

   @Test
   public void testaSetMarca() {
      Janela janela = new Janela();
      janela.setMarca("Aluminox");
      assertEquals("Aluminox", janela.getMarca());
   }   

}
