import com.company.Lecture;
import com.company.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LectureTest {
    @Test
    public void getHighestAverageTest(){
        List<Double> grades1= new ArrayList<Double>();
        grades1.add(13.0);
        grades1.add(55.0);
        grades1.add(16.0);
        grades1.add(23.0);
        grades1.add(100.0);

        Student student1 = new Student(grades1);

        List<Double> grades2= new ArrayList<Double>();
        grades2.add(100.0);
        grades2.add(100.0);
        grades2.add(100.0);
        grades2.add(100.0);
        grades2.add(100.0);

        Student student2 = new Student(grades2);

        List<Double> grades3= new ArrayList<Double>();
        grades3.add(10.0);
        grades3.add(50.0);
        grades3.add(15.0);
        grades3.add(20.0);
        grades3.add(100.0);

        Student student3 = new Student(grades3);

       //calling the enter method in the Lecture class
        Lecture lecture = new Lecture();
       lecture.enter(student1);
       lecture.enter(student2);
       lecture.enter(student3);


        Assert.assertEquals(lecture.getHighestAverageGrade(),100,0.001);
    }
}
