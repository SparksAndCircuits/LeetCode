package leetcode.easy;

/*
 * LeetCode question 67: Add binary
 * 
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {
    public String addBinary(String a, String b){
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;// This is a pointer that starts from the right side.
        int j = b.length() - 1;// This is another pointer.
        int carry = 0;

        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry; // We start the sum from the carry. The sum will be zero as well as the carry will be zero.

            if(i >= 0){
                sum += a.charAt(i) - '0';//It is reperesented as a string so we have to convert to integers. We use character codes to convert it. The character code for 0 is 48 and the character code for 1 is 49.
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum/2;
        }

        return result.reverse().toString();
    }
}
