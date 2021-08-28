package collection;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("джа");
        list.add("прапор");
        list.add("Lazik");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }

    }

