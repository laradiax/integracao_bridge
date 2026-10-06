package org.example;

public class BeneficioValeRefeicao extends Beneficio {

    public BeneficioValeRefeicao() {
        super(0.0f);
    }

    public BeneficioValeRefeicao(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.valorBase);
    }

    public String cancelar() {
        return "Vale Refeição cancelado";
    }
}