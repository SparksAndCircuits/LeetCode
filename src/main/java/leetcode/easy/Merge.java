package leetcode.easy;

/*
 * LeetCode question 88: Merge sorted array.
 * 
 * You are given integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the numbers of elements in nums1 and nums2 respectively.
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m+n, where m elements denotes the elements that should be merged, and the last n elements are set to 0 and should be ignored, nums2 has a length of n.
 * 
 * Constraints:
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * -10^9 <= nums1[i], nums2[j] <= 10^9
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
    }
}
