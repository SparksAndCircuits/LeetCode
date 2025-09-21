package leetcode.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class StrStrTest {
    private StrStr strStr;

    @BeforeEach
    void setUp(){
        strStr = new StrStr();
    }

    @Test
    void testBasicMatch(){
        assertEquals(2, strStr.strStr("hello", "ll"));
        assertEquals(0, strStr.strStr("hello", "he"));
        assertEquals(4, strStr.strStr("hello", "o"));
    }
}
