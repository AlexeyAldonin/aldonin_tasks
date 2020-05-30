package task_1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("max: " + arrayMaxValue(arr));
        System.out.println("min: " + arrayMinValue(arr));
        System.out.println("average: " + average(arr));
    }

    static int arrayMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int arrayMinValue (int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int average (int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum/arr.length;
    }
}
