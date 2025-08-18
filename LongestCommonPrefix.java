/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string ""
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[][] testCases = {
                { "Flower", " Flow", "Flight" },
                { "Dog", "racecar", "car" },
                { "Interspecies", "interstellar", "interstate" },
                { "" },
                { "a" },
                { "ab", "a" }
        };

        String[] expected = { "fl", "", "inters", "", "a", "a" };

        for (int i = 0; i < testCases.length; i++) {
            String result = solution.longestCommonPrefix(testCases[i]);
            System.out.println("Result: \"" + result + "\"" + (result.equals(expected[i])));

            System.out.println();
        }
    }
}
