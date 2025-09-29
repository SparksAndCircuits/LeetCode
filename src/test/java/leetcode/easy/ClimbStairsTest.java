package leetcode.easy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbStairsTest {
    private final ClimbStairs solution = new ClimbStairs();

    @Test
    void testCaseN_equals_1(){
        int n = 1;
        int expected = 1;

        assertEquals(expected, solution.climbStairs(n), "Testing n = 1");
    }

    @Test
    void testCaseN_equals_2(){
        int n = 2;
        int expected = 2;

        assertEquals(expected, solution.climbStairs(n), "Testing n = 2");
    }

    @Test
    void testCaseN_equals_3(){
        int n = 3;
        int expected = 3;

        assertEquals(expected, solution.climbStairs(n), "Testing n = 3");
    }

    @Test
    void testCaseN_equals_5(){
        int n = 5;
        int expected = 8;

        assertEquals(expected, solution.climbStairs(n), "Testing n = 5");
    }
}
