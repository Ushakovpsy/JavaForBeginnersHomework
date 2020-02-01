// Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
// Результат вывести на экран.

import java.util.Scanner;
import static java.lang.System.out;

public class task11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        out.print("Введите строку: ");
        String a = in.nextLine();
        out.println(a);
    }
}