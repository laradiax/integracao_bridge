package org.example;

public class BeneficioPlanoSaudePJ extends BeneficioPlanoSaude {

    public BeneficioPlanoSaudePJ() {
        super(250.0f);
        this.setCalculoBeneficio(new ValorFixo(250.0f));
    }
}