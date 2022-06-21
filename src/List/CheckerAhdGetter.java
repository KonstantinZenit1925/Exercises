package List;

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
