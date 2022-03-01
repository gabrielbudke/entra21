package exercicios.brinquedo;

public class Brinquedo {

   private String nome, marca, modelo, descricao;
   private double preco;
   private int codigo, codigoBarras;

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public double getPreco() {
      return preco;
   }

   public void setPreco(double preco) {
      this.preco = preco;
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

}
