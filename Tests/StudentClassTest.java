import com.company.enums.Level;
import com.company.classes.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StudentClassTest {

    @Test
    public void getAverageTest() {
        List<Double> grades= new ArrayList<Double>();
        grades.add(10.0);
        grades.add(50.0);
        grades.add(15.0);
        grades.add(20.0);
        grades.add(100.0);


        Student student = new Student(1,"Pimp Kinto",Level.FOUR_HUNDRED,grades);





        Assert.assertEquals(student.getAverageGrade(),39.0,0.001);
    }

}
