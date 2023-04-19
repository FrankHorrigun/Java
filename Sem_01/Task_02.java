package Sem_01;

import java.util.Arrays;
import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 1, 1 };
        int[] arr = fillMass();
        // System.out.println(arr);
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

        // for (int i : arr) {
        // System.out.print(i + ", ");
        // }
        // System.out.println(String.join(" ", arr));
        System.out.printf("Максимальное число идущих подряд единиц: %s\n", max);
        maxCount(arr);
    }

    public static int[] fillMass() {// generator
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(2);
        }
        return arr;
    }

    // дан массив двоичных чисел [1,1,0,1,1,1,0]. Определить количество подряд
    // идущих единиц
    // идущих подряд элементов

    public static void maxCount(int[] arr) {
        int max = 0;
        int count = 1;
            for (int i = 0; i < arr.length-1; i++) {
               
                if (arr[i+1] == arr[i]) {
                    count++;
                    if (count > max)
                        max = count;
                }
                else count = 1;
                
            }
        System.out.println(max);    
    }
        
    

}