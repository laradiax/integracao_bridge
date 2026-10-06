package org.example;

public class BeneficioPlanoSaude extends Beneficio {

    public BeneficioPlanoSaude() {
        super(0.0f);
    }

    public BeneficioPlanoSaude(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.valorBase);
    }

    public String cancelar() {
        return "Plano de Saúde cancelado";
    }
}