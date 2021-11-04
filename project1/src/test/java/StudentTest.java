import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StudentTest {
    protected String student_name;
    protected int student_num;




    @Test
    public void getUsername(){
        student_name = "jimmy";
        student_num = 3;

        System.out.println(student_name);
        String username = (student_name + student_num);
        System.out.println(username);
        System.out.println(username);
        Assertions.assertTrue(username.equals("jimmy3"));
    }
}
