package taskarray;

import java.util.Arrays;

/**                    Заполнить треугольную матрицу
 * Треугольная матрица, это матрица вида:
 *1
 *2 3
 *4 5 6
 *Вам дано количество строк в результирующей матрице. Вам нужно заполнить ее.
 *
 * Например, для 1
 *{{1}}
 *Для 2
 *{
 *{1}
 *{2, 3}
 *
 * и т.д.
 */
public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int num = 1;
        int num2 = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[num];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = num2++;
            }
            num++;
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rows(3)));
    }

}