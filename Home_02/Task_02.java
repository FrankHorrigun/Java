package Home_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
public class Task_02 {
    public static void main(String[] args) {
        int[] mas = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
        Date dateNow = new Date(System.currentTimeMillis());
        File file = new File("log.txt");
        file.delete();

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    int temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;
                    isSorted = false;
                }
            }

            try (FileWriter fw = new FileWriter("log.txt", true);) {
                fw.write(sdf.format(dateNow).toString());
                fw.write(Arrays.toString(mas));
                fw.append('\n');
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
