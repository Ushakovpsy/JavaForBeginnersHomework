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