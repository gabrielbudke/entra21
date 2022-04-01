package exercicios.janela;

public class Janela {
   private String marca;
   private double comprimento, altura, largura, preco;
   private boolean insulfilm;

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public double getComprimento() {
      return comprimento;
   }

   public void setComprimento(double comprimento) {
      this.comprimento = comprimento;
   }

   public double getAltura() {
      return altura;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

   public double getLargura() {
      return this.largura;
   }

   public void setLargura(double largura) {
      this.largura = largura;
   }

   public double getPreco() {
      return preco;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public boolean isInsulfilm() {
      return insulfilm;
   }

   public void setInsulfilm(boolean insulfilm) {
      this.insulfilm = insulfilm;
   }

}
