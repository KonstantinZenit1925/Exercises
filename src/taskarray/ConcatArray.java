package taskarray;

/**
 * 0.4. Размер массива
 * У массива имеется поле, которое хранит количество элементов, которое находится в нем.,
 * т.е. размер массива. Чтобы определить размер массива необходимо обратиться к этому полю следующим образом:
 * имя_массива.length;
 * Вам даны 2 массива чисел. Вам необходимо определить общий размер массива при их объединении.
 * В этом задании объединять ничего не нужно, Вам необходимо только определить общий размер результирующего массива.
 */
public class ConcatArray {
    public static int combineSize(int[] a, int[] b) {
        int [] r = new int[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length); // объединеие массивов с помощью метода
        System.arraycopy(b, 0, r, a.length, b.length);
        return r.length;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {4, 5, 6};
        System.out.println(combineSize(a, b));
    }
}
