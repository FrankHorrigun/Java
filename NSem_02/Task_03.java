package NSem_02;

public class Task_03 {
   
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 16, 5, 15, 30 };
        sumOfPairs(arr);
    }

    /**
     * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     * @param arr
     */
    private static void sumOfPairs(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] * 2) {
                res++;
            }
        }
        System.out.println(res);
    }
}
