// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;

public class task18 {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Git//Hello world.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int i;

        while ((i = fileInputStream.read()) != -1) {

            System.out.print((char) i);
        }
        FileReader fr = new FileReader(file);
        LineNumberReader lnr = new LineNumberReader(fr);

        int linenumber = 0;

        while (lnr.readLine() != null) {
            linenumber++;
        }

        lnr.close();

        System.out.println("Введите " + linenumber + " строк:");

        int col = linenumber;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(inputStreamReader);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int cc = 0;
        while (!(cc == col)) {
            bufferedWriter.write(bf.readLine() + "\n");
            cc++;
        }
        bf.close();
        bufferedWriter.close();
    }
}