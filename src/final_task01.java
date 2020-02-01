// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
// записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java,
// для перевода числа из одной системы счисления в другую.

import java.util.Scanner;

public class final_task01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = in.nextLine();
        int a = bin.length();
        int c = 0;
        for (int i = a - 1, d = 1; i >= 0; i--, d *= 2) {
            c += (bin.charAt(i) - '0') * d;
        }

        System.out.println("Десятичный формат числа "+ bin + " = "+ c);
    }
}
