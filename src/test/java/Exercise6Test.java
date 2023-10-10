import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6Test {

    Exercise6 exercise = new Exercise6();

    int[] profitableStock = {7, 1, 5, 3, 6, 4};
    int[] nonProfitableStock = {7, 6, 4, 3, 1};

    @Test
    public void should_return_max_profit() {
        int expected = 5;
        int result = exercise.maxProfit(profitableStock);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void should_return_zero() {
        int expected = 0;
        int result = exercise.maxProfit(nonProfitableStock);
        Assertions.assertEquals(expected, result);
    }
}
