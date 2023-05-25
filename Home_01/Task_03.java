package Home_01;

import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class Task_03 {
    public static void main(String[] args) {
        // Реализовать простой калькулятор (пользователь вводит 2 числа и
        // вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char !=
        // ’b’)
        System.out.println("Input any key to continue. Input b for quit");// не понимаю почему на пробел не работает
        while (chr() != 'b') {
            calc();
        }
        // calc();
    }

    public static double promt() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input number: ");
        double num = Double.parseDouble(iScanner.nextLine());
        iScanner.close();
        return num;
    }

    public static Character chr() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input character: ");
        Character chr = iScanner.next().charAt(0);
        iScanner.close();
        return chr;
    }

    public static double calc(double x, double y, Character chr) {
        double res;
        switch (chr) {
            case '+': res = x + y;
            case '-': res = x - y;
            case '*': res = x * y;
            case '/': res = x / y;
            // default -> System.out.println("Wrong operation character");
        }
        return res;
    }
}
