package task_7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n = requestForNumber();
        System.out.println(recursion(n));
    }

    static int requestForNumber () {
        System.out.println("Введите число");
        return new Scanner(System.in).nextInt();
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
}
