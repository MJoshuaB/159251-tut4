package nz.ac.massey.cs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalc {

    @Test
    void TestAdd() {
        Calc calc = new Calc();
        assertEquals(2, calc.add(1, 1), "1 + 1 shoud be 2");
    }

    @Test
    void TestSubtract() {
        Calc calc = new Calc();
        assertEquals(0, calc.subtract(1, 1), "1 - 1 should be 0");
    }
}
