import com.company.Student;
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

        Student student = new Student(grades);

        Assert.assertEquals(student.getAverageGrade(),39.0,0.001);
    }

}
