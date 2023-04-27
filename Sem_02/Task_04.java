package Sem_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Task_04 {
    // Напишите метод, который составит строку,
    // состоящую из 100 повторений слова TEST и метод,
    // который запишет эту строку в простой текстовый файл,
    // обработайте исключения. https://metanit.com/java/tutorial/6.11.php
    public static void main(String[] args) {
        String str = "Test";
        String res = strDupl(str);
        // System.out.println(res);
        strWriter(res);
    }

    public static String strDupl(String str) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sBuilder.append(str);//стринг билдером быстрее
        }
        String res = sBuilder.toString();
        return res;
    }

    public static void strWriter(String str) {

        Charset append;
        try (FileWriter fw = new FileWriter("1.txt", true);) {//если фалсе - то перезапишет, если тру - добавит
            fw.write(str);
            fw.append('\n'); // записывает только чар
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
