package org.example;

public class BeneficioFactory {

    public static Beneficio obterBeneficio(String beneficio) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Beneficio" + beneficio);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Benefício inexistente");
        }

        if (!(objeto instanceof Beneficio)) {
            throw new IllegalArgumentException("Benefício inválido");
        }

        return (Beneficio) objeto;
    }
}