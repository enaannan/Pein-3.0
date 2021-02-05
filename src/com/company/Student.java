package com.company;

import java.util.*;

public class Student implements HasLevel{
    private  List<Double> grades= new ArrayList<Double>();
    private   double averageGrade;
    public Level level;
    public String studetnName;

    // constructor
    public Student(String studetnName,Level level,List <Double> grades) {
        this.grades = grades;
        this.level = level;
        this.studetnName=studetnName;
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

    @Override
    public Level getLevel() {
        return level;
    }
}
