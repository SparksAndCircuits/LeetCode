/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M
 */

import java.util.*;

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

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1 || romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                result += romanMap.get(s.charAt(i));
            } else {
                result -= romanMap.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void mian(String[] args) {
        RomanToInt solution = new RomanToInt();

        String[] testCases = { "III", "LVIII", "MCMXC", "IV", "IX", "XL", "XC", "CD", "CM" };
        for (String test : testCases) {
            int result = solution.romanToInt(test);
            System.out.println("'" + test + "' -> " + result);
        }
    }
}