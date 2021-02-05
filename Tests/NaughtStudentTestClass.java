import com.company.NaughtyStudent;
import com.company.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NaughtStudentTestClass  extends StudentClassTest {
    @Test
    public void getAverageTest() {
        List<Double> grades = new ArrayList<Double>();
        grades.add(10.0);
        grades.add(50.0);
        grades.add(15.0);
        grades.add(20.0);
        grades.add(100.0);

        int student1 = 1;
       // int naughty1 = 1;
        Student student = new Student(student1, grades);
        NaughtyStudent naughtyStudent = new NaughtyStudent(student1, grades);

       //the test below fails as it should because the average grade for student 1
        // is not the same as it should be
        // Assert.assertEquals("Testing", student.getAverageGrade(), naughtyStudent.getAverageGrade(), 0.001);
        Assert.assertNotEquals(naughtyStudent.getAverageGrade(), student.getAverageGrade());
    }
}
