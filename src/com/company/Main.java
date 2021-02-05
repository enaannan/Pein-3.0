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

        Student student = new Student(grades);

        System.out.println(student.getAverageGrade());


        BagOfStudents bagOfStudents = new BagOfStudents();
        bagOfStudents.addToBag(student);
        bagOfStudents.showElementsInBag();




    }
}

