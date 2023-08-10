package NHome_01;

import java.util.Scanner;

public class Task_03 {
    // Напишите класс Calculator, который будет выполнять математические операции
    // (+, -, *, /) над двумя числами и возвращать результат. В классе должен быть
    // метод calculate, который принимает оператор и значения аргументов и
    // возвращает результат вычислений.
    // При неверно переданном операторе, программа должна вывести сообщение об
    // ошибке "Некорректный оператор: 'оператор'".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input op: ");
        String str = scanner.nextLine();
        char op = str.charAt(0);
        System.out.print("input a: ");
        int a = scanner.nextInt();
        System.out.print("input b: ");
        int b = scanner.nextInt();
        System.out.println(calculate(op, a, b));
        scanner.close();

    }

    public static int calculate(char op, int a, int b) {
        int res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Wrong operation character");
                break;
        }
        return res;

    }
}
