package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Aliaksandr", "Aliaksutkin",1);
        Student st4 = new Student("Aliaksandr", "Aliaksutkin",1); // копия Алекса для сравнения

        Student st2 = new Student("Aliaksandr", "Dyshko",2);
        Student st5 = new Student("Aviaksandr", "Pyskol",2); // копия для сравнения

        Student st3 = new Student("Dmitri", "Yakushik",2);
        map.put(st1,5.5);
        map.put(st2,6.5);
        map.put(st3,7.5);
        System.out.println(map);

        // проверяем есть ли такой студент в нашей коллекции, результат false, несмотря на то, что st4 точная копия st1
        // проверяем через equals, результат true. Для equals они совершенно одинаковые
        // дело в том что, hashMap и hashSet используют хеширование при поиске и сравнении,
        // таким образом даже если мы ищем такой же объект (который равен по equals) все равно пока не переопределим
        // hashCode наше сравнение будет неудачным

        System.out.println(st1.equals(st4));
        System.out.println(st2.hashCode());             // вывод хешкода на экран
        System.out.println(st5.hashCode());



        // вывод хешкода на экран
//        Boolean result = map.containsKey(st4);
//        System.out.println("result = " + result);


    }

    static class Student{
        private String name;
        private String surname;
        private int course;

        public Student(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, course);
        }

 
        //своя реализации для примера

//        @Override
//        public int hashCode() {
            //return name.length() + surname.length() + course;
            // длинна имени+длинна фамилии+курс, работает, до того момента пока не произойдет совпадение
//            return name.length()*17 + surname.length()*21 + course*53;

        }


    }


}
