package NSem_02;

import java.util.Scanner;

public class Task_01 {
    // возведение х в степень п
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double res = getPow(x, n);
        scanner.close();
        System.out.println(res);
    }

    private static double getPow(double x, int n) {
        double res = 1;
        if (n < 0) {
            n *= -1;
            x = 1 / x;
        }
        for (int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }
}
