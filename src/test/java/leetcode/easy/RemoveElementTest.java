package leetcode.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    @Test
    void testRemoveElement(){
        RemoveElement solution = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expectedLength1 = 2;
        int newLength1 = solution.removeElement(nums1, val1);

        assertEquals(expectedLength1, newLength1, "The returned length should be correct for a standard case.");
        int[] expectedNums1 = {2,2};

        for(int i = 0; i <expectedLength1; i++){
            assertEquals(expectedNums1[i], nums1[i], "Elements should be correctly placed at the beginning of the array.");
        }

        int[] nums2 = {1, 2, 4, 5};
        int val2 = 3;
        int expectedLength2 =4;
        int newLength2 = solution.removeElement(nums2, val2);
        assertEquals(expectedLength2, newLength2, " The returned length should be the same as teh original length when no elelmnents are removed.");
    }
}
