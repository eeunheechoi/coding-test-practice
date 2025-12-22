package problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Problem345: Reverse Vowels of a String
 */
class Problem345Test {

    private Problem345 solution;

    @BeforeEach
    void setUp() {
        solution = new Problem345();
    }

    @Test
    @DisplayName("Example 1: Input: s = IceCreAm, Output: AceCreIm")
    void testExample1() {
        String input = "IceCreAm";
        String expected = "AceCreIm";

        String result = solution.reverseVowels(input);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 2: Input: s = leetcode, Output: leotcede")
    void testExample2() {
        String input = "leetcode";
        String expected = "leotcede";

        String result = solution.reverseVowels(input);

        assertEquals(expected, result);
    }

}