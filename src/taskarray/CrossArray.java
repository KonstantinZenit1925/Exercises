package taskarray;

/**
 * Заданы два числовых массива.Нужно вывести на консоль числа, которые есть одновременно в первом и втором массиве.
 * Проходим с помощью цикла фоич по правому и левому массиву, и сравниваем элементы массивов.
 */
public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i: left) {
            for (int j: right) {
                if (i == j) {
                    System.out.println(i);
                }
            }
            
        }
    }
}
