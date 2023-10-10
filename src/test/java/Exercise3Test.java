import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise3Test {

    Exercise3 exercise = new Exercise3();

    @Test
    public void should_return_true_when_empty_string_is_passed() {
        boolean result = exercise.isPalindrome("");
        Assertions.assertTrue(result);
    }

    @Test
    public void should_return_lowercase_and_formatted() {
        String formatMe = "I Want To Be Formatted";
        String expected = "iwanttobeformatted";
        String result = exercise.formatString(formatMe);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void should_return_the_reversed_string(){
        String reverseMe = "reverse";
        String expected = "esrever";
        String result = exercise.reverseString(reverseMe);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void should_return_true_if_is_palindrome() {
        String palindrome = "Se es o no se es";
        boolean result = exercise.isPalindrome(palindrome);
        Assertions.assertTrue(result);
    }

    @Test
    public void should_return_false_if_is_not_palindrome() {
        String notPalindrome = "Argentina Campeon 2022";
        boolean result = exercise.isPalindrome(notPalindrome);
        Assertions.assertFalse(result);
    }
}
