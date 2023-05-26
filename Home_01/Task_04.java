package Home_01;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        // *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
        // могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
        // восстановить выражение до верного равенства. Предложить хотя бы
        // одно решение или сообщить, что его нет. 24 45
        // //24 + 45 = 69 (n=4)

        System.out.print("Input q: ");
        int q = promt();
        System.out.print("Input w: ");
        int w = promt();
        System.out.print("Input sum: ");
        int sum = promt();
        System.out.printf("%d? + ?%d = %d\n", q, w, sum);
        numFinder(q, w, sum);
    }

    public static void numFinder(int q, int w, int sum) {
        for (int i = 1; i < sum-20; i++) { //2 двузначных числа дают не меньше 20. уменьшил количество итераций на 20
            int x = q * 10 + i;//работает только с двузначными числами
            int y = i * 10 + w;
            if (x + y == sum) {
                System.out.printf("? = %d\n", i);
                System.out.printf("%d + %d = %d\n", x, y, sum);
            }
        }

    }

    public static int promt() {
        Scanner iScanner = new Scanner(System.in);
        int num = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        return num;
    }
}
