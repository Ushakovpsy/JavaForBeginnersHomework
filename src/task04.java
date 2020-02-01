// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
// записать в переменную int и вывести на экран.

import java.util.Scanner;

public class task04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = in.nextLine();
        int a = Integer.parseInt(bin, 2);
        System.out.printf("Десятичный формат вашего числа: %d \n", a);
    }
}