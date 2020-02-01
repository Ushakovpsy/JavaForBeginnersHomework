// Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2. Размер массива задается пользователем.

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задать размер массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Ввод данных:");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        System.out.print("Данные массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + a[i] * 2);
        }
        System.out.println();
    }
}