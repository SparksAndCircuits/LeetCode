package leetcode.easy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class RomanToIntTest {
    private RomanToInt solution;

    @BeforeEach
    void setup(){
        solution = new RomanToInt();
    }

    @Test
    @DisplayName("Test basic Roman numerals")
    void testBasicRomanNumerals(){
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(50, solution.romanToInt("L"));
        assertEquals(100, solution.romanToInt("C"));
        assertEquals(500, solution.romanToInt("D"));
        assertEquals(1000, solution.romanToInt("M"));
    }
    
    @Test
    @DisplayName("Test additive Roman numerals")
    void testAdditiveRomanNumerals() {
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(2, solution.romanToInt("II"));
        assertEquals(6, solution.romanToInt("VI"));
        assertEquals(8, solution.romanToInt("VIII"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(27, solution.romanToInt("XXVII"));
    }
    
    @Test
    @DisplayName("Test subtractive Roman numerals")
    void testSubtractiveRomanNumerals() {
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(40, solution.romanToInt("XL"));
        assertEquals(90, solution.romanToInt("XC"));
        assertEquals(400, solution.romanToInt("CD"));
        assertEquals(900, solution.romanToInt("CM"));
    }
    
    @Test
    @DisplayName("Test complex Roman numerals")
    void testComplexRomanNumerals() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(1990, solution.romanToInt("MCMXC"));
        assertEquals(1444, solution.romanToInt("MCDXLIV"));
        assertEquals(3749, solution.romanToInt("MMMDCCXLIX"));
    }
    
    @ParameterizedTest
    @DisplayName("Test various Roman numerals with CSV source")
    @CsvSource({
        "I, 1",
        "II, 2", 
        "III, 3",
        "IV, 4",
        "V, 5",
        "IX, 9",
        "X, 10",
        "XL, 40",
        "L, 50",
        "XC, 90",
        "C, 100",
        "CD, 400",
        "D, 500",
        "CM, 900",
        "M, 1000",
        "LVIII, 58",
        "MCMXC, 1990",
        "MMCDXLIV, 2444"
    })
    void testRomanNumeralsParameterized(String roman, int expected) {
        assertEquals(expected, solution.romanToInt(roman));
    }
    
    @Test
    @DisplayName("Test edge cases")
    void testEdgeCases() {
        // Single character
        assertEquals(1, solution.romanToInt("I"));
        assertEquals(1000, solution.romanToInt("M"));
        
        // Multiple subtractions
        assertEquals(14, solution.romanToInt("XIV"));
        assertEquals(19, solution.romanToInt("XIX"));
        assertEquals(44, solution.romanToInt("XLIV"));
        assertEquals(49, solution.romanToInt("XLIX"));
        
        // Large numbers
        assertEquals(3999, solution.romanToInt("MMMCMXCIX")); // Maximum valid Roman numeral
    }
    
    @Test
    @DisplayName("Test boundary values")
    void testBoundaryValues() {
        // Smallest valid Roman numeral
        assertEquals(1, solution.romanToInt("I"));
        
        // Common boundary cases
        assertEquals(10, solution.romanToInt("X"));
        assertEquals(100, solution.romanToInt("C"));
        assertEquals(1000, solution.romanToInt("M"));
        
        // Numbers just before and after subtractive cases
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(6, solution.romanToInt("VI"));
    }
    
    @Test
    @DisplayName("Test historical dates")
    void testHistoricalDates() {
        assertEquals(1776, solution.romanToInt("MDCCLXXVI")); // US Independence
        assertEquals(2000, solution.romanToInt("MM")); // Millennium
        assertEquals(1969, solution.romanToInt("MCMLXIX")); // Moon landing
        assertEquals(2023, solution.romanToInt("MMXXIII")); // Recent year
    }
    
    @Test
    @DisplayName("Test performance with long Roman numerals")
    void testPerformance() {
        // Test with a long but valid Roman numeral
        String longRoman = "MMMDCCCLXXXVIII"; // 3888
        assertEquals(3888, solution.romanToInt(longRoman));
        
        // Test multiple repeated characters
        String repeatedM = "MMMM"; // 4000 (though technically invalid in classical Roman)
        // Note: LeetCode allows this, so we test it
        assertEquals(4000, solution.romanToInt(repeatedM));
    }
    
    @Test
    @DisplayName("Test LeetCode examples")
    void testLeetCodeExamples() {
        // Direct examples from LeetCode problem description
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(58, solution.romanToInt("LVIII")); // L = 50, V= 5, III = 3
        assertEquals(1994, solution.romanToInt("MCMXCIV")); // M = 1000, CM = 900, XC = 90, IV = 4
    }
}
