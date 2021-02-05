package com.company;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        List <Double> grades= new ArrayList<Double>();
        grades.add(10.0);
        grades.add(50.0);
        grades.add(15.0);
        grades.add(20.0);
        grades.add(100.0);

        // need to add student ID
        int studentID = 1;

        Student student = new Student(studentID, grades);

        NaughtyStudent naughtyStudent = new NaughtyStudent(studentID, grades);
        System.out.println("A naughty student has an average grade of: "+ naughtyStudent.getAverageGrade());

        System.out.println("*************************************");

        System.out.println(student.getAverageGrade());
    }
}

