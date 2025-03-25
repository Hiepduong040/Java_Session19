package Ex02;

import java.util.function.Function;


public class Ex02 {
    public static void main(String[] args) {
        Function<Integer,Integer> f = x -> x * x + 3 * x + 2;
        int f1 = f.apply(1);
        int f2 = f.apply(2);
        int f3 = f.apply(3);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
