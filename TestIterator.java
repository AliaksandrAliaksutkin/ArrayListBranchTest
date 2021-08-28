package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }
    }
}
