import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        int current = 1;
        iterateLeftToRight(nums, answer, current);
        current = 1;

        iterateRightToLeft(nums, answer, current);
        return answer;
    }

    public static void iterateRightToLeft(int[] nums, int[] answer, int current) {
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= current;
            current *= nums[i];
            System.out.println("answer: " + Arrays.toString(answer));
            System.out.println("current: " + current);
            System.out.println("nums: " + Arrays.toString(nums));
            System.out.println("******************************");
        }
    }

    public static void iterateLeftToRight(int[] nums, int[] answer, int current) {
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= current;
            current *= nums[i];
        }
    }

}