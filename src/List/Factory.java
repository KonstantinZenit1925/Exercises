package List;

import java.util.List;

/**
 * Задание: в методе вам нужно заполнить коллекцию значениями от first до fifth с помощь фабричного метода of().
 * После этого с помощью цикла for() с индексами и метода get() вывести все элементы.
 */
public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "two", "three", "fifth");
        for (int i = 0; i < list.size(); i++) {  // здесь лист сайз это максимум размер листа
            System.out.println(list.get(i));     // здесь лист через метод гет выводит все эелементы списка
        }
    }
}
