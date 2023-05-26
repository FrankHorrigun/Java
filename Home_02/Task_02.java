package Home_02;

import java.util.Random;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task_02 {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Input array length: ");
    int size = Integer.parseInt(iScanner.nextLine());
    sc.close();
    Integer[] randArray = fillArray(size);
    System.out.println(randArray.toString);


    public static int[] fillArray(Integer size) {// generator
        
        Random rnd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);
        }
        return arr;
    }


    // public static void bubbleSort(Integer[] randArray) {
        
    // }

}
