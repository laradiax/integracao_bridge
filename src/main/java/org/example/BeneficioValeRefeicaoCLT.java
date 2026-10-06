package org.example;

public class BeneficioValeRefeicaoCLT extends BeneficioValeRefeicao {

    public BeneficioValeRefeicaoCLT() {
        super(500.0f);
        this.setCalculoBeneficio(new ValorFixo(500.0f));
    }
}