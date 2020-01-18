import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String a = in.nextLine();
        int al = a.length();
        System.out.print("Введите строку 2: ");
        String b = in.nextLine();
        int bl = b.length();

        if (al > bl) System.out.println(a);
        else if (al < bl) System.out.println(b);
        else
            System.out.println("Строки имеют одинаковую длинну");
    }
}