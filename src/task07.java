// Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры
// число в переменную number. В программе должны присутствовать константы X, Y, Z.
// Программа должна сравнивать введенное значение с клавиатуры со значением констант
// и вывести на экран сообщение "Данное значение имеется в константах" если number=X
// или Y или Z. Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в переменную number: ");
        int number = in.nextInt();
        final int X = 3;
        final int Y = 5;
        final int Z = 7;
        if (number == X) {
            System.out.println("Данное значение имеется в константах");
        }
        else if (number == Y) {
            System.out.println("Данное значение имеется в константах");
        }
        else if (number == Z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}