package br.com.entra21.exemplos.getterAndSetter.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.entra21.exemplos.getterAndSetter.src.Brinquedo;

public class BrinquedoTeste {

   @Test
   public void testaSetNome() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setNome("Hot Wheels");
      assertEquals("Hot Wheels", carrinho.getNome());
   }

   @Test
   public void testaSetMarca() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setMarca("Mattel");
      assertEquals("Mattel", carrinho.getMarca());
   }

   @Test
   public void testaSetModelo() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setModelo("Corvette");
      assertEquals("Corvette", carrinho.getModelo());
   }

   @Test
   public void testaSetPreco() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setPreco(5.99);
      assertEquals(5.99, carrinho.getPreco(), 0);
   }

   @Test
   public void testaSetCodigo() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setCodigo(15589);
      assertEquals(15589, carrinho.getCodigo());
   }

   @Test
   public void testaSetCodigoBarras() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setCodigoBarras(1234567891);
      assertEquals(1234567891, carrinho.getCodigoBarras());
   }

   @Test
   public void testaSetDescricao() {
      Brinquedo carrinho = new Brinquedo();
      carrinho.setDescricao("Um carrinho incível para divertir seu filho!");
      assertEquals("Um carrinho incível para divertir seu filho!", carrinho.getDescricao());
   }

}
