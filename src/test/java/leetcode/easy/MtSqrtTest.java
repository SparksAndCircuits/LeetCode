package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtSqrtTest {
    private final MySqrt solution = new MySqrt();

    @Test
    void testBaseCase() {
        assertEquals(0, solution.mySqrt(0), "Testing x = 0");
        assertEquals(1, solution.mySqrt(1), "Testing x = 1");
    }

    @Test
    void testPerfectSquares() {
        assertEquals(2, solution.mySqrt(4), "Testing x = 4");
        assertEquals(3, solution.mySqrt(9), "Testing x = 9");
        assertEquals(10, solution.mySqrt(100), "Testing x = 100");
    }

    @Test
    void testNonPerfectSquares() {
        assertEquals(1, solution.mySqrt(2), "Testing x = 2");
        assertEquals(2, solution.mySqrt(8), "Testing x = 3");
        assertEquals(5, solution.mySqrt(26), "Testing x = 26");
    }

    @Test
    void testLargeInputs() {
        int maxSqrt = 46340;
        int maxSquare = maxSqrt * maxSqrt;

        assertEquals(maxSqrt, solution.mySqrt(maxSquare), " Testing large valid square: 46340^2");
        assertEquals(maxSqrt, solution.mySqrt(maxSquare + 1), "Testing large non-perfect square: 46340^2 + 1");
        assertEquals(maxSqrt, solution.mySqrt(Integer.MAX_VALUE), "Testing Integer.MAX_VALUE");
    }
}
