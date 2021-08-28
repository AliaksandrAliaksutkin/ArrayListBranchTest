package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dzha");                            // добавление
        set.add("Mitya");
        set.add("Lazik");
        set.add("Lobzik");

        set.remove("Lobzik");                   // удаление
        System.out.println(set);

                                                    // пробегаемся по коллекции посредством forEach
        for (String s: set) {
            System.out.println(s);
        }
        System.out.println(set.size());             // размер
        System.out.println(set.isEmpty());          // пустой или нет
        System.out.println(set.contains("Ruben"));  // есть ли такой элемент
    }
}
