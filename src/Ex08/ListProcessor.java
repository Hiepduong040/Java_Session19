package Ex08;

import java.util.List;
import java.util.function.Predicate;

public interface ListProcessor {
    int sumOddNumbers(List<Integer> list);
    static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    default boolean checkOdd(List<Integer> list){
       Predicate<Integer> isOdd = i -> i % 2 != 0;
       for (int num : list) {
           if (isOdd.test(num)) {
               return true;
           }
       }
         return false;
    }
}
