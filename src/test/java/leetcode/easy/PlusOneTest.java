package leetcode.easy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PlusOneTest {
    private PlusOne solution;

    @BeforeEach
    void setUp(){
        solution = new PlusOne();
    }

    @Test
    @DisplayName("Example 1: [1, 2, 3] -> [1, 2, 4]")
    void testExample1(){
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    @DisplayName("Example 2: [4, 2, 3, 1] -> [4, 3, 2, 2]")
    void testExample2(){
        int[] input = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, solution.plusOne(input));
    }
}
