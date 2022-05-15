package taskarray;

/**
 * Доступ к элементам массива осуществляется по индексам.
 * Напомню, что первый элемент имеет индекс 0, последний - имя_массива.length - 1.
 *
 * Вам необходимо реализовать метод, который принимает массив целочисленных значений и возвращает сумму
 * первого и последнего элемента в этом массиве.
 */
public class ArrayIndex {
    public static int getFirstElement(int[] array) {
        int rsl = array[0];
        return rsl;
    }

    public static int getLastElement(int[] array) {
        int rsl = array[array.length - 1];   // последний элемент массива ЗАПОМНИТЬ!
        return rsl;
    }
}
