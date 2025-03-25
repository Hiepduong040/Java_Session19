package Ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> listFilter = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("");
        for(String s : list) {
            if(s.isEmpty()) {
                listFilter.add(s);
            } else {
                System.out.println(s);
            }

        }
    }
}
