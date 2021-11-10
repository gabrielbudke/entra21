package br.com.entra21.exemplos.getterAndSetter.src;

public class Brinquedo {

   private String nome, marca, modelo, descricao;
   private int codigo, codigoBarras;
   private double preco;

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getNome() {
      return nome;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getMarca() {
      return marca;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public String getModelo() {
      return modelo;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getDescricao() {
      return descricao;
   }

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public int getCodigoBarras() {
      return codigoBarras;
   }

   public void setCodigoBarras(int codigoBarras) {
      this.codigoBarras = codigoBarras;
   }

   public double getPreco() {
      return preco;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   

}
