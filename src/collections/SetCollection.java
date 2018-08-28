package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("string 1"); // Set хранит уникальное значение. Если продублировать запись - выведится только одна
        set.add("string 2");
        Iterator<String> iterator = set.iterator(); // метода list.get() нету. Надо пользоваться итератором
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // либо
        // for(String a : set){
        // System.out.println(a)
        // }


      //  set.clear();  чистит коллекцию
      //  set.addAll();  добавляет новые эллементы коллекции исключая посторяемые
      //  set.contains();  сравнивает один эллемент в коллекции
      //  set.containsAll();  сравнивает все эллементы коллекции
      //  set.isEmpty();  пустая коллекция или нет
      //  set.removeAll();  из текущей коллекции удаляет все эллементы которые мы передаем в качестве параметра
    }
}
