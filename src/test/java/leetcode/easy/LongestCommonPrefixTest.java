package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix solution;

    @BeforeEach
    void setup() {
        solution = new LongestCommonPrefix();
    }

    @Test
    @DisplayName("Test with typical case - common prefix exists")
    void testTypicalCase() {
        String[] input = { "flower", "flow", "flight" };
        String expected = "fl";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return 'fl' as the longest common prefix");
    }

    @Test
    @DisplayName("Test with no common prefix")
    void testNoCommonPrefix() {
        String[] input = { "dog", "racecar", "car" };
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return empty string when no common prefix exists");
    }

    @Test
    @DisplayName("Test with longer common prefix")
    void testLongerCommonPrefix() {
        String[] input = { "interstellar", "internet", "interval" };
        String expected = "inter";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return 'inter' as the longest common prefix");
    }

    @Test
    @DisplayName("Test with single String")
    void testSingleString() {
        String[] input = { "algorithm" };
        String expected = "algorithm";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return the string itself when only one string is provided");
    }

    @Test
    @DisplayName("Test with empty array")
    void testEmpyArray() {
        String[] input = {};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return empty string for empty array");
    }

    @Test
    @DisplayName("Test with null array")
    void testNullArray() {
        String[] input = null;
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return a empty string for a null array");
    }

    @Test
    @DisplayName("Test with empty string among others")
    void testEmptyStringAmongOthers() {
        String[] input = { "flower", "", "flight" };
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return an empty string when any string in the array is empty");
    }

    @Test
    @DisplayName("Test with all identical strings")
    void testIdenticalStrings() {
        String[] input = { "test", "test", "test" };
        String expected = "test";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return the full string when all strings are identical");
    }

    @Test
    @DisplayName("Test with single characters")
    void testSingleCharacterStrings() {
        String[] input = { "a", "a", "a" };
        String expected = "a";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should handle single character strings correctly");
    }

    @Test
    @DisplayName("Test with different lengths")
    void testDifferentLengthStrings() {
        String[] input = { "programming", "program", "prog" };
        String expected = "prog";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should handle strings of different lengths correctly");
    }

    @Test
    @DisplayName("Test with one character common prefix")
    void testOneCharCommonPrefix() {
        String[] input = { "apple", "application", "approach" };
        String expected = "app";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should return 'app' as the common prefix");
    }

    @Test
    @DisplayName("Test with special characters")
    void testSpecialCharacters() {
        String[] input = { "@hello", "@help", "@hero" };
        String expected = "@he";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should hadnle special characters correctly");
    }

        @Test
    @DisplayName("Test with numeric strings")
    void testNumericStrings() {
        String[] input = {"123456", "123789", "123"};
        String expected = "123";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should handle numeric strings correctly");
    }
    
    @Test
    @DisplayName("Test case sensitivity")
    void testCaseSensitivity() {
        String[] input = {"Hello", "hello", "HELLO"};
        String expected = "";
        String actual = solution.longestCommonPrefix(input);
        assertEquals(expected, actual, "Should be case sensitive - different cases should not match");
    }
}
