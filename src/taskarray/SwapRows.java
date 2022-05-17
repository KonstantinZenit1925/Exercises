package taskarray;

/**
 *                     Переставить две строки в матрице
 * Вам нужно переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк
 */
public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[]temp = data[dst];
        data[dst] = data[src];
        data[src] = temp;
    }
}
