package Sem_01;

import java.util.Scanner;

/**
 * Task_01
 */

public class Task_01 {

    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s! \n", name);
        iScanner.close();
    }
} 