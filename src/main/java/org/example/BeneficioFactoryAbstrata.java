package org.example;

public interface BeneficioFactoryAbstrata {

    Beneficio criarValeRefeicao();

    Beneficio criarValeTransporte();

    Beneficio criarPlanoSaude();

    Beneficio criarPrevidenciaPrivada();
}