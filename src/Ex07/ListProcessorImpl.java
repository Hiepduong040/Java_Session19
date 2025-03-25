package Ex07;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {

    @Override
    public boolean containsNegative(List<Integer> list) {
        // Su dung predicate de kiem tra xem co so am trong list hay khong
        Predicate<Integer> isNegative = i -> i < 0; // new i < 0 thi so no la so am
        for (int num : list) {
            if (isNegative.test(num)) {
                return true;
            }
        }
        return false;
    }
}
