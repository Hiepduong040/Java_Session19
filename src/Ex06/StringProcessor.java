package Ex06;
import java.util.List;

public interface StringProcessor {
    String process(String s);
    default void printList(List<String> list){
        System.out.println(list);
    }
}
