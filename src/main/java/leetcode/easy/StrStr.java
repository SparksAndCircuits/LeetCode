package leetcode.easy;
/*
 * LeetCode question 28: Find the index of the First occurrence in a string.
 * 
 * Given two strings needle and haystack, return teh index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

import java.util.ArrayList;

public class StrStr {
    public int strStr(String hayStack, String needle){
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(hayStack);
        for(int i = 0; i < temp.size(); i++){
            String result = temp.get(i);
            if(result == needle){
                return i;
            }else if(needle != result){
                return -1;
            }
        }

        return 0;
    }
}
