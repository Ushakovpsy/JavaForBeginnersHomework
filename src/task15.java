// Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Использовать пузырьковый метод сортировки.

import java.util.Arrays;
import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задать размер массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Ввод данных:");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        bubbleSort(a);
    }
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}