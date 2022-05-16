package taskarray;
/**
 * В этом задании продолжим закреплять индексацию в массиве, а также то, что первый элемент имеет индекс 0,
 * а последний имя_массива.length - 1. Вам необходимо реализовать метод, который принимает массив целочисленных
 * значений, сравнивает между собой первый и последний элемент и возвращает максимальное из двух значений.
 */
public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        int i = 0;
        int firstNumber = array[i];
        int EndNumber = array[array.length - 1];
        return Math.max(firstNumber, EndNumber);
    }
}
