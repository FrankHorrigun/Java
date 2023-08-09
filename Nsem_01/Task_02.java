package Nsem_01;
//Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        iScanner.close();
        System.out.println("k = " + countPairs(iScanner, n));
    }
    
    /**
     * @apiNote
     * @param iScanner
     * @param n длина последовательности
     * @return количество положительных чисел, после которых следует отрицательное число
     */
    
    public static int countPairs(Scanner iScanner, int n) {
        int k = 0;
        int a = iScanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = iScanner.nextInt();
            if (a >= 0 && b < 0)
                k++;
            a = b;
        }
        return k;
    }
}
