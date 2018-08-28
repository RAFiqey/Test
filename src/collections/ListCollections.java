package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollections {

    public static void main(String[] args){

        List<Integer> list = new ArrayList();

        list.add(2); // добавляем число по индексу 0
        list.add(5); // индекс 1
        list.add(4);
        list.add(8);
        list.add(9);

        list.remove(1); // удалить индекс 1

       System.out.println(list.get(1)); // получить число по индексу 1

        // выводим все эллементы из коллекции List
        for (int n : list){
            System.out.println(n);
        }

        //проверим пуста ли коллекция
        boolean empty = list.isEmpty();
        System.out.println(empty);

        //итератор
        Iterator<Integer> iterator = list.iterator();
        iterator.hasNext(); // проверяет следующий элемент в списке
        iterator.next(); // выводит следующий эллемент списка
        iterator.remove(); // удаляет эллемент на котором стоит указатель

    }
}
