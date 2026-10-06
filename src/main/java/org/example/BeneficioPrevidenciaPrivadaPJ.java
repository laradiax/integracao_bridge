package org.example;

public class BeneficioPrevidenciaPrivadaPJ extends BeneficioPrevidenciaPrivada {

    public BeneficioPrevidenciaPrivadaPJ() {
        super(3000.0f);
        this.setCalculoBeneficio(new PercentualSalario(0.05f));
    }
}