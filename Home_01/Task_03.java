package Home_01;

import java.util.Scanner;



public class Task_03 {
    public static void main(String[] args) {
        // Реализовать простой калькулятор (пользователь вводит 2 числа и
        // вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char !=
        // ’b’)
        System.out.println("Input any key to continue. Input b for quit");// не понимаю почему на пробел не работает
        while (chr() != 'b') {
            Double x = promt();
            Double y = promt();
            Character chr = chr();
            if (chr != '+' or chr!='-' or chr!='*' or chr!='/') {
                System.out.println("Wrong operation character");
                Character chr = chr();
            }
            else calc(x, y, chr);
        }
        // calc();
    }

    private static int userInput(String message, Scanner sc) {
        boolean flag = false;
        int result = 0;
        while (!flag) {
            System.out.print(message + ": ");
            String temp = sc.next();
            try {
                result = Integer.parseInt(temp);
                flag = true;
            } catch (NumberFormatException ex) {
                System.out.println("Wrong input, try again!");
            }
        }
        System.out.println("Correct input.");
        return result;
    

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
            case '+':
                res = x + y;
            case '-':
                res = x - y;
            case '*':
                res = x * y;
            case '/':
                res = x / y;
                // default -> System.out.println("Wrong operation character");
        }
        return res;
    }
}
