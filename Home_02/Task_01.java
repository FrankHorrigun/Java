package Home_02;
// Дана строка sql-запроса:

import java.util.Arrays;

// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

// Пример:

// {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
// Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

// String QUERY - начало SQL-запроса
// String PARAMS - JSON с параметрами
// Ожидаемый ответ:

// select * from students where name='Ivanov' and country='Russia' and city='Moscow'

public class Task_01 {
    public static void main(String[] args) {
        String  QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        StringBuilder temp = new StringBuilder();
        String str = PARAMS.replace("{", "").
                replace("}", "").
                replaceAll("\"", "").
                replaceAll(",", ", and").
                replaceAll(":", "='");
        // System.out.println(str);
        String[] elements = str.split(",");
        System.out.println(Arrays.toString(elements));
        temp.append(QUERY);
        for (String element : elements) {
            if (!element.contains("null")) {
                temp.append(element).append("'");
            }
        }
        // return temp;
        System.out.println(temp.toString());
        

    }

    
     
    
}
