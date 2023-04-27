package Sem_02;

public class Task_02 {
    // Напишите метод, который сжимает строку.
    // Пример: вход aaaabbbcddad.
    // Выход abcd
    // charAt(i) и indefOf(s) => не найден -1
    // https://metanit.com/java/tutorial/7.1.php про строки
    public static void main(String[] args) {
        String str = "aaaabbbcddad";
        System.out.println(setString(str));
    }

    public static String setString(String str) {
        String res = "";
        res += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (res.indexOf(str.charAt(i)) == -1)
                res += str.charAt(i);
        }
        return res;
    }

}
