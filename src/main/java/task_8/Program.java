package task_8;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите путь к исходному файлу");
        String sourceFilePath = new Scanner(System.in).nextLine();
        Path sourcePath = Paths.get(sourceFilePath);

        System.out.println("Введите конечную директорию");
        String targetFilePath = new Scanner(System.in).nextLine() + "\\" + sourcePath.getFileName();

        try (FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
             FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath)) {
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            fileOutputStream.write(bytes);
        }
    }
}
