package Sem_01;

import java.util.Arrays;

public class Task_02 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1, 1 };
        System.out.println(arr);
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Максимальное число идущих подряд единиц: %s\n", max);
    }
}

// дан массив двоичных чисел [1,1,0,1,1,1,0]. Определить количество подряд
// идущих единиц