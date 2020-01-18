import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        String a;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите строку с пробелами: ");
            a = in.nextLine();
        }
        String b = a.replaceAll(" ", "");
                System.out.println(b);
    }
}