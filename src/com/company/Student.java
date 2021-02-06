package com.company;

import java.util.*;

public class Student implements HasLevel {
    private List<Double> grades;
    private int ID; // student ID
    private double averageGrade;
    public Level level;
    public String studentName;



    // constructor


    public Student( int ID,String studentName,Level level, List <Double > grades){
        this.ID = ID;
        this.grades = grades;
        this.level = level;
        this.studentName = studentName;
    }

    @Override
    public Level getLevel () {
        return level;
    }

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