package Ex08;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public int sumOddNumbers(List<Integer> list) {
        int sum = 0;
        Predicate<Integer> isOdd = i -> i % 2 != 0;
        for (int num : list) {
            if (isOdd.test(num)) {
                sum += num;
            }
        }
        return sum;
    }


}