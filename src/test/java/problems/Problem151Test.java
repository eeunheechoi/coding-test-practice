package problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem151Test {
    private Problem151 solution;

    @BeforeEach
    void setUp() {
        solution = new Problem151();
    }

    @Test
    @DisplayName("Example 1:\\n\"" +
            "Input: s = \"the sky is blue\"\n" +
            "     Output: \"blue is sky the\"")
    void testExample1() {
        String input = "the sky is blue";
        String expected = "blue is sky the";

        String result = solution.reverseWords(input);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 1:\\n\"" +
            "Input: s = \"  hello world  \"\n" +
            "     Output: \"world hello\"")
    void testExample2() {
        String input = "  hello world  ";
        String expected = "world hello";

        String result = solution.reverseWords(input);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 1:\\n\"" +
            "Input: s = \"a good   example\"\n" +
            "     Output: \"example good a\"")
    void testExample3() {
        String input = "a good   example";
        String expected = "example good a";

        String result = solution.reverseWords(input);

        assertEquals(expected, result);
    }
}
