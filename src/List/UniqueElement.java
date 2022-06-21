package List;
/**
 * метод принимает список и элемент который мы ищем в списке.
 * Необходимо определить, является ли этот элемент уникальным в этом списке.
 * Для это необходимо найти первый и последний индекс вхождения элемента.
 * Если равны - значит элемент уникальный. Необходимо предусмотреть ситуацию,
 * что такого элемента нет вообще в коллекции, в этом случае также нужно вернуть false.
 */

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        if (list.contains(str)) {
            return list.indexOf(str) == list.lastIndexOf(str);
        }
        return false;
    }
}
