package leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TwoSumTest {
    
    private TwoSum solver;
    
    @BeforeEach
    public void setUp() {
        solver = new TwoSum();
    }

    @Test
    public void testBasicCase() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, result);
        
        // Verify the actual sum
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] nums = { -3, 4, 3, 90 };
        int target = 0;
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 2 };
        assertArrayEquals(expected, result);
        
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }

    @Test
    public void testDuplicateNumbers() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, result);
        
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }

    @Test
    public void testLargerArray() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, result);
        
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }
    
    @Test
    public void testFirstAndLastElements() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 6; // 1 + 5
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 4 };
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testAllNegativeNumbers() {
        int[] nums = { -5, -3, -1, -4 };
        int target = -8; // -5 + -3
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testZeroTarget() {
        int[] nums = { -1, 0, 1, 2 };
        int target = 0; // -1 + 1
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 2 };
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testLargeNumbers() {
        int[] nums = { 1000000, 2000000, 3000000 };
        int target = 3000000; // 1000000 + 2000000
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMultipleDuplicates() {
        int[] nums = { 2, 2, 2, 2 };
        int target = 4; // any two 2's
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, result);
        
        // Verify indices are different
        assertNotEquals(result[0], result[1]);
    }
    
    @Test
    public void testSolutionAtEnd() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 9, 10 };
        int target = 19; // 9 + 10
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 6, 7 };
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testNoSolutionExists() {
        int[] nums = { 1, 2, 3, 4 };
        int target = 10; // No two numbers sum to 10
        int[] result = solver.twoSum(nums, target);
        int[] expected = { -1, -1 }; // Based on your implementation's fallback
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testMinimalArray() {
        int[] nums = { 1, 2 };
        int target = 3;
        int[] result = solver.twoSum(nums, target);
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testReturnedIndicesAreValid() {
        int[] nums = { 15, 7, 2, 11 };
        int target = 9; // 7 + 2
        int[] result = solver.twoSum(nums, target);
        
        // Verify indices are within bounds
        assertTrue(result[0] >= 0 && result[0] < nums.length);
        assertTrue(result[1] >= 0 && result[1] < nums.length);
        
        // Verify indices are different
        assertNotEquals(result[0], result[1]);
        
        // Verify the sum is correct
        assertEquals(target, nums[result[0]] + nums[result[1]]);
        
        // Verify first index is smaller (based on your implementation)
        assertTrue(result[0] < result[1]);
    }
    
    @Test
    public void testPerformanceWithLargerArray() {
        // Test with a reasonably sized array for performance validation
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        int target = 1999; // 999 + 1000 (indices 998, 999)
        
        long startTime = System.nanoTime();
        int[] result = solver.twoSum(nums, target);
        long endTime = System.nanoTime();
        
        int[] expected = { 998, 999 };
        assertArrayEquals(expected, result);
        
        // Should complete reasonably quickly even with O(n²) complexity
        long duration = endTime - startTime;
        System.out.println("Execution time for 1000 elements: " + duration / 1_000_000.0 + " ms");
    }
}