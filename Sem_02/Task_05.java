package Sem_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.*;

// import Sem_02.MyLogger;

public class Task_05 {
    // Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    // ArrayList и рекурсией по всем подкаталогам
    // Напишите метод, который выведет массив, возвращенный предыдущим методом в
    // файл.
    // Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
    // исключения, оно должно записаться в лог-файл.
    // https://metanit.com/java/tutorial/6.11.php
    // [ “Sem1”, “Sem2”]

    private static final Logger LOG = Logger.getLogger(Logger.class.getName());

    public static void main(String[] args) throws IOException {

        FileHandler fh = new FileHandler("mylog.log", true);

        LOG.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        LOG.setUseParentHandlers(false);
        LOG.setLevel(Level.ALL);
        LOG.log(Level.INFO, "Message");
        String path = getPathName();
        dirSructure(path);
        String filesInDir = fileListToArray.toString();
        System.out.println(filesInDir);
        strToFile(filesInDir);

    }

    public static String getPathName() {
        System.out.print("Введите путь к каталогу: ");
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        String path = iScanner.nextLine();
        iScanner.close();
        return path;
    }

    public static List<String> fileListToArray = new ArrayList<>();

    public static void dirSructure(String path) {
        // try {
        // System.out.println(path);
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File item : files) {

            if (item.isFile()) {
                fileListToArray.add(item.getName());
            } else {
                dirSructure(item.getAbsolutePath());
                // fileListToArray.add(item.getName());//если нужны одни файлы без имен папок
            }
        }

    }

    public static void strToFile(String filesInDir) {
        try (FileWriter fw = new FileWriter("filesInDir.txt", false)) { // для перезаписи//фолс по умолчанию!
            fw.write("файлы в директории: \n");
            fw.write(filesInDir);
            // fw.close();//если в трае указываем параметр, то закрывать не обязательно
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            LOG.log(Level.INFO, "My exeption: {}", ex.getMessage());
        }
    }

}
