package taskarray;

import java.util.Arrays;

/**
 * Объединить строки квадратного массива
 * Дана квадратная матрица. Ваша задача объединить ее строки в один массив
 *
 * Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}
 */
public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] number = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                number[i* data.length+j] = data[i][j]; // запись значений двумерного массива в одномерный

            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(merge(input)));
    }
}
