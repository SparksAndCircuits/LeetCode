package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTest {
    private Merge solution;

    @BeforeEach
    public void setUp() {
        solution = new Merge();
    }

    @Test
    public void testBasicMerge() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int[] expected = { 1, 2, 2, 3, 5, 6 };

        solution.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testEmptyNums2() {
        int[] nums1 = { 1 };
        int[] nums2 = {};
        int[] expected = { 1 };

        solution.merge(nums1, 0, nums2, 1);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testEmptyNums1() {
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        int[] expected = { 1 };

        solution.merge(nums1, 0, nums2, 1);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testNums1ElementsAllLarger() {
        int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        int[] nums2 = { 1, 2, 3 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };

        solution.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testNums2ElementsAllLarger() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 4, 5, 6 };
        int[] expected = { 1, 2, 2, 2, 2, 3 };

        solution.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testWithDuplicates() {
        int[] nums1 = { 1, 2, 2, 0, 0, 0 };
        int[] nums2 = { 2, 2, 3 };
        int[] expected = { 1, 2, 2, 2, 2, 3 };

        solution.merge(nums1, 3, nums2, 3);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] nums1 = { -3, -1, 0, 0, 0 };
        int[] nums2 = { -2, 3 };
        int[] expected = { -3, -2, -1, 1 };

        solution.merge(nums1, 2, nums2, 2);

        assertArrayEquals(expected, nums1);
    }

    @Test
    public void testSingleElementEach() {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1 };
        int[] expected = { 1, 2 };

        solution.merge(nums1, 1, nums2, 1);

        assertArrayEquals(expected, nums1);
    }
}
