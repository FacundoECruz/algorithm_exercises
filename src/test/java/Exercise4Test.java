import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4Test {

    Exercise4 exercise = new Exercise4();
    @Test
    public void should_return_true_if_is_valid_string(){
        boolean result = exercise.isValid("([]){}");
        Assertions.assertTrue(result);
    }
}
