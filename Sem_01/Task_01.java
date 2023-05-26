package Sem_01;

// import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 * Task_01
 */

public class Task_01 {

    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner=new Scanner(System.in, encoding);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s! \n", name);
        iScanner.close();
        vremya(name);
        // System.out.printf("%s %s!", greeting, name);

    }
    public static void vremya(String name) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        if (time.isAfter(LocalTime.of(5, 0)) && time.isBefore(LocalTime.of(11, 59)))
            System.out.printf("Good morning, %s", name);
        else if (time.isAfter(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(17, 59)))
            System.out.printf("Good afternoon, %s", name);
        else if (time.isAfter(LocalTime.of(18, 0)) && time.isBefore(LocalTime.of(22, 59)))
            System.out.printf("Good evening, %s", name);
        else System.out.printf("Good night, %s", name);
    }
} 