package org.example;

public class BeneficioValeTransporte extends Beneficio {

    public BeneficioValeTransporte() {
        super(0.0f);
    }

    public BeneficioValeTransporte(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.valorBase);
    }

    public String cancelar() {
        return "Vale Transporte cancelado";
    }
}