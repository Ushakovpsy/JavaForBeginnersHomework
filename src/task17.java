// Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать,
// какой принцип остановки записи в файл он должен подать.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task17 {

    public static void main(String[] args) {

        String str;
        Scanner in =
                new Scanner(System.in);
        System.out.println("Для завершения программы, необходимо ввести команду - stop");

        try (FileWriter fw = new FileWriter("C://Git//notes.txt")) {
            do {
                System.out.println("введите текст:");
                str = in.nextLine();

                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            }
            while (str.compareTo("stop") != 0);
        } catch (IOException FileWriter) {
            System.out.println("Ошибка");
        }
    }
}