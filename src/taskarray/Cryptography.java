package taskarray;

/**
 * Cоздаем объект
 * Проверяем условие если входнач строка пуста
 * Проверяем условие если входная строка содержит больше 0 и не более 4 символов
 * - метод должен вернуть исходную строку.
 * С помощью цикла проходимся от 5 символа до конца строки, и
 * одновременно меняем все символы больше 5 на #
 */

public class Cryptography {
    public static String code(String s) {
        StringBuilder str1 = new StringBuilder(s);
        if (str1.length() <= 0) {
            s = "empty";
        }
        if (str1.length() <= 4 && str1.length() > 0) {
            return s;
        }
        for (int index = str1.length() - 5; index >= 0; index--) {
            str1.setCharAt(index, '#');
            s = str1.toString();
        }
        return s;
    }
}
