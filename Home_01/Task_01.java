package Home_01;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        int num = promt();
        System.out.printf("Сумма чисел равна %d \n", sumNumbers(num));
        System.out.printf("Произведение чисел равно %d \n", compNumbers(num));
    }
    
    public static int promt() {
        System.out.print("Input n: ");
        Scanner iScanner = new Scanner(System.in);
        int num = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        return num;
    }
        
    //Вычислить n-ое треугольного число(сумма чисел от 1 до n)
    public static int sumNumbers(int n) {
        if (n == 1) return 1;
        return n + sumNumbers(n - 1);
    }
    // n! (произведение чисел от 1 до n)

    public static int compNumbers(int n) {
        if (n == 1) return 1;
        return n * compNumbers(n - 1);
    }
}
