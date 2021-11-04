import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(String name, String id, ArrayList<Course> courses){
        this.name = name;
        this.id = id;
        this.courses = courses;

    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
}
