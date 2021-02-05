import com.company.Level;
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


        List<Double> naughtyStudentGrades = new ArrayList<Double>();
        grades.add(10.0);
        grades.add(50.0);
        grades.add(15.0);
        grades.add(200.0);
        grades.add(100.0);


        Student student = new Student(1,"Kelvin Morrison", Level.TWO_HUNDRED, grades);
        NaughtyStudent naughtyStudent = new NaughtyStudent(1,"Kelvin Morrison",Level.TWO_HUNDRED, naughtyStudentGrades);

       //the test below passes as it should because the average grade for student 1
        // is not the same as it should be
        // Assert.assertEquals("Testing", student.getAverageGrade(), naughtyStudent.getAverageGrade(), 0.001);
        Assert.assertNotEquals(naughtyStudent.getAverageGrade(), student.getAverageGrade());
    }
}
