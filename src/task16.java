import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task16 {
    public static void main(String args[]) {
        String a;
        try (BufferedReader br = new BufferedReader(new FileReader("C://Git//Hello world.txt"))) {
            while ((a = br.readLine()) != null) {
                System.out.println(a);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
