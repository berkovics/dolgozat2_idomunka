/*
* File: TestIdoMunka.java
* Author: Berkovics Gellért
* Copyright: 2023, Berkovics Gellért
* Group: Szoft I/1/N
* Date: 2023-04-27
* Github: https://github.com/berkovics/dolgozat2_idomunka.git
* Licenc: GNU GPL Junit5
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestIdoMunka {
    IdoMunka idoMunka;

    @BeforeEach
    public void init() {
        this.idoMunka = new IdoMunka();
    }

    @Test
    public void testSzamitIdoMunkaFirst() {
        double actual = idoMunka.szamitIdoMunka(34, 20, 42);
        assertEquals(actual, 0.04047619047619048);
    }

    @Test
    public void testSzamitIdoMunkaSecond() {
        double actual = idoMunka.szamitIdoMunka(573, 11, 12);
        assertEquals(actual, 4.340909090909091);
    }

    @Test
    public void testCheckInputTrue() {
        boolean actual = idoMunka.inputCheck("50");
        assertTrue(actual);
    }

    @Test
    public void testCheckInputFalse() {
        boolean actual = idoMunka.inputCheck("abcd");
        assertFalse(actual);
    }
}
