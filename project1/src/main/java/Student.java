import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int DOB;
    private int ID;
    private String username;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();


    public Student(String name,
                   int age,
                   int DOB,
                   int ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }

    public String getUsername(){
        return (name + age);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules){
        this.modules = modules;
    }

    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
}
