package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class GetRowTest {
    private GetRow solution;

    @BeforeEach
    void setUp() {
        solution = new GetRow();
    }

    @Test
    void testRowZero() {
        List<Integer> result = solution.getRow(0);
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, result, "Row 0 should be [1]");
    }

    @Test
    void testRowOne() {
        List<Integer> result = solution.getRow(1);
        List<Integer> expected = Arrays.asList(1, 1);
        assertEquals(expected, result, "Row 1 should be [1,1]");
    }

    @Test
    void testRowTwo() {
        List<Integer> result = solution.getRow(2);
        List<Integer> expected = Arrays.asList(1, 2, 1);
        assertEquals(expected, result, "Row 2 should be [1,2,1]");
    }

    @Test
    void testRowThree() {
        List<Integer> result = solution.getRow(3);
        List<Integer> expected = Arrays.asList(1, 3, 3, 1);
        assertEquals(expected, result, "Row 4 shoudl be [1,3,3,1]");
    }

    @Test
    void testRowFour() {
        List<Integer> result = solution.getRow(4);
        List<Integer> expected = Arrays.asList(1, 4, 6, 4, 1);
        assertEquals(expected, result, "Row 4 should be [1,4,6,4,1]");
    }

    @Test
    void testRowSix() {
        List<Integer> result = solution.getRow(6);
        List<Integer> expected = Arrays.asList(1, 6, 15, 20, 15, 6, 1);
        assertEquals(expected, result, "Row 6 should be [1,6,15,20,15,6,1]");
    }

    @Test
    void testRowSize() {
        for (int i = 0; i <= 10; i++) {
            List<Integer> result = solution.getRow(i);
            assertEquals(i + 1, result.size(), "Row " + i + " should have " + (i + 1) + " elements");
        }
    }

    @Test
    void testEdgeValues() {
        for (int i = 0; i <= 8; i++) {
            List<Integer> result = solution.getRow(i);
            assertEquals(1, result.get(0), "First element of row " + i + " Should be 1");
            assertEquals(1, result.get(result.size() - 1), " Last element of row " + i + " Should be 1");
        }
    }

    @Test
    void testSymmetry() {
        for (int i = 0; i <= 10; i++) {
            List<Integer> result = solution.getRow(i);
            int size = result.size();
            for (int j = 0; j < size / 2; j++) {
                assertEquals(result.get(j), result.get(size - 1 - j), "Row " + i + "Should be symmetric");
            }
        }
    }

    @Test
    void testMonotonicity() {
        for (int i = 2; i <= 10; i++) {
            List<Integer> result = solution.getRow(i);
            int mid = result.size() / 2;
            for (int j = 0; j < mid; j++) {
                assertTrue(result.get(j) <= result.get(j + 1), "Row " + i + " should increase towards the middle.");
            }
        }
    }

    @Test
    void testLargeRow() {
        List<Integer> result = solution.getRow(20);
        assertEquals(21, result.size(), "Row 20 should have 21 elements");
        assertEquals(1, result.get(0), "First element should be 1");
        assertEquals(1, result.get(20), "Last element should be 1");
        assertEquals(184756, result.get(10), "Middle element of row 20 should be 184756");
    }

    @Test
    void testPascalProperty() {
        List<Integer> rowN = solution.getRow(4);
        List<Integer> rowNPlus1 = solution.getRow(5);

        for (int i = 0; i < rowN.size() - 1; i++) {
            int sum = rowN.get(i) + rowN.get(i + 1);
            assertEquals(sum, rowNPlus1.get(i + 1), "Pascals property should hold");
        }
    }
}
