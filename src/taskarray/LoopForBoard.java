package taskarray;
/**
 * Доступ к элементам в двумерном массиве
 * Как же получать доступ к элементам, если мы работаем с двумерным массивом? Ответ очень прост
 * - нам нужна схема двух циклов for().
 *
 * Внешний цикл проходит по рядам в массиве, а вложенный цикл for() - по элементам в каждом ряду.
 * В таком случае у нас будет 2 индекса (например i и j), и обращаться к каждому элементу мы будет с их помощью:
 *
 * имя_массива[i][j]
 *
 * Задание: класс печатает элементы массива, при этом он должен пропустить в каждом ряду первый и последний элемент.
 * Обратите внимание что массив не является квадратным.
 * Вам необходимо правильно расставить условия во вложенном цикле.
 */
public class LoopForBoard {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <array[i].length - 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
