package students.testers;

import students.classes.Student;

public class StudentTesterLastname implements StudentTester {
    @Override
    public boolean test(Student s){
        if (s.getLastname().equals("Krall")) {
            return true;
        }
        return false;
    }
}
