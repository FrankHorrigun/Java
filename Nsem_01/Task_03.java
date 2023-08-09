package Nsem_01;

import java.util.Scanner;

// Дана строка. Поменять местами ее половины.

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(repStr(str));
    }

    public static String repStr(String str) {
        return str.substring(str.length() / 2) + str.substring(0, str.length() / 2);
    }
}
