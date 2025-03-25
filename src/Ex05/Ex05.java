package Ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith("A") && list.get(i).length() >=5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
