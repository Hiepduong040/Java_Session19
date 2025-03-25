import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> listFilter = new ArrayList<>();

  
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("");
        Predicate<String> isEmptyString = String::isEmpty;
        for (String s : list) {
            if (isEmptyString.test(s)) {
                listFilter.add(s);
            } else {
                System.out.println(s); 
        }
    }
}
