package taskarray;

/**
 * Задан числовой массив. Необходимо написать программу, которая проверит, что массив отсортирован по возрастаню.
 * Создаем переменнуб boolean
 * Проходим циклом до последнего элемента массива, при условии что i элемент массива больше i + 1
 * сортировка не возможна, цикл завершается.
 */

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
}