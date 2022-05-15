package taskarray;

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