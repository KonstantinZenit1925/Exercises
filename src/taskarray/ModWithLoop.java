package taskarray;

public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n >= d) {
            n = n - d;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(mod(8, 3));
    }
}
