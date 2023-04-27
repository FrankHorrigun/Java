package Sem_02;

public class Task_03 {
    // Напишите метод, который принимает на вход строку (StringBulder) и определяет
    // является ли строка палиндромом (возвращает boolean значение).
    // equals и StringBulder для revers
    // https://metanit.com/java/tutorial/7.3.php
    public static void main(String[] args) {
        String str = "goog";
        palindrom(str);

    }

    public static void palindrom(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        // strBuilder.append(str);
        
        strBuilder.reverse();
        
        String str2 = strBuilder.toString();
        // System.out.println(str2);
        if (str.equals(str2)) // == не работает. потому что сравнивает ссылки на переменные, а иквалз сравнивает значения
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(str);
        System.out.println(str2);

    }
}
