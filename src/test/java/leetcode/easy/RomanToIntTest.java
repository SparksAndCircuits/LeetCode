package leetcode.easy;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class RomanToIntTest {
    private RomanToInt converter;

    @Before
    public void setUp(){
        converter = new RomanToInt();
    }

    @Test
    public void testBasicRomanNumerals() {     
        assertEquals("Should convert 'I' to 1", 1, converter.romanToInt("I"));
        assertEquals("Should convert 'V' to 5", 5, converter.romanToInt("V"));
        assertEquals("Should convert 'X' to 10", 10, converter.romanToInt("X"));
    }
    
}