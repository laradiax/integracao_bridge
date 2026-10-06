package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioCLTFactoryTest {

    @Test
    void deveCriarValeRefeicaoCLT() {
        BeneficioFactoryAbstrata factory = new BeneficioCLTFactory();

        Beneficio beneficio = factory.criarValeRefeicao();

        assertEquals(BeneficioValeRefeicaoCLT.class, beneficio.getClass());
        assertEquals(500.0f, beneficio.calcularValor(), 0.01f);
    }

    @Test
    void deveCriarValeTransporteCLT() {
        BeneficioFactoryAbstrata factory = new BeneficioCLTFactory();

        Beneficio beneficio = factory.criarValeTransporte();

        assertEquals(BeneficioValeTransporteCLT.class, beneficio.getClass());
        assertEquals(180.0f, beneficio.calcularValor(), 0.01f);
    }

    @Test
    void deveCriarPlanoSaudeCLT() {
        BeneficioFactoryAbstrata factory = new BeneficioCLTFactory();

        Beneficio beneficio = factory.criarPlanoSaude();

        assertEquals(BeneficioPlanoSaudeCLT.class, beneficio.getClass());
        assertEquals(300.0f, beneficio.calcularValor(), 0.01f);
    }

    @Test
    void deveCriarPrevidenciaPrivadaCLT() {
        BeneficioFactoryAbstrata factory = new BeneficioCLTFactory();

        Beneficio beneficio = factory.criarPrevidenciaPrivada();

        assertEquals(BeneficioPrevidenciaPrivadaCLT.class, beneficio.getClass());
        assertEquals(240.0f, beneficio.calcularValor(), 0.01f);
    }
}