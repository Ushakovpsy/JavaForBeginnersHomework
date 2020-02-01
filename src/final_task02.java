// Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Scanner;
import java.util.Arrays;

public class final_task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задать размер массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Ввод данных:");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        InsertionSort(a);
    }

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int b = i - 1;
            while (b >= 0 && arr[b] > a) {
                arr[b + 1] = arr[b];
                b--;
            }
            arr[b + 1] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}