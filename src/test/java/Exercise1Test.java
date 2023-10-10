import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    int[] nums = {2, 1, 4, 5, 6, 7, 3};
    int k = 2;

    Exercise1 exercise = new Exercise1();

    @Test
    public void should_return_the_sorted_array() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] result = exercise.topKFrequent(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void should_return_the_most_frequent_k_elements() {
        int[] nums = {2, 1, 4, 5, 6, 7, 3, 1, 1, 2, 8, 8, 8, 8, 8, 2, 2};
        int[] expected = {8, 2};
        int[] result = exercise.topKFrequent(nums, k);
        assertArrayEquals(expected, result);
    }
}