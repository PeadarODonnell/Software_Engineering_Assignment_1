import org.joda.time.*;

import java.util.ArrayList;
import java.util.Date;

public class MainJavaClass {
    public static void main(String args[] ){

        DateTime dt = new DateTime();
        DateTime lt = DateTime.parse("1955-01-01");
        System.out.println(lt.toString());
        System.out.println("");
        ArrayList<Course> courses = new ArrayList<Course>();
        Course co_1 = new Course("course 1", lt, lt);
        Course co_2 = new Course("course 2", lt, lt);
        courses.add(co_1);
        courses.add(co_2);


        ArrayList<Module>  modules = new ArrayList<Module>();

        Module mod1 = new Module("machine learning", "ML123", courses);
        Module mod2 = new Module("machine learning", "ML123", courses);


        modules.add(mod1);
        modules.add(mod2);



        Student stud = new Student("jimmy",
                1, 2, 3);
        stud.setCourses(courses);
        stud.setModules(modules);

        System.out.println("HELLO WORLD");
        System.out.println(stud.getUsername());
        LocalDate currentDate = LocalDate.now();
        String cd = currentDate.toString();
        System.out.println(cd);
        System.out.println(stud.getModules());

    }
}
