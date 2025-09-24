package leetcode.easy;
/*
 * LeetCode question 58: Length of last word.
 * 
 * Given a string s constisting of words and spaces, return the length of the last word in the string.
 * 
 * A word is maximal substring consisting of non-space characters only.
 */

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        if (s == null) {
            return 0;
        }

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
