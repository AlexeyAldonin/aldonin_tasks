package task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int m = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = ((i + 1) * (j + 1) * 2) + 1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
