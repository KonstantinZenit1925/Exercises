package List;

import java.util.ArrayList;

public class ArrayE {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // простой конструктор аррей лист с внутренней емкостью 10
        // В угловых скобках желательно указать тип хранимых значений. В примере выше — String.

        ArrayList<String> list1 = new ArrayList<>(list);
        // Конструктор принимает другую коллекцию, создавая новый массив с элементами переданной коллекции

        ArrayList<String> list2 = new ArrayList<>(10000);
        // В качестве параметра конструктора выступает значения начального размера внутреннего массива.

        // Методы ArrayList
        // add(E e) Добавляет новый элемент в конец списка.
        // Возвращает boolean-значение (true — успех, false — не добавлено):

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hello");
        System.out.println(list3);

        // add(int index, E element) Добавляет элемент element в позицию index.
        // При добавлении происходит сдвиг всех элементов справа от указанного индекса на 1 позицию вправо:

        ArrayList<String> list4 = new ArrayList<>();
        list3.add(0, "Sara");
        System.out.println(list3);

        // addAll(Collection <? extends E> collection) Добавление всех элементов коллекции collection
        // в список в порядке их расположения в collection.
        // addAll(int index, Collection <? extends E> collection)
        // Добавление всех элементов collection в список начиная с индекса index.
        // При этом все элементы сдвинутся вправо на количество элементов в списке collection:

        ArrayList<String> list5 = new ArrayList<>();
        list5.addAll(list3);
        System.out.println("Первое добавление: " + list5);
        list5.addAll(1, list3);
        System.out.println("Второе добавление: " + list5);

        // clear()  Удаление всех элементов из списка.
        // clone()  Возвращает объект-копию массива.

        ArrayList<String> copyOfSecondList = (ArrayList<String>) list5.clone();
        list5.clear();
        System.out.println(copyOfSecondList);

        // contains(Object o) Проверка наличие объекта в списке, возвращает boolean-значение.

        System.out.println(copyOfSecondList.contains("Bob"));
        System.out.println(copyOfSecondList.contains("Hello"));

        // forEach(Consumer<? super E> action) Обработать в цикле ArrayList можно стандартными способами,цикл for:

        for (String s: copyOfSecondList) {
            System.out.println(s);
        }

        // get(int index) Возвращает элемент, который расположен в указанной позиции списка.
        // Если index < 0 или index >= максимального количества элементов списка,
        // будет выброшено исключение IndexOutOfBoundsException. Это основной метод получения элемента из списка,
        // время извлечения элемента по индексу всегда будет одинаковым, независимо от размера ArrayList.

        System.out.println("Получение элемента по индексу, к примеру нулевой : " + copyOfSecondList.get(0));

        // indexOf(Object o)
        // Метод возвращает индекс первого вхождения элемента в списке. Если элемента не существует в списке,
        // метод вернет -1.
        copyOfSecondList.add("Garri");
        copyOfSecondList.add("Tom");
        System.out.println(copyOfSecondList);
        System.out.println("Индекс первого вхождения: " + copyOfSecondList.indexOf("Tom"));

        // remove(int index)
        // Удаление элемента в указанной позиции индекса.
        // После удаления сдвигает все элементы влево для заполнения освободившегося пространства.
        // Если index<0 или >= количество элементов списка, будет выброшено исключение
        // IndexOutOfBoundsException. В результате метод возвращает элемент, который был удален.
        //
        // remove(Object o)
        // Метод удаляет из списка переданный элемент o. Если элемент присутствует в списке,
        // он удаляется, а все элементы смещаются влево. Если элемент существует в списке и успешно удален,
        // метод возвращает true, в обратном случае — false.

        copyOfSecondList.remove(0);
        System.out.println("Удаление элемента по индексу, к примеру ноль: " + copyOfSecondList);
        copyOfSecondList.remove("Hello");
        System.out.println("Удаление объекта по элементу: " + copyOfSecondList);




        // removeAll(Collection<?> c)
        // Если необходимо удалить несколько элементов, не стоит делать это в цикле по условию:
        // гораздо удобнее и безопаснее воспользоваться методом removeAll().
        // Он принимает коллекцию элементов, которая будет удалена из списка.
        //
        // Коллекция должна содержать элементы того же типа, которые хранит целевой список.
        // В обратном случае будет выброшен ClassCastException. Метод вернет true,
        // если список был изменен в результате вызова метода.

        ArrayList<String> remList = new ArrayList<>();
        remList.add("Sara");
        remList.add("Goodbye");
        remList.add("Garri");
        remList.add("Tom");
        System.out.println("Это второй список, сделан для демонстрации метода removeAll(Collection<?> c):  " + remList);

        remList.removeAll(copyOfSecondList);
        System.out.println("Первый список: " + copyOfSecondList);
        System.out.println("Второй список, после применения к нему метода removeAll," +
                " т.е он удалил ВСЕ повторяющиеся элементы и оставил только отлиные" + remList);

        // set(int index, E element)
        // Замена элемента в указанной позиции index на переданный element.
        // Индекс также должен быть больше нуля и меньше индекса последнего элемента,
        // иначе будет выброшено исключение IndexOutOfBoundsException.

        copyOfSecondList.set(1, "Robert");
        System.out.println("Замена элемента по индексу в списке, к примеру 1 элемента: " + copyOfSecondList);

        // size()
        // Лучший способ (практически единственный) для того, чтобы узнать размер списка.

        System.out.println("Размер списка равен: " + copyOfSecondList.size());

        // toArray()
        // Превращает список в фиксированный массив. Обратите внимание,
        // что метод возвращает массив объектов (Object[]).
        // Если необходимо привести список в массив объектов определенного типа,
        // в качестве параметра в метод можно передать массив, куда будут перемещены элементы списков.

        String[] array = new String[copyOfSecondList.size()];
        System.out.println("Превращение списка в фиксированный массив: ");
        copyOfSecondList.toArray(array);
        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
