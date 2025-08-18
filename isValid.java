import java.util.*;

/*
 * Given a string s containing just the characters '(', ')','{','}','[',']', determine if the input string is valid.
 * An input string is valid if:
 *  1) Open brackets must be closed by the same type of brackets.
 *  2) Open brackets must be closed in the correct order.
 *  3) Every close bracket has a corresponding open bracket of the same type.
 */
public class isValid {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != mapping.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid solution = new isValid();

        String[] testCases = {
                "()", // true
                "()[]{}", // true
                "(]", // false
                "([)]", // false
                "{[]}", // true
                "", // true (empty string)
                "(((", // false
                ")))", // false
                "({[]})", // true
                "([{}])", // true
                "){", // false
        };

        boolean[] expected = { true, true, false, false, true, true, false, false, true, true, false };

        System.out.println("Testing Valid Parentheses Solutions.");

        for (int i = 0; i < testCases.length; i++) {
            String test = testCases[i];
            boolean exp = expected[i];

            System.out.println("Test case: " + (i + 1) + ": \"" + test + "\"");
            System.out.println("Expected: " + exp);
            boolean result = solution.isValid(test);

            System.out.println("HashMap Stack: " + result + " ");
            System.out.println();
        }
    }
}
