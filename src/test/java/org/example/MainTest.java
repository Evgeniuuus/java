package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz() {
        assertEquals("fizz", Main.fizzbuzz(10));
    }

    @Test
    void reversedString() {
        assertEquals("llik", Main.ReversedString(4, "kill"));
    }

    @Test
    void squareSolver() {
        assertEquals("\nNet korney!", Main.SquareSolver(7,-2,8));
    }

    @Test
    void summaRuada() {
        assertEquals(0.6101111104444433, Main.SummaRuada(2));
    }

    @Test
    void palindrom() {
        assertTrue(Main.Palindrom("1221"));
        assertFalse(Main.Palindrom("1212"));
    }
}