package students;

import java.util.ArrayList;
import students.classes.Student;
import students.testers.StudentTester;

import java.util.List;

public class SortStudent {

    /*
    public static List<Student> filterStudentsByGrade(List<Student> l, int average) {
        List<Student> result = new ArrayList<>();
        for (Student s : l) {
            if (s.getAverage() == average) {
                result.add(s);
            }
        }
        return result;
    }
    public static List<Student> filterStudentsByGradeRange(List<Student> l, int average, int range) {
        List<Student> result = new ArrayList<>();
        for (Student s : l) {
            if (average - range < s.getAverage() && s.getAverage() < (average + range)){
                result.add(s);
            }
        }
        return result;
    }

    public static List<Student> filterStudentsByLastname(List<Student> l, String lastname){
        List<Student> result = new ArrayList<>();
        for (Student s : l) {
            if (s.getLastname().equals(lastname)){
                result.add(s);
            }
        }
        return result;
    }
     */

    // UP you have the long and ugly way of doing what we can do quickly below
    public static List<Student> filterStudents(List<Student> l, StudentTester tester) {
        List<Student> result = new ArrayList<>();
        for (Student s : l) {
            if (tester.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
    // and then specify 'tester' when we need that.

    public static void main(String[] args) {
        List<Student> result;
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 24));
        students.add(new Student("Dimebag", "Darrell", 25));
        students.add(new Student("Eric", "Baret", 28));
        students.add(new Student("Tyler", "Durden", 20));
        students.add(new Student("Diana", "Krall", 27));
        students.add(new Student("Jack", "Napier", 22));
        students.add(new Student("Rosa", "Luxemburg", 30));
        /*
        result=filterStudentsByGrade(students, 24);
        System.out.println("filterStudentsByGrade()...");
        System.out.println(result);
        result=filterStudentsByGradeRange(students, 24,2);
        System.out.println("filterStudentsByGradeRange()...");
        System.out.println(result);
        result=filterStudentsByLastname(students, "Doe");
        System.out.println("filterStudentsByLastname()...");
        System.out.println(result);*/

        /*
        // we are using an anonymous function to specify directly here the functions belonging
        // to an interface that provides the conditions, without having tons of classes and functions.
        result = filterStudents(students, new StudentTester() {
            @Override
            public boolean test(Student s) {
                return s.getLastname().equals("Krall");
            }
        });
        */

        // OR we can use a lambda function
        // it is basically an anonymous implementation of an interface with only a single method
        result = filterStudents(students, s -> s.getAverage() < 24 || s.getAverage() > 28);

        System.out.println("FilterStudents()...");
        System.out.println(result);
    }
}
