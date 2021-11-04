import org.joda.time.*;

import java.util.ArrayList;

public class Course {
    private String name;
    // private Module[] modules;
    // private Student[] students;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private org.joda.time.DateTime startDate;
    private org.joda.time.DateTime endDate;

    public Course(String name,
                  DateTime startDate,
                  DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public void setModules(ArrayList<Module> modules){
        this.modules = modules;
    }
}
