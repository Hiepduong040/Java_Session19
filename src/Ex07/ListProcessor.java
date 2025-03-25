package Ex07;

import java.util.List;

public interface ListProcessor {
    boolean containsNegative(List<Integer> list);
    static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
