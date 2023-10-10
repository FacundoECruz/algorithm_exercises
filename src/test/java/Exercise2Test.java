import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercise2Test {
    public static final int INITIAL_VALUE = 1;
    Exercise2 exercise = new Exercise2();

    int[] nums = {2, 3, 5, 1, 4};
    int[] answer = new int[nums.length];

    @Test
    public void should_return_left_multiplications() {
        Arrays.fill(answer, INITIAL_VALUE);
        Exercise2.iterateLeftToRight(nums, answer, INITIAL_VALUE);
        int[] expected = {1, 2, 6, 30, 30};
        assertArrayEquals(expected, answer);
    }

    @Test
    public void should_return_multiple_of_itself() {
        int[] expected = {60, 40, 24, 120, 30};
        int[] result = exercise.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }
}
