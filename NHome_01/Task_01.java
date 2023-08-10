package NHome_01;

import java.util.Scanner;

public class Task_01 {
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countNTriangle(n));
        scanner.close();
    }

    public static int countNTriangle(int n) {
        if (n == 1)
            return 1;
        return n + countNTriangle(n - 1);
    }
}
