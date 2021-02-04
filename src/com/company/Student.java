package com.company;

import java.util.*;

public class Student {
    private  List<Double> grades= new ArrayList<Double>(); //<- to this?
    private   double averageGrade;

    // constructor
    public Student(List <Double> grades) { // this is wrong// please wait
        this.grades = grades; //<-- won't this change?
    }
    // getAverageGrade will calculate the average grade for a student
    double getAverageGrade(){
        double sum=0;
        double avg=0;
        for (int i =0;i<grades.size();i++){

            sum += grades.get(i);
            avg = sum/grades.size();
        }
        return avg;


    }
}
