package org.example;

public class BeneficioValeTransportePJ extends BeneficioValeTransporte {

    public BeneficioValeTransportePJ() {
        super(3000.0f);
        this.setCalculoBeneficio(new PercentualSalario(0.04f));
    }
}