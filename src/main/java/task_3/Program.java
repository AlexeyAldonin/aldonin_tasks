package task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        boolean wordIsCorrect = false;
        String input = "";
        while (!wordIsCorrect) {
            System.out.println("Введите слово, начинающееся на букву \"А\"");
            input = new Scanner(System.in).nextLine();
            wordIsCorrect = input.startsWith("А");
        }
        System.out.println("Спасибо за частие!");
    }
}
