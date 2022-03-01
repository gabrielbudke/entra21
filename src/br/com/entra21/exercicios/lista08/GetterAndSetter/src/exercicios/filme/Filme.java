package exercicios.filme;

public class Filme {

   private String titulo, tituloOriginal, genero, diretor, idioma;
   private int anoLancamento, anoLancamentoBrasil;
   private double valorOrcamento, valorFaturamento;
   private short classificacao;

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getTituloOriginal() {
      return tituloOriginal;
   }

   public void setTituloOriginal(String tituloOriginal) {
      this.tituloOriginal = tituloOriginal;
   }

   public String getGenero() {
      return genero;
   }

   public void setGenero(String genero) {
      this.genero = genero;
   }

   public String getDiretor() {
      return diretor;
   }

   public void setDiretor(String diretor) {
      this.diretor = diretor;
   }

   public int getAnoLancamento() {
      return anoLancamento;
   }

   public void setAnoLancamento(int anoLancamento) {
      this.anoLancamento = anoLancamento;
   }

   public double getValorOrcamento() {
      return valorOrcamento;
   }

   public void setValorOrcamento(double valorOrcamento) {
      this.valorOrcamento = valorOrcamento;
   }

   public double getValorFaturamento() {
      return valorFaturamento;
   }

   public void setValorFaturamento(double valorFaturamento) {
      this.valorFaturamento = valorFaturamento;
   }

   public String getIdioma() {
      return idioma;
   }

   public void setIdioma(String idioma) {
      this.idioma = idioma;
   }

   public int getAnoLancamentoBrasil() {
      return anoLancamentoBrasil;
   }

   public void setAnoLancamentoBrasil(int anoLancamentoBrasil) {
      this.anoLancamentoBrasil = anoLancamentoBrasil;
   }

   public short getClassificacao() {
      return classificacao;
   }

   public void setClassificacao(short classificacao) {
      this.classificacao = classificacao;
   }

}
