package collection;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(8);
        hashSet2.add(3);

//        HashSet<Integer> union = new HashSet<>(hashSet1); // объединение hashSet1 и hashSeat2 в Union
//        union.addAll(hashSet2);
//        System.out.println(union);

//        HashSet<Integer> intersect = new HashSet<>(hashSet1); // пересечение, тоесть выводим одинаковые из 2х
//        intersect.retainAll(hashSet2);
//        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1); // разность
        subtract.removeAll(hashSet2);
        System.out.println(subtract); 
    }
}
