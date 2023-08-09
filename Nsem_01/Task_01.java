package Nsem_01;

import java.util.Scanner;

public class Task_01 {

    // Given an integer number n, return the difference between the product of its
    // digits and the sum of its digits.

    // Example 1:

    // Input: n = 234
    // Output: 15
    // Explanation:
    // Product of digits = 2 * 3 * 4 = 24
    // Sum of digits = 2 + 3 + 4 = 9
    // Result = 24 - 9 = 15
    public static void main(String[] args) {
        Scanner iscaner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = iscaner.nextInt();
        iscaner.close();
        System.out.println("res = " + taskOneMethod(n));
    }

    /**
     * @apiNote
     * @param n входящее число
     * @return произведение разрядов минус сумма разрядов
     */
    
    public static int taskOneMethod(int n) {
        int product = n % 10;
        int sum = n % 10;
        while (n / 10 > 0) {
            n /= 10;
            product *= n % 10;
            sum += n % 10;
        }
        return product - sum;
    }

    @Override
    public String toString() {
        return "Task_01 []";
    }
}
