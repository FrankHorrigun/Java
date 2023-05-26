package Home_01;

import java.util.ArrayList;
import java.util.List;

public class Task_02 {
    public static void main(String[] args) {
        // Task_01 pr = new Task_01();
        int num = Task_01.promt();// чисто попробовал вызвать из другого класса. сделал копию походу
        System.out.println(getPrimes(num));// сделал не до тысячи а до num

    }

    public static List<Integer> getPrimes(int num) {
        List<Integer> primes = new ArrayList<>();
        if (num > 0) {
            primes.add(2);
            for (int i = 3; i < num; i += 2) { // проверяем на простоту перебором нечетных
                if (isPrime(i, primes)) {// доп проверка, есть ли это число уже в листе, значит уже составное
                    primes.add(i);
                }
            }
        }
        return primes;
    }

    public static boolean isPrime(int number, List<Integer> primes) {
        double sqrt = Math.sqrt(number);
        for (int n : primes) {
            if (n > sqrt) {
                return true;// число простое. саму логику оптимизации через корень не понял
            }
            if (number % n == 0) { // если число делится на число из листа, то не является простым.
                return false;
            }
        }
        return true;
    }
}
