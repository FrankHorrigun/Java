package Sem_02;

import java.util.Scanner;

public class Task_01 {
    // Дано целое число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из
    // чередующихся символов c1 и c2, начиная с c1.
    // N=5
    // c1=”Oleg”
    // c2=”Vasya”
    // res = “OlegVasyaOlegVasyaOleg”
    /**
     * @param args
     */
    public static void main(String[] args) {
        int N = promt();
        System.out.println(stringConk(N));
    }

    public static String stringConk(int N) {
        String c1 = "Oleg";
        String c2 = "Vasya";
        String res = "";
        for (int i = 0; i < N; i++) {
            // if (i % 2 == 0)
            //     res += c1;
            // else
            //     res += c2;
            res += i % 2 == 0 ? c1 : c2; // так можно записать без ифа тернальный оператор
        }
        return res;
    }

    public static int promt() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input number: ");
        Integer num = iScanner.nextInt();
        iScanner.close();
        return num;
    }
}
