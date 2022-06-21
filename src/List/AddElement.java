package List;
/**
 * необходимо реализовать метод, который добавляет элемент в список и сообщает нам удалось это или нет,
 * т.е. метод должен вернуть булево значение. Не используйте в методе то, что метод возвращает true или false.
 * Для этого на входе в метод мы копируем список в новый список, добавляем в тот список,
 * который пришел в методе и в конце сравниваем их размеры - если изменился, значит элемент добавился.
 */

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        check.add(0, str);
        return true;
    }
}
