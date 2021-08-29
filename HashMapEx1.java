package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(100200300,"Aliaksutkin");              // добавление элементов в Мар

        map1.putIfAbsent(200200300,"Dishko");           // элемент добавлен, т.к. ключ уникален
        map1.putIfAbsent(400200300,"Ivanov");           // элемент не добавлен, т.тк ключ=Lazovski


        map1.put(300200301,"Yakushik");                 // пример элементов с одинаковым ключем, в итоге
        map1.put(300200301,"Huyushik");                 // ключ остался, а значение стало Huyushik!!!!

        map1.put(400200300,"Lazovskii");
        map1.put(500200300,"Lazovskii");                // пример элементов с одинаковым значением

        map1.put(null,"Zarubin");                       // пример c ключом null

        map1.put(100000001,null);                       //пример со значением null

        System.out.println(map1);

        System.out.println(map1.get(400200300));        //вывод на экран по значению ключа

        map1.remove(100000000);
        System.out.println(map1);                       //удаление элемента по значению ключа

        System.out.println(map1.containsValue("Zarubin")); //поиск элемента по значению, возвращает true/false
        System.out.println(map1.containsKey(100000001)); //поиск элемента по ключу, возвращает true/false
        System.out.println(map1.keySet());                  // возвращает множество ключей нашей коллекции
        System.out.println(map1.values());                  // возвращает множество значений нашей коллекции


        Map <String,String> map2 = new HashMap<>();            // пример Мар с одинаковыми типами
        map2.put("Zarubin", "Blue");                            // в качестве ключ/значение
        map2.put("Yakushik","Purple");

    }

}
