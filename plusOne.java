/*
 * leetCode question 66 Plus one
 * 
 * You are given a large integer represented as an integer array digits, where each digit[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left to right order. The large integer does not contain any leading 0's
 * 
 * Increment the large integer by one and return teh resulting array of digits.
 */
public class plusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        plusOne solution = new plusOne();

        int[] test1 = { 1, 2, 3 };
        int[] test2 = { 4, 3, 2, 1 };
        int[] test3 = { 9 };
        int[] test4 = { 1, 9, 9 };
        int[] test5 = { 9, 9, 9 };
        int[] test6 = { 0 };

        System.out.println(java.util.Arrays.toString(solution.plusOne(test1)));
        System.out.println(java.util.Arrays.toString(solution.plusOne(test2)));
        System.out.println(java.util.Arrays.toString(solution.plusOne(test3)));
        System.out.println(java.util.Arrays.toString(solution.plusOne(test4)));
        System.out.println(java.util.Arrays.toString(solution.plusOne(test5)));
        System.out.println(java.util.Arrays.toString(solution.plusOne(test6)));
    }
}
