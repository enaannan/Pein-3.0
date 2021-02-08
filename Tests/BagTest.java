import com.company.classes.Bag;
import com.company.enums.Level;
import com.company.classes.Student;
import org.junit.Test;
import java.util.ArrayList;
import java.util.*;

public class BagTest {
    @Test
     public void addToBagTest(){
        Bag bag = new Bag();

    List<Double> grades  = new ArrayList<Double>();
    grades.add(50.0);
    grades.add(60.0);
    grades.add(70.0);

    Student student = new Student(1,"Kwesi China", Level.FOUR_HUNDRED,grades);

    bag.addToBag(student);
    }
}
