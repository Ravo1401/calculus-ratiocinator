package com.example.calculusratiocinator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void LouEstPauvreDoncGénéreux () {
        var lou = new NomPersonne("Lou");
        var Pauvre = new Pauvre();
        var Genereux = new Genereux(true);
        assertTrue(LogiqueEtOu.Affirmation(Pauvre.evaluation(), Genereux.evaluation()));
    }

    @Test
    void LouEstBeauOuGénéreuxDoncLouEstPauvre () {
        var lou = new NomPersonne("Lou");
        var Beau = new Beau();
        var Genereux = new Genereux(true);
        var Pauvre = new Pauvre();
        assertFalse(LogiqueEtOu.Affirmation(LogiqueEtOu.Ou(Beau.evaluation(), Genereux.evaluation()), Pauvre.evaluation()));
    }
}
