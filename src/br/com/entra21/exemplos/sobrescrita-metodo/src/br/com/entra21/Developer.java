package br.com.entra21;

public class Developer extends Employee {

    private Double auxilioEmocional;

    public Double getAuxilioEmocional() {
        return auxilioEmocional;
    }

    public void setAuxilioEmocional(Double auxilioEmocional) {
        this.auxilioEmocional = auxilioEmocional;
    }

    // A sobrescrita de método é quando, reescrevemos o método de uma classe pai de forma a alterar seu comportamento.
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + auxilioEmocional;
    }
}
