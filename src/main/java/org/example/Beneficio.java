package org.example;

public abstract class Beneficio {

    protected CalculoBeneficio calculoBeneficio;
    protected float valorBase;

    public Beneficio(float valorBase) {
        this.valorBase = valorBase;
    }

    public void setCalculoBeneficio(CalculoBeneficio calculoBeneficio) {
        this.calculoBeneficio = calculoBeneficio;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();

    public abstract String cancelar();
}