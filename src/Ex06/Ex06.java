package Ex06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("lambda");
        list.add("Stream");
        list.add("functional");
        // su dung lambda de in ra cac phan tu trong list
        StringProcessor processor = input -> input.toLowerCase() + " - TECHNICAL";
        List<String> listLowerCase = new ArrayList<>();
        for(String s: list){
            listLowerCase.add(processor.process(s));
        }
        processor.printList(listLowerCase);
    }
}