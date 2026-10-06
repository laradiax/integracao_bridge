package org.example;

public class BeneficioValeTransporteCLT extends BeneficioValeTransporte {

    public BeneficioValeTransporteCLT() {
        super(3000.0f);
        this.setCalculoBeneficio(new PercentualSalario(0.06f));
    }
}