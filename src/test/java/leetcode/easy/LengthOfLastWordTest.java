package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class LengthOfLastWordTest {
    private LengthOfLastWord solution;

    @BeforeEach
    void setUp(){
        solution = new LengthOfLastWord();
    }

    @Test
    @DisplayName("Basic test case: 'Hello World'")
    void testBasicCases(){
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    @DisplayName("Example from problem: 'luffy is still joyboy'")
    void testExampleCase(){
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    @DisplayName("Single character word: 'a'")
    void testSingleCharacter(){
        assertEquals(1, solution.lengthOfLastWord("a"));
    }

    @Test
    @DisplayName("Single word: 'Hello'")
    void testSingleWord(){
        assertEquals(5, solution.lengthOfLastWord("Hello"));
    }

    @Test
    @DisplayName("String with trailing spaces: 'Hello World   '")
    void testTrailingSpaces() {
        assertEquals(5, solution.lengthOfLastWord("Hello World   "));
    }
    
    @Test
    @DisplayName("String with leading spaces: '   Hello World'")
    void testLeadingSpaces() {
        assertEquals(5, solution.lengthOfLastWord("   Hello World"));
    }
    
    @Test
    @DisplayName("String with multiple spaces between words: 'Hello    World'")
    void testMultipleSpacesBetween() {
        assertEquals(5, solution.lengthOfLastWord("Hello    World"));
    }
    
    @Test
    @DisplayName("String with spaces everywhere: '   Hello    World   '")
    void testSpacesEverywhere() {
        assertEquals(5, solution.lengthOfLastWord("   Hello    World   "));
    }
    
    @Test
    @DisplayName("Single character with trailing space: 'a '")
    void testSingleCharWithSpace() {
        assertEquals(1, solution.lengthOfLastWord("a "));
    }
    
    @Test
    @DisplayName("Multiple single character words: 'a b c'")
    void testMultipleSingleChars() {
        assertEquals(1, solution.lengthOfLastWord("a b c"));
    }
    
    @Test
    @DisplayName("Long word at end: 'This is supercalifragilisticexpialidocious'")
    void testLongLastWord() {
        assertEquals(34, solution.lengthOfLastWord("This is supercalifragilisticexpialidocious"));
    }
    
    @Test
    @DisplayName("Two words only: 'Hello World'")
    void testTwoWords() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }
    
    @Test
    @DisplayName("Words with numbers and letters: 'test123 word456'")
    void testWordsWithNumbers() {
        assertEquals(7, solution.lengthOfLastWord("test123 word456"));
    }

    @Test
    @DisplayName("Minimum length string: single character")
    void testMinimumConstraint() {
        assertEquals(1, solution.lengthOfLastWord("x"));
    }

    @Test
    @DisplayName("String with maximum spaces and minimum word")
    void testMaxSpacesMinWord() {
        String input = "    a";
        assertEquals(1, solution.lengthOfLastWord(input));
    }
}
