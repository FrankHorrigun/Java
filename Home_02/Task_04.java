package Home_02;
// Возьмите код от калькулятора с прошлого урока.

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// К этому калькулятору нужно добавить логирование.

// Логи запишите в файл log.txtв формате:

// "гггг-мм-дд чч:мм User entered the first operand = {первое число}"
// "гггг-мм-дд чч:мм User entered the operation = {оператор}"
// "гггг-мм-дд чч:мм User entered the second operand = {второе число}"
// "гггг-мм-дд чч:мм Result is {результат}"
public class Task_04 {
    public static void main(String[] args) {
        int a = 3;
        char op = '+';
        int b = 7;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm ");
        String date = dtf.format(LocalDateTime.now());
        String str ="";
        int Result =0;
        switch (op) {
            case '+':
                Result = a + b;
                str = date + "User entered the first operand = " + a + '\n'
                + date + "User entered the operation = " + op + '\n'
                + date + "User entered the second operand = " + b + '\n';
                str = str + date +"Result is " + Result + '\n';
                
                break;
            case '-':
                Result = a - b;
                str = date + "User entered the first operand = " + a + '\n'
                + date + "User entered the operation = " + op + '\n'
                + date + "User entered the second operand = " + b + '\n';
                str = str + date +"Result is " + Result + '\n';
                break;
            case '*':
                Result = a * b;
                str = date + "User entered the first operand = " + a + '\n'
                + date + "User entered the operation = " + op + '\n'
                + date + "User entered the second operand = " + b + '\n';
                str = str + date +"Result is " + Result + '\n';
                break;
            case '/':
                Result = a / b;
                str = date + "User entered the first operand = " + a + '\n'
                + date + "User entered the operation = " + op + '\n'
                + date + "User entered the second operand = " + b + '\n';
                str = str + date +"Result is " + Result + '\n';
                break;
            default:
                str = "Некорректный оператор: 'оператор";
        }
        
        
        try (FileWriter fw = new FileWriter("log.txt", true);) {
            fw.write(str);
            fw.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        try (FileWriter fw = new FileWriter("log.txt", true);) {
            fw.write(str);
            fw.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
