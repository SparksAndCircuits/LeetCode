package leetcode.easy;

/*
 * LeetCode Question 13: Roman to integer
 * 
 * Roman numerals are reperesented by seven different symbols I,V,X,L,C,D and M.
 * 
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInt {
    public int length;
    public String I;
    public String V;
    public String X;
    public String L;
    public String C;
    public String D;
    public String M;
    public int value = 0;

    public int romanToInt(String s) {
        for (int i = s.length() ; i >= 0; i--) {
            if (s.equals(I)) {
                value += 1;
                return value;
            } else if (s.equals(V)) {
                value += 5;
                return value;
            } else if (s.equals(X)) {
                value += 10;
                return value;
            } else if (s.equals(L)) {
                value += 50;
                return value;
            } else if (s.equals(C)) {
                value += 100;
                return value;
            } else if (s.equals(D)) {
                value += 500;
                return value;
            } else if (s.equals(M)) {
                value += 1000;
                return value;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        RomanToInt converter = new RomanToInt();
        System.out.println("Should convert 'I' to 1: " + converter.romanToInt("I"));
        System.out.println("Should convert 'V' to 10: " + converter.romanToInt("V"));
    }
}
