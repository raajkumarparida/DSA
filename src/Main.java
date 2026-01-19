import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

//    static class MyCompare implements Comparator<Integer> {
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return o2 - o1;
//        }
//    }

//    static class MyStringCompare implements Comparator<String> {
//        @Override
//        public int compare(String o1, String o2) {
////            return o2.length() - o1.length();
//            return o1.length() - o2.length();
//        }
//    }

    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(0);
//        list.add(20);
//        list.add(50);

//        list.remove(2);

//        list.add(1, 85);
//
//        System.out.println(list);
//
//        for (int i : list) {
//            System.out.println(i);
//        }



//        System.out.println(list.get(1));
//
//        System.out.println(list.size());
//
//        System.out.println(list.contains(20));
//        System.out.println(list.contains(22));


//        ArrayList<Integer> list = new ArrayList<>(11);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//
//        System.out.println(list.size());

//        List<String> list1 = new ArrayList<>();
//        System.out.println(list1.getClass().getName());
//
//        List<String> list2 = Arrays.asList("Ram", "Hari");
//        System.out.println(list2.getClass().getName());
//
//        String[] arr = {"A", "B", "C"};
//        List<String> list3 = Arrays.asList(arr);
//        System.out.println(arr.getClass().getName());
//        System.out.println(list3.getClass().getName());

//        List<Integer> list4 = List.of(1, 2, 3, 4);
//        list4.set(50);  // we can not set here anything

//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(2);
//        integerList.add(56);
//        integerList.add(23);
//        integerList.add(89);
//        integerList.add(63);
//        integerList.add(256);
//
//        integerList.sort(null);
//
//        System.out.println(integerList);

        // for getting index is O(1)
        // for adding, removing and iteration is O(n)


        // Comparator =====================================

//         List<String> stringList = Arrays.asList("banana", "apple", "date", "cat");
//         stringList.sort(null);
//         System.out.println(stringList);

//        List<Integer> integerList = new ArrayList<>();
//
//        integerList.add(2);
//        integerList.add(5);
//        integerList.add(9);
//        integerList.add(7);
//        integerList.add(1);
//
//        integerList.sort(new MyCompare());
//        System.out.println(integerList);

//        List<String> stringList = Arrays.asList("Raj", "Parida", "Gopal", "Dancing");
////        stringList.sort(new MyStringCompare());
//
//        stringList.sort((a, b) -> b.length() - a.length()); // using lambda method
//        System.out.println(stringList);

        List<Student> students = new ArrayList<>();

        students.add( new Student("Raja", 1.2));
        students.add(new Student("Kaja", 6.2));
        students.add(new Student("Paja", 8.2));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        students.sort((a, b) -> (int) (b.getGpa() - a.getGpa())); // here we have to cast
        System.out.println(students);

        for (Student s : students) {
            System.out.println(s.getName() + ":" + s.getGpa());
        }

    }
}

 class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}
