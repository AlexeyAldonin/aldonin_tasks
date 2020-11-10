package task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Alex");
        words.add("Dmitry");
        words.add("Ann");
        words.add("James");
        words.add("Ferdinand");

        words = words.stream().filter(word -> word.length() < 4).collect(Collectors.toList());


        System.out.println(words);

    }
}
