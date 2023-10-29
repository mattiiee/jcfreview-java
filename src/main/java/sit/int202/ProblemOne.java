package sit.int202;

import java.util.*;

public class ProblemOne {
    public static void main(String[] args) {
        Student s1 = new Student(1002, "Somchai", 3.50);
        Student s2 = new Student(1003, "Somchai", 3.50);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        Set<Student> studentSet = new HashSet<>(125, 0.5f);
        studentSet.add(new Student(1004, "Matt", 4.00));
        studentSet.add(new Student(1005, "Somsak", 3.01));
        studentSet.add(new Student(1006, "Somsiri", 3.01));
        studentSet.add(new Student(1007, "Morgan", 3.50));
        studentSet.add(new Student(1008, "Freeman", 3.74));
        for (Student s: studentSet) {
            System.out.println(s);
        }

        Set<Student> studentSet2 = new TreeSet<>();
        studentSet2.add(new Student(1004, "Matt", 4.00));
        studentSet2.add(new Student(1005, "Somsak", 3.01));
        studentSet2.add(new Student(1006, "Somsiri", 3.01));
        studentSet2.add(new Student(1007, "Morgan", 3.50));
        studentSet2.add(new Student(1008, "Freeman", 3.74));
        for (Student s: studentSet2) {
            System.out.println(s);
        }
        List<Student> tmp = studentSet.stream().sorted(Student.COMPARE_BY_GPAX).toList();
        System.out.println("------------");
        for (Student s: tmp) {
            System.out.println(s);
        }
    }

}
