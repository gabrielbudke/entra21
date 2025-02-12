package br.com.entra21;

public class Employee {

    private String nome;
    private Double valorHora;
    private Integer quantidadeHora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(Integer quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public double calcularSalario() {
        return valorHora * quantidadeHora;
    }
}
