package com.company;

import java.util.*;

public class Student {
    private  List<Double> grades= new ArrayList<Double>();
    private   double averageGrade;

    // constructor
    public Student(List <Double> grades) {
        this.grades = grades;
    }
    // getAverageGrade will calculate the average grade for a student
   public double getAverageGrade(){
        double sum=0;
        double avg=0;
        for (int i =0;i<grades.size();i++){

            sum += grades.get(i);
            avg = sum/grades.size();
        }
        return avg;


    }
}
