import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise5Test {

    int target = 6;

    int[] nums = {1,2,3,4,5,6,7,8};
    Exercise5 exercise = new Exercise5();

    @Test
    public void should_return_the_index_of_target() {
        int result = exercise.search(nums, target);
        int expected = 5;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void should_return_minus_one_when_target_not_found(){
        int result = exercise.search(nums, 56);
        int expected = -1;

        Assertions.assertEquals(expected, result);
    }
}
