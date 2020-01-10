import java.util.Scanner;

public class task10 {
    public static void main(String args[]) {
        int row, col, i, j;
        int arr[][] = new int[4][4];
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество строк (max 4) : ");
        row = scan.nextInt();
        System.out.print("Введите количество столбцов (max 4) : ");
        col = scan.nextInt();

        System.out.println("Введите " + (row * col) + " элементов массива : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.print("Первая строка матрицы, где каждый элемент умножен на 3 :\n");
        for (i = 0; i < 1; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] * 3 + " ");
            }
        }
    }
}