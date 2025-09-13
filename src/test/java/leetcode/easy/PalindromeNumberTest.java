package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeChecker;

    @BeforeEach
    void setUp(){
        palindromeChecker = new PalindromeNumber();
    }

    @Nested
    @DisplayName("--- Basic Palindrome Tests ---")
    class BasicPalindromeTests{

        @Test
        @DisplayName("Should return true for single digit numbers")
        void testSingleDigitPalindromes(){
            assertTrue(palindromeChecker.isPalindrome(0), "0 should be a palindrome");
            assertTrue(palindromeChecker.isPalindrome(7), "7 should be a palindrome");
            assertTrue(palindromeChecker.isPalindrome(9),"9 should be a palindrome");
        }

        @Test
        @DisplayName("Should return true for basic palindrome")
        void testBasicPalindrome(){
            assertTrue(palindromeChecker.isPalindrome(121), "121 should be a palindrome");
            assertTrue(palindromeChecker.isPalindrome(1221), "1221 should be a palindrome");
            assertTrue(palindromeChecker.isPalindrome(12321), "12321 should be a palindrome");
        }
    }
}
