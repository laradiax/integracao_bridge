package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioPJFactoryTest {

    @Test
    void deveCriarValeRefeicaoPJ() {
        BeneficioFactoryAbstrata factory = new BeneficioPJFactory();

        Beneficio beneficio = factory.criarValeRefeicao();

        assertEquals(BeneficioValeRefeicaoPJ.class, beneficio.getClass());
        assertEquals(400.0f, beneficio.calcularValor(), 0.01f);
    }

    @Test
    void deveCriarValeTransportePJ() {
        BeneficioFactoryAbstrata factory = new BeneficioPJFactory();

        Beneficio beneficio = factory.criarValeTransporte();

        assertEquals(BeneficioValeTransportePJ.class, beneficio.getClass());
        assertEquals(120.0f, beneficio.calcularValor(), 0.01f);
    }

    @Test
    void deveCriarPlanoSaudePJ() {
        BeneficioFactoryAbstrata factory = new BeneficioPJFactory();

        Beneficio beneficio = factory.criarPlanoSaude();

        assertEquals(BeneficioPlanoSaudePJ.class, beneficio.getClass());
        assertEquals(250.0f, beneficio.calcularValor(), 0.01f);
    }

    @Test
    void deveCriarPrevidenciaPrivadaPJ() {
        BeneficioFactoryAbstrata factory = new BeneficioPJFactory();

        Beneficio beneficio = factory.criarPrevidenciaPrivada();

        assertEquals(BeneficioPrevidenciaPrivadaPJ.class, beneficio.getClass());
        assertEquals(150.0f, beneficio.calcularValor(), 0.01f);
    }
}