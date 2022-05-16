package taskarray;
/**
 * Доступ к элементам массива осуществляется по индексам. Напомню, что первый элемент имеет индекс 0,
 * последний - имя_массива.length - 1. Вам необходимо реализовать метод, который принимает массив целочисленных
 * значений и возвращает сумму первого и последнего элемента в этом массиве.
 */
public class Summa {
    public static int getSum(int[] array) {
        int i = 0;
        int firstNumber = array[i];
        int EndNumber = array[array.length - 1];
        return firstNumber + EndNumber;

    }

    public static void main(String[] args) {
        int[] in = {10, 2, 3, 4, 50};
        System.out.println(getSum(in));
    }
}