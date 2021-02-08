package com.company;
import com.company.classes.BagOfStudents;
import com.company.classes.NaughtyStudent;
import com.company.classes.Student;
import com.company.enums.Level;
import java.util.*;

class Main {
    public static void main(String[] args) {
        List <Double> grades= new ArrayList<Double>();
        grades.add(10.0);
        grades.add(50.0);
        grades.add(15.0);
        grades.add(20.0);
        grades.add(100.0);

        Student student1 = new Student(1,"Joe Hills", Level.HUNDRED,grades);
        Student student2 = new Student(2,"Joy Appiah",Level.TWO_HUNDRED, grades);

    // assuming Joy Appiah is the naughty student
    // assume changes in naughtyStudentGrades increases it by 10%
    List <Double> naughtyStudentGrades= new ArrayList<Double>();
    naughtyStudentGrades.add(10.0);
    naughtyStudentGrades.add(50.0);
    naughtyStudentGrades.add(15.0);
    naughtyStudentGrades.add(200.0);
    naughtyStudentGrades.add(100.0);

    NaughtyStudent naughtyStudent = new NaughtyStudent(2,"Joy Appiah",Level.TWO_HUNDRED, naughtyStudentGrades);
    System.out.println("A naughty student has an average grade of: "+ naughtyStudent.getAverageGrade());
    System.out.println("*************************************");
    System.out.println(student2.getAverageGrade());

    BagOfStudents bagOfStudents = new BagOfStudents();
    bagOfStudents.addToBag(student1);
    bagOfStudents.showElementsInBag();
    }
}

