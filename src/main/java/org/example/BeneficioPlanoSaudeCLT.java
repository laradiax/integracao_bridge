package org.example;

public class BeneficioPlanoSaudeCLT extends BeneficioPlanoSaude {

    public BeneficioPlanoSaudeCLT() {
        super(300.0f);
        this.setCalculoBeneficio(new ValorFixo(300.0f));
    }
}