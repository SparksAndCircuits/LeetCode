package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class AddBinaryTest {
    private AddBinary solution;

    @BeforeEach
    void setUp() {
        solution = new AddBinary();
    }

    @Test
    @DisplayName("Basic addition with no carry")
    void testBasicAdditionNoCarry() {
        assertEquals("10", solution.addBinary("1", "1"));
        assertEquals("11", solution.addBinary("10", "1"));
    }
}
