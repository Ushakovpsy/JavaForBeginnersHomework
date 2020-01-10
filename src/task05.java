import java.util.Scanner;

public class task05 {
    public static void main(String args[]) {
        int num;
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Таблица умножения для числа " + num);
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;
        System.out.println(num + "*" + a + " = " + (num * a));
        System.out.println(num + "*" + b + " = " + (num * b));
        System.out.println(num + "*" + c + " = " + (num * c));
        System.out.println(num + "*" + d + " = " + (num * d));
        System.out.println(num + "*" + e + " = " + (num * e));
        System.out.println(num + "*" + f + " = " + (num * f));
        System.out.println(num + "*" + g + " = " + (num * g));
        System.out.println(num + "*" + h + " = " + (num * h));
        System.out.println(num + "*" + i + " = " + (num * i));
        System.out.println(num + "*" + j + " = " + (num * j));
    }
}