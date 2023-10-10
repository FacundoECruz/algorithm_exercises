import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {

    int[] nums;
    int k;

    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Integer> asdf = new PriorityQueue<>();
        Map<Integer, Integer> repeatedFrequency = distributeValuesOnTheMap(nums);
        Map<Integer, Integer> sortedMap = sortMapByValues(repeatedFrequency);

        return extractKMostFrequentValues(k, sortedMap);
    }

    private static Map<Integer, Integer> distributeValuesOnTheMap(int[] nums) {
        Map<Integer, Integer> intsMap = new HashMap<>();
        for (int num : nums) {
            if (intsMap.containsKey(num))
                addOneToExistentKey(intsMap, num);
            else
                intsMap.put(num, 1);

        }
        return intsMap;
    }

    private static void addOneToExistentKey(Map<Integer, Integer> intsMap, int num) {
        int prevValue = intsMap.get(num);
        int newValue = prevValue + 1;
        intsMap.put(num, newValue);
    }

    private static Map<Integer, Integer> sortMapByValues(Map<Integer, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    private static int[] extractKMostFrequentValues(int k, Map<Integer, Integer> intsMap) {
        int[] topFrequentValues = new int[k];
        int addedValuesCounter = 0;

        for (Map.Entry<Integer, Integer> entry : intsMap.entrySet()) {
            if (addedValuesCounter < k) {
                topFrequentValues[addedValuesCounter] = entry.getKey();
                addedValuesCounter++;
            } else {
                break;
            }
        }
        return topFrequentValues;
    }
}
