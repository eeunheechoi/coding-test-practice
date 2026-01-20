package arraystring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import arraystring.Problem1768;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Problem1768: Merge Strings Alternately
 */
class Problem1768Test {

    private Problem1768 solution;

    @BeforeEach
    void setUp() {
        solution = new Problem1768();
    }

    @Test
    @DisplayName("Example 1: Equal length strings - 'abc' and 'pqr'")
    void testExample1() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 2: word2 is longer - 'ab' and 'pqrs'")
    void testExample2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 3: word1 is longer - 'abcd' and 'pq'")
    void testExample3() {
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Both strings are empty")
    void testBothEmpty() {
        String word1 = "";
        String word2 = "";
        String expected = "";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("First string is empty")
    void testFirstEmpty() {
        String word1 = "";
        String word2 = "abc";
        String expected = "abc";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Second string is empty")
    void testSecondEmpty() {
        String word1 = "abc";
        String word2 = "";
        String expected = "abc";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Single character strings")
    void testSingleCharacters() {
        String word1 = "a";
        String word2 = "b";
        String expected = "ab";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Long strings with word1 much longer")
    void testLongStringWord1Longer() {
        String word1 = "abcdefghij";
        String word2 = "xy";
        String expected = "axbycdefghij";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Long strings with word2 much longer")
    void testLongStringWord2Longer() {
        String word1 = "xy";
        String word2 = "abcdefghij";
        String expected = "xaybcdefghij";

        String result = solution.mergeAlternately(word1, word2);

        assertEquals(expected, result);
    }
}