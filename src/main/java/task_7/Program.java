package task_7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n = requestForNumber();
        StringBuilder out = new StringBuilder(recursion(n));
        System.out.println(out.reverse());
    }

    static int requestForNumber () {
        System.out.println("Введите число");
        return new Scanner(System.in).nextInt();
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return n + " " + recursion(n - 1);
    }
}
