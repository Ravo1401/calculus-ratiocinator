package com.example.calculusratiocinator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TesteAffirmation {
    @Test
    void LouEstPauvreEtGénéreux () {
        var Lou = new NomPersonne("Lou");
        var Affirmation = new Affirmation("true");
        var Pauvre = new Pauvre();
        assertFalse(LogiqueEtOu.Et(Pauvre.evaluation(), Affirmation.evaluation()));
    }

    @Test
    void LouEstBeauDoncPauvre () {
        var lou = new NomPersonne("Lou");
        var Beau = new Beau();
        var Pauvre = new Pauvre();
        assertFalse(LogiqueEtOu.E)
    }
}
