package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;
    int[] nums;
    int[] result;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void onlyTwoColors(){

        nums = new int[] {0,1,1,0,1,1,0};

        result = new int[] {0,0,0,1,1,1,1};

        solution.sortColors(nums);

        assertEquals(Arrays.toString(result), Arrays.toString(nums));

    }

    @Test
    public void ThreeColors(){

        nums = new int[] {2,1,1,0,2,1,0,2,1,2,0,2};

        result = new int[] {0,0,0,1,1,1,1,2,2,2,2,2};

        solution.sortColors(nums);

        assertEquals(Arrays.toString(result), Arrays.toString(nums));

    }
}
