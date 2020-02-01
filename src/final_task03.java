// Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.
// Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class final_task03 {
    public static void main(String[] args) throws IOException {

        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите курс доллара: ");
        double x = Double.parseDouble(a.readLine());
        System.out.println("Введите количество рублей: ");
        double y = Double.parseDouble(a.readLine());

        double z = y / x;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Итого: " + df.format(z) + " долларов");
    }
}