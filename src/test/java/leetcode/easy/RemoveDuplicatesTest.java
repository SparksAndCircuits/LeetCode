package leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    private final RemoveDuplicates solution = new RemoveDuplicates();

    @Test
    void testArrayWithDuplicates(){
        int[] nums = {1, 1, 2};
        int expectedLength = 2;
        int[] expectedNums = {1, 2};

        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums,actualLength));
    }

    @Test
    void testArrayWithManyDuplicates(){
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength = 5;
        int[] expectedNums = {0, 1, 2, 3, 4};

        int actualLength = solution.removeDuplicates(nums);
        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualLength));
    }

    @Test
    void testArrayWithNoDuplicates(){
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        int[] expectedNums = {1, 2, 3, 4, 5};

        int actualLength = solution.removeDuplicates(nums);
        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualLength));
    }

    @Test
    void testEmptyArray(){
        int[] nums ={};
        int expectedLength = 0;
        int[] expectedNums = {};
        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualLength));
    }

    @Test
    void testSingleElementArray(){
        int[] nums = {5};
        int expectedLength = 1;
        int[] expectedNums = {5};
        int actualLength = solution.removeDuplicates(nums);

        assertEquals(expectedLength, actualLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualLength));
    }
}
