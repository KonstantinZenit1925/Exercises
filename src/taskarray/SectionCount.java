package taskarray;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (section <= length) {
           length = length - section;
           count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(15, 5));
    }
}
