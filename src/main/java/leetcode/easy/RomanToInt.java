package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode Question 13: Roman to integer
 * 
 * Roman numerals are represented  by seven different symbols I,V,X,L,C,D and M.
 * 
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < n - 1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                total -= romanMap.get(s.charAt(i));
            } else {
                total += romanMap.get(s.charAt(i));
            }
        }

        return total;
    }
}