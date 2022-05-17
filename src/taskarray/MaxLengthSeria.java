package taskarray;

/**
 *            Максимальная длина неубывающей последовательности
 * Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m она называется неубывающей.
 * Длина последовательности это количество элементов, которые в нее входят.
 * В массиве таких последовательностей может быть несколько, вам нужно найти длину максимальной из них.
 *
 *
 */
public class MaxLengthSeria {
    public static int find(int[] array) {
        int num = 1;
        int num2 = 1;
        for (int i = 1; i < array.length; i++) {
            num = array[i - 1] <= array[i] ? ++num : 1;
            if (num > 1) {
                num2 = num;
            }
            
        }
        return num;
    }
}