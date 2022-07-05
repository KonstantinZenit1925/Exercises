package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Cat {
    public Cat(String name) {
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        //создаем итератор
        //получаем следующий элемент
        for (Cat nextCat : cats) {//до тех пор, пока в списке есть элементы

            System.out.println(nextCat);//выводим его в консоль
        }

    }
}
