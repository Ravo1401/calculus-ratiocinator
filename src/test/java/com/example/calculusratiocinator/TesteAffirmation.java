package com.example.calculusratiocinator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class TesteAffirmation {
    @Test
    void LouEstPauvreEtGénéreux () {
        var Lou = new NomPersonne("Lou");
        var Genereux = new Genereux(true);
        var Pauvre = new Pauvre();
        assertFalse(LogiqueEtOu.Et(Pauvre.evaluation(), Genereux.evaluation()));
    }

    @Test
    void LouEstBeauDoncPauvre () {
        var lou = new NomPersonne("Lou");
        var Beau = new Beau();
        var Pauvre = new Pauvre();
        assertFalse(LogiqueEtOu.Et(Pauvre.evaluation(), Beau.evaluation()));
    }
}
