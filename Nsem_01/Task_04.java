package Nsem_01;

public class Task_04 {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 2, 3 };
        System.out.println(isSimm(arr));
    }

    /**
     * @apiNote // Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param arr дан массив
     * @return да/нет
     */

    public static boolean isSimm(int[] arr) {// ctrl+shft+R refactoring to metod
        Boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}
