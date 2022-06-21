package List;
/**
 * Задание: вам необходимо реализовать метод, который будет возвращать первую строку из коллекции строк,
 * но прежде чем получить результат - необходимо проверить содержатся ли элементы в списке.
 * Если их нет - возвращаем пустую строку, иначе - первый элемент в коллекции.
 */

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.isEmpty() == false) {
            return list.get(0);
        } else {
            return "";
        }
    }
}
