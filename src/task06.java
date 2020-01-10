import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = in.nextInt();
        System.out.print("Введите число y: ");
        int y = in.nextInt();
        System.out.print("Введите число z: ");
        int z = in.nextInt();
        int num = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + num);
        int i = num / 2;
        if (i > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}