package collection;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList <PersonMu> list = new LinkedList<>();

        PersonMu person1 = new PersonMu("Джа");
        PersonMu person2 = new PersonMu("Прапор");
        PersonMu person3 = new PersonMu("Лазик");

        list.add(person1);
        list.add(person2);
        list.add(person3);


        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
    public static class PersonMu{

        public PersonMu(String string) {
        }
    }
}
