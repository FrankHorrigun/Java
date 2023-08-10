package NHome_01;

public class Task_02 {
    // Напишите функцию printPrimeNums, которая выведет на экран все простые числа в
    // промежутке от 1 до 1000, каждое на новой строке.
    public static void main(String[] args) {

        printPrimeNums();
    }

    public static void printPrimeNums() {
        System.out.println(1);
        System.out.println(2);
        for (int i = 3; i < 1000; i += 2) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
