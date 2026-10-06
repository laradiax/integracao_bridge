package org.example;

public class BeneficioCLTFactory implements BeneficioFactoryAbstrata {

    @Override
    public Beneficio criarValeRefeicao() {
        return new BeneficioValeRefeicaoCLT();
    }

    @Override
    public Beneficio criarValeTransporte() {
        return new BeneficioValeTransporteCLT();
    }

    @Override
    public Beneficio criarPlanoSaude() {
        return new BeneficioPlanoSaudeCLT();
    }

    @Override
    public Beneficio criarPrevidenciaPrivada() {
        return new BeneficioPrevidenciaPrivadaCLT();
    }
}