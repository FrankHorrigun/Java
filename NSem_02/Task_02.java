package NSem_02;

public class Task_02 {
   
    public static void main(String[] args) {
        int[] arr = { 4, 5, 4, 7, 2, 25, 55, 6, 3 };
        sumOfNums(arr);
    }

    /**
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     * @param arr массив чисел
     */
    private static void sumOfNums(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] % 2 == 0 && arr[i] % 5 == 0) {
                res += arr[i];
            }
        }
        System.out.println(res);
    }
}
