package taskarray;
/**
 * Познакомимся с двумерными массивами. Это массив одномерных массивов. Создается следующим образом:
 * new тип_переменной[количество_рядов][количество_элементов_в ряду]
 * Размер всего массива, как и в случае с одномерным массивом, определяется следующим образом: имя_массива.length;
 * А что если мы хотим узнать количество элементов в любом из интересующих нас ряду -
 * тогда надо обратиться к этому ряду по индексу и вызвать у него поле length: имя_массива[номер_ряда].length;
 *
 * В задании вам необходимо реализовать 2 метода - первый возвращает размер массива,
 * второй - количество элементов в ряду, номер которого мы передаем в метод.
 */
public class Board {
    public static int getCountRow(int[][] array) {
        return array.length;
    }

    public static int getCountCellInRow(int[][] array, int row) {
        return array[row].length;
    }

    public static void main(String[] args) {
        int[][] in = {{1}, {2, 3}};
        System.out.println(getCountRow(in));
        System.out.println(getCountCellInRow(in, 1));
    }
}
