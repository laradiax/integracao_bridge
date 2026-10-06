package org.example;

public class BeneficioPJFactory implements BeneficioFactoryAbstrata {

    @Override
    public Beneficio criarValeRefeicao() {
        return new BeneficioValeRefeicaoPJ();
    }

    @Override
    public Beneficio criarValeTransporte() {
        return new BeneficioValeTransportePJ();
    }

    @Override
    public Beneficio criarPlanoSaude() {
        return new BeneficioPlanoSaudePJ();
    }

    @Override
    public Beneficio criarPrevidenciaPrivada() {
        return new BeneficioPrevidenciaPrivadaPJ();
    }
}