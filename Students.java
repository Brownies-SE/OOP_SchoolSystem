public class Students {
    
    private int id;
    private String name;
    private int grade;

    public Students(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int getGrade() {
        return grade;
    }
    public String toString() {
        return name + grade;
    }
}
