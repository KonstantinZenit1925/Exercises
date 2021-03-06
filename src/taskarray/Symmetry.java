package taskarray;
/** Метод принимает целочисленное значение. Необходимо проверить является ли оно симметричным или нет.
Симметричным считается число которое в котором числа идущие по порядку в прямом и обратном порядке
равны друг другу.
Для решения можете преобразовать число в строку.
Проходите по полученной строке в цикле, до середины и сравниваете символ который стоит на первой позиции
с символом на последней, второй позиции с символом на предпоследней и т.д.
Для извлечения символов используйте метод charAt(). Метод должен вернуть true, если число симметричное.
 */
public class Symmetry {
    public static boolean check(int num) {
        String str1 = Integer.toString(num);
        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
