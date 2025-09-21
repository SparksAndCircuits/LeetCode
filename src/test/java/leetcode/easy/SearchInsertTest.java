package leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchInsertTest {
    private SearchInsert searchInsert;

    @BeforeEach
    void setUp(){
        searchInsert = new SearchInsert();
    }

    @Test
    void testTargetFound(){
        int[] nums = {1, 3, 5, 6};
        assertEquals(2, searchInsert.searchInsert(nums, 5));

        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(0, searchInsert.searchInsert(nums2, 1));
        assertEquals(4, searchInsert.searchInsert(nums2, 5));
        assertEquals(2, searchInsert.searchInsert(nums2, 3));
    }

    @Test
    void testTargetSmallerThanAll(){
        int[] nums = {1, 3, 5, 6};
        assertEquals(0, searchInsert.searchInsert(nums, 0));

        int[] nums2 = {5, 10, 15, 20};
        assertEquals(0, searchInsert.searchInsert(nums2, 3));
        assertEquals(0, searchInsert.searchInsert(nums2, -1));
    }
}
