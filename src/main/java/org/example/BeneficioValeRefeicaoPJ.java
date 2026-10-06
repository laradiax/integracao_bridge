package org.example;

public class BeneficioValeRefeicaoPJ extends BeneficioValeRefeicao {

    public BeneficioValeRefeicaoPJ() {
        super(400.0f);
        this.setCalculoBeneficio(new ValorFixo(400.0f));
    }
}