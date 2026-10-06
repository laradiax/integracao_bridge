package org.example;

public class BeneficioPrevidenciaPrivada extends Beneficio {

    public BeneficioPrevidenciaPrivada() {
        super(0.0f);
    }

    public BeneficioPrevidenciaPrivada(float valorBase) {
        super(valorBase);
    }

    public float calcularValor() {
        return this.calculoBeneficio.calcular(this.valorBase);
    }

    public String cancelar() {
        return "Previdência Privada cancelada";
    }
}