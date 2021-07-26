import java.util.List;

public class School {
    
    private List<Teachers> teachers;
    private List<Students> students;
    

    public School( List<Teachers> teachers, List<Students> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Students student) {
        students.add(student);
    }
}
