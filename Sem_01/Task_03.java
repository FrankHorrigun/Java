package Sem_01;

import java.util.Arrays;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 2, 3, 3, 2, 3, 5 };
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
                
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length-i; j++) {
        //         if (arr[j] == num) {
        //             arr[j]=arr[arr.length-1-i];
        //             arr[arr.length-1-i] = num;
        //         }
        //     }
        // }
        changeArray(arr, num);    
        System.out.println(Arrays.toString(arr));
        
    }
    public static int[] changeArray(int[] arr, int num) {
        int i, temp;
        temp = 0;
        for (i =0; i<arr.length;i++)
            if (arr[i] !=num) arr[temp++]=arr[i];
        for (i =temp; i<arr.length;i++) arr[i]=num;
        return arr;
        
    }
}

// задан массив. вводим число, если в массиве есть числа, равные заданному, их
// нужно перенести в конец массива