package List;
/**
 * default boolean removeIf​(Predicate<? super E> filter)
 * - метод удаляет все элементы из коллекции, которые удовлетворяют условию определенному
 * в предикате filter(передается в виде лямбда выражения). Если в результате работы метода список изменился
 * - метод возвращает true.
 * Задание: необходимо реализовать метод,
 * который вернет список строк, которые состоят из 5 и более символов.
 */

import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(n -> (n.length() < 5));
        return list;
    }
}
