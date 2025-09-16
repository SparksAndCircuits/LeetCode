package leetcode.easy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
    private ValidParentheses solution;

    @BeforeEach
    void setUp(){
        solution = new ValidParentheses();
    }

    @Nested
    @DisplayName("Valid Parentheses Cases")
    class ValidCases{
        @Test
        @DisplayName("Single pair of parentheses should be valid")
        void testSinglePairParentheses(){
            assertTrue(solution.isValid("()"));
        }

        @Test
        @DisplayName("Single pair of square brackets should be valid")
        void testSinglePairSquareParentheses(){
            assertTrue(solution.isValid("[]"));
        }

        @Test
        @DisplayName("Single pair of curly braces should be valid")
        void testSinglePairCurlyParentheses(){
            assertTrue(solution.isValid("{}"));
        }

                @Test
        @DisplayName("Multiple pairs of same type should be valid")
        void testMultiplePairsSameType() {
            assertTrue(solution.isValid("()()"));
            assertTrue(solution.isValid("[][]"));
            assertTrue(solution.isValid("{}{}"));
        }
        
        @Test
        @DisplayName("Mixed brackets in correct order should be valid")
        void testMixedBracketsCorrectOrder() {
            assertTrue(solution.isValid("()[]{}"));
            assertTrue(solution.isValid("{[]}"));
            assertTrue(solution.isValid("({[]})"));
            assertTrue(solution.isValid("[{()}]"));
        }
        
        @Test
        @DisplayName("Nested brackets should be valid")
        void testNestedBrackets() {
            assertTrue(solution.isValid("((()))"));
            assertTrue(solution.isValid("[[[]]]"));
            assertTrue(solution.isValid("{{{}}}"));
            assertTrue(solution.isValid("({[()]})"));
        }
        
        @Test
        @DisplayName("Empty string should be valid")
        void testEmptyString() {
            assertTrue(solution.isValid(""));
        }
    }

    @Nested
    @DisplayName("Invalid Parentheses Cases")
    class InvalidCases{
        @Test
        @DisplayName("Mismatched brackets should be invalid")
        void testMismatchedBrackets(){
            assertFalse(solution.isValid("(]"));
            assertFalse(solution.isValid("(}"));
            assertFalse(solution.isValid("[)"));
            assertFalse(solution.isValid("[}"));
            assertFalse(solution.isValid("{)"));
            assertFalse(solution.isValid("{]"));
        }

        @Test
        @DisplayName("Wrong order brackets should be invalid")
        void testWrongOrderBrackets() {
            assertFalse(solution.isValid("([)]"));
            assertFalse(solution.isValid("({]}"));
            assertFalse(solution.isValid("{[})"));
        }
        
        @Test
        @DisplayName("Only opening brackets should be invalid")
        void testOnlyOpeningBrackets() {
            assertFalse(solution.isValid("((("));
            assertFalse(solution.isValid("[[["));
            assertFalse(solution.isValid("{{{"));
            assertFalse(solution.isValid("({["));
        }
        
        @Test
        @DisplayName("Only closing brackets should be invalid")
        void testOnlyClosingBrackets() {
            assertFalse(solution.isValid(")))"));
            assertFalse(solution.isValid("]]]"));
            assertFalse(solution.isValid("}}}"));
            assertFalse(solution.isValid(")}]"));
        }
        
        @Test
        @DisplayName("Unbalanced brackets should be invalid")
        void testUnbalancedBrackets() {
            assertFalse(solution.isValid("(()"));
            assertFalse(solution.isValid("())"));
            assertFalse(solution.isValid("[[}"));
            assertFalse(solution.isValid("{[}]"));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        
        @ParameterizedTest
        @ValueSource(strings = {"(", ")", "[", "]", "{", "}"})
        @DisplayName("Single character should be invalid")
        void testSingleCharacter(String input) {
            assertFalse(solution.isValid(input));
        }
        
        @Test
        @DisplayName("Very long valid string should work")
        void testLongValidString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 1000; i++) {
                sb.append("()");
            }
            assertTrue(solution.isValid(sb.toString()));
        }
        
        @Test
        @DisplayName("Very long invalid string should work")
        void testLongInvalidString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 1000; i++) {
                sb.append("(");
            }
            assertFalse(solution.isValid(sb.toString()));
        }
    }
    
    @ParameterizedTest
    @CsvSource({
        "'()', true",
        "'()[]{}', true", 
        "'(]', false",
        "'([)]', false",
        "'{[]}', true",
        "'', true",
        "'(((', false",
        "')))', false",
        "'({[]})', true",
        "'[({})]', true",
        "'([{}])', true"
    })
    @DisplayName("Parameterized test for various inputs")
    void testVariousInputs(String input, boolean expected) {
        assertEquals(expected, solution.isValid(input));
    }
}
