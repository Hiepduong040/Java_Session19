package Ex08;

import Ex08.ListProcessor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListProcessor listProcessor = new ListProcessorImpl();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(10);
        list1.add(13);
        list1.add(6);
        list1.add(3);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        // test list1
        ListProcessor.printList(list1);
        // tong cac so le:
        System.out.println("Tong cac so le trong list 1: " + listProcessor.sumOddNumbers(list1));
        if (listProcessor.checkOdd(list1)) {
            System.out.println("Cac phan tu le:" + listProcessor.checkOdd(list1));
        } else {
            System.out.println("Khong co phan tu le");
        }
        // test list2
        ListProcessor.printList(list2);
        // tong cac so le:
        System.out.println("Tong cac so le trong list 2: " + listProcessor.sumOddNumbers(list2));
        if (listProcessor.checkOdd(list2)) {
            System.out.println("Cac phan tu le:" + listProcessor.checkOdd(list2));
        } else {
            System.out.println("Khong co phan tu le");
        }
    }

}
