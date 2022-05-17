package taskarray;

/**
 * Ваша задача переставить два столбца в квадратной матрице. src, dest это индексы столбцов
 */
public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        for(int r=0; r< data.length; r++) {
            int temp = data[r][src];
            data[r][src] = data[r][dst];
            data[r][dst] = temp;
        }
    }
}
