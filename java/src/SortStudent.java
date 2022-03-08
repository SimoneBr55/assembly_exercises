import java.util.ArrayList;
import classes.Student;
import java.util.List;

public class SortStudent {

    public static List<Student> filterStudentsByGrade(List<Student> l, int average) {
        List<Student> result = new ArrayList<>();
        for (Student s : l) {
            if (s.getAverage() == average) {
                result.add(s);
            }
        }
        return result;
    }
}
