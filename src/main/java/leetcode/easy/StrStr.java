package leetcode.easy;
/*
 * LeetCode question 28: Find the index of the First occurrence in a string.
 * 
 * Given two strings needle and haystack, return teh index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

import java.util.ArrayList;

public class StrStr {
    public int strStr(String hayStack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        if (hayStack.length() < needle.length()) {
            return -1;
        }
        
        for (int i = 0; i <= hayStack.length() - needle.length(); i++) {
            int j = 0;
            // Check character by character
            while (j < needle.length() && hayStack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // If we matched all characters in needle
            if (j == needle.length()) {
                return i;
            }
        }
        
        return -1;
    }
}
