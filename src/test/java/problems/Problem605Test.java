package problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem605Test {
    private Problem605 solution;

    @BeforeEach
    void setUp() {
        solution = new Problem605();
    }

    @Test
    @DisplayName("Example 1: Input: flowerbed = [1,0,0,0,1], n = 1, Output: true")
    void testExample1() {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean expected = true;
        boolean result = solution.canPlaceFlowers(flowerbed, n);

        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Example 1: Input: flowerbed = [1,0,0,0,1], n = 2, Output: false")
    void testExample2() {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        boolean expected = false;
        boolean result = solution.canPlaceFlowers(flowerbed, n);

        assertEquals(expected, result);
    }


}
