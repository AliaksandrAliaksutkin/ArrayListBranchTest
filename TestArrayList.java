package collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {                // только ссылочный тип (Integer, String, Double....)
        List<Integer> list = new ArrayList<>();        // начиная с java 7 тип хранимых объектов
                                                            // конвенция гласит: ссылаем list на интерфейс(List)
                                                            // справа можно не писать
        for (int i = 0; i < 100; i++) {                         // добавление с помощью цикла
            list.add(i);                                   // 100 объектов типа int
            System.out.println(list);                  // метод toString реализован, пишем таким образом
        }

            System.out.println(list.get(0));          // реализация метода вызова элемента: первый
            System.out.println(list.get(99));         // последний (в нашем случае)
            System.out.println(list.size());          // метод для получения размера листа


            // способы прохождения по list

            for (int e = 0; e < list.size(); e++) {    // метод прохождения по всем элементам
                System.out.println(list.get(e));       // вывод каждого элемента на экран метод .get
            }
            for (Integer x : list) {                   // еще один метод прохождения
                System.out.println(x);                      // с помощью foreach
            }

            list.remove(1);                      // метод удаления объекта под индексом 0 "в нашем случае"
            System.out.println(list);

            boolean remove = list.remove(list);         // проверяем удален ли list
            System.out.println(remove);
        }
    }
