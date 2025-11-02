package problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem1431Test {
    private Problem1431 solution;

    @BeforeEach
    void setUp() {
        solution = new Problem1431();
    }

    @Test
    @DisplayName("Example 1: candies = [2,3,5,1,3], extraCandies = 3, result :  [true,true,true,false,true] ")
    void testExample1() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true,true,true,false,true);

        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);

        assertEquals(expected, result);
    }

}
