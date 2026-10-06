package org.example;

public class BeneficioPrevidenciaPrivadaCLT extends BeneficioPrevidenciaPrivada {

    public BeneficioPrevidenciaPrivadaCLT() {
        super(3000.0f);
        this.setCalculoBeneficio(new PercentualSalario(0.08f));
    }
}