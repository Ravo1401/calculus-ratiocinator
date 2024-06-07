package com.example.calculusratiocinator;

public class Genereux extends Proposition {
    public final Boolean valeur;

    public Genereux(Boolean valeur) {
        this.valeur = valeur;
    }
    @Override
    public Boolean evaluation() {
        return valeur;
    }
}
