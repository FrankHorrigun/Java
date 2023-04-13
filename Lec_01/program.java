package Lec_01;

import javax.annotation.processing.SupportedOptions;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        String s = "Hello";// инициализация переменной и присваивание
        System.out.println(s);
        float f = 123.5f;
        double pi = 3.1415;
        char ch = 123;// символьный тип данных
        System.out.println(getType(ch));
        var i = 123;//неявный тип данных
        System.out.println(Short.MAX_VALUE);//обертка. получение команд
        String z = "qwerty";
        System.out.println(z.charAt(1));//получение символа по индексу
        int a = 123;
        a = a-- - --a;// ответ 2, чо за нах Оо. префиксный инкремент имеет более высокий приоритет
        System.out.println(a);
        lib.sayHi();//используем свою библиотеку и вызываем оттуда функцию. функции могут быть вне класса
        System.out.println(factor(3));

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0)
                continue;//если условие выполняется, выполняется j++
            System.out.println(j);//выведутся только четные
        }

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int item : arr) {
            System.out.println(item);
        }


   
    }
    static double factor(int n) {//методы внутри класса
        if(n==1) return 1;
        return n*factor(n-1);
    }
    static String getType(Object o) {// статический член класса
        return o.getClass().getSimpleName();
    }
}