package SetHashSet;

/**
 * Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
 * Метод принимает строку(на английском языке). Необходимо реализовать его так,
 * чтобы метод определил является ли входящая строка панграммой.
 * Строчные и прописные буквы являются одинаковыми символами, пробелы необходимо игнорировать.
 *
 * Напомню, что в английском алфавите 26 букв.
 */
public class Pangram {
    public static boolean checkString(String s) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!s.contains(String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
}