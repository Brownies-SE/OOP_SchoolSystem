import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {
    public static void main(String[] args) {
    Teachers kate = new Teachers(123456, "Kate", 45000);
    Teachers john = new Teachers(1234567, "John", 62000);
    Students josh = new Students(1, "Josh", 12);
    Students tj = new Students(2, "TJ", 10);

    List<Teachers> teachersList = new ArrayList<>();
    teachersList.add(kate);
    teachersList.add(john);

    List<Students> studentsList = new ArrayList<>();
    studentsList.add(josh);
    studentsList.add(tj);

    School system = new School(teachersList, studentsList);

    System.out.println(system);
    System.out.println(josh);
    }
}
