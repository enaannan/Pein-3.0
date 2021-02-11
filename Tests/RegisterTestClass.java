import com.company.classes.Register;
import com.company.classes.Student;
import com.company.classes.StudentNotFoundException;
import com.company.enums.Level;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RegisterTestClass {
    List<Student> studentTestList = new ArrayList<Student>();

    List<Double> grades= new ArrayList<Double>();









    @Test
    public void getStudentByNameTest() throws StudentNotFoundException {
//add grades for this test method
        grades.add(10.0);
        grades.add(50.0);
        grades.add(15.0);
        grades.add(20.0);
        grades.add(100.0);

        Student student1 = new Student(1,"Ken Kinto",Level.FOUR_HUNDRED,grades);
        Student student2 = new Student(1,"James",Level.FOUR_HUNDRED,grades);

        studentTestList.add(student1);
        studentTestList.add(student2);

        Register register = new Register(studentTestList);


       Optional<Student> optional = register.getStudentByName("James");
       Student stu = optional.get();
       System.out.println("Expecting student name but...:" + stu.getName());
       Assert.assertEquals("James",stu.getName());
       throw new StudentNotFoundException(stu.toString());
    }



@Test
    public void studentSearchByNameResultListTest(){


    grades.add(10.0);
    grades.add(50.0);
    grades.add(15.0);
    grades.add(20.0);
    grades.add(100.0);

    Student student1 = new Student(1,"Ken Kinto",Level.FOUR_HUNDRED,grades);
    Student student2 = new Student(1,"James",Level.FOUR_HUNDRED,grades);

    studentTestList.add(student1);
    studentTestList.add(student2);

    Register register = new Register(studentTestList);
List<String> namesToBeSearched = new ArrayList<String>();
    List<Student> studentsFound ;// contains a list of Students found

    namesToBeSearched.add("James");

studentsFound =  register.getStudentsByName(namesToBeSearched);

Assert.assertEquals(student2,studentsFound.get(0));

}


}
