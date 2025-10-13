package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class GenerateTest {
    private Generate solution;

    @BeforeEach
    void SetUp() {
        solution = new Generate();
    }

    @Test
    void testEmptyTriangle() {
        List<List<Integer>> result = solution.generate(0);
        assertTrue(result.isEmpty(), "Triangle with 0 rows should be empty.");
    }

    @Test
    void testSingleRow() {
        List<List<Integer>> result = solution.generate(1);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1));
        assertEquals(expected, result, "Single row should be [1].");
    }

    @Test
    void testTwoRows() {
        List<List<Integer>> result = solution.generate(2);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1));
        assertEquals(expected, result, "Two rows should be [[1], [1,1]]");
    }

    @Test
    void testFiveRows() {
        List<List<Integer>> result = solution.generate(5);
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(expected, result, "Five rows should match Pascal's Triangle pattern.");
    }

    @Test
    void testRowSizes() {
        List<List<Integer>> result = solution.generate(6);
        assertEquals(6, result.size(), "Should have 6 rows");

        for (int i = 0; i < result.size(); i++) {
            assertEquals(i + 1, result.get(i).size(), "Row " + i + " should have " + (i + 1) + " elements.");
        }
    }

    @Test
    void testEdgeValues() {
        List<List<Integer>> result = solution.generate(7);

        for (List<Integer> row : result) {
            assertEquals(1, row.get(0), "First element of each row should be 1");
            assertEquals(1, row.get(row.size() - 1), "Last element of each row should be 1");
        }
    }

    @Test
    void testSymmetry() {
        List<List<Integer>> result = solution.generate(8);
        for (List<Integer> row : result) {
            int size = row.size();
            for (int i = 0; i < size / 2; i++) {
                assertEquals(row.get(i), row.get(size - 1 - i), "Pascal's Triangle shoudl be symmetric.");
            }
        }
    }

    @Test
    void testLargeInput() {
        List<List<Integer>> result = solution.generate(20);
        assertEquals(20, result.size(), "Should handle 20 rows.");
        assertEquals(20, result.get(19).size(), "Last row should have 20 elements.");
    }
}
