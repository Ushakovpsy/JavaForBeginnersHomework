import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("string: " + S);
        System.out.println("int: " + X);
        System.out.println("double: " + Y);
    }
}