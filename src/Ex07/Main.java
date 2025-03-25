package Ex07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // tao danh sach test
        List<Integer > list1 = new ArrayList<>();
        List<Integer > list2 = new ArrayList<>();
        list1.add(5);
        list1.add(-2);
        list1.add(10);
        list1.add(0);
        list1.add(-7);
        list2.add(3);
        list2.add(6);
        list2.add(7);

        // test 1:
        ListProcessor.printList(list1);
        if(new ListProcessorImpl().containsNegative(list1)) {
            System.out.println("Danh sách chứa số âm");
        } else {
            System.out.println("Dan sách không chứ số âm");
        }
        // test 2:
        ListProcessor.printList(list2);
        if(new ListProcessorImpl().containsNegative(list2)) {
            System.out.println("Danh sách chứa số âm");
        } else {
            System.out.println("Dan sách không chứa số âm");
        }
    }
}
