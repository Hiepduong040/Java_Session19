package Ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b ");
        int b = scanner.nextInt();
        System.out.println("a + b = " + MathOperations.add(b, a));
        System.out.println("a - b = " + MathOperations.sub(a, b));
        System.out.println("a * b = " + MathOperations.mul(a, b));
        System.out.println("a / b = " + MathOperations.div(a, b));
    }
}
