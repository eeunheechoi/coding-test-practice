package arraystring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import arraystring.Problem1071;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1071Test {
    private arraystring.Problem1071 solution;

    @BeforeEach
    void setUp() {
        solution = new Problem1071();
    }

    @Test
    @DisplayName("Example 1: str1 = ABABAB, str2 = ABAB, result : AB")
    void testExample1() {
        String word1 = "ABABAB";
        String word2 = "ABAB";
        String expected = "AB";

        String result = solution.gcdOfStrings(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 1: str1 = ABCABC, str2 = ABC, result : ABC")
    void testExample2() {
        String word1 = "ABCABC";
        String word2 = "ABC";
        String expected = "ABC";

        String result = solution.gcdOfStrings(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 1: str1 = LEET, str2 = CODE, result : '")
    void testExample3() {
        String word1 = "LEET";
        String word2 = "CODE";
        String expected = "";

        String result = solution.gcdOfStrings(word1, word2);

        assertEquals(expected, result);
    }
}
