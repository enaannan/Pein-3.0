package com.company.classes;

import com.company.interfaces.HasLevel;
import com.company.enums.Level;
import com.company.interfaces.Nameable;

import java.util.*;

public class Student implements HasLevel, Nameable {
    private List<Double> grades;
    private int ID; // student ID
    private double averageGrade;
    private Level level;
    private String studentName;



    // constructor


    public Student( int ID,String studentName,Level level, List <Double > grades){
        this.ID = ID;
        this.grades = grades;
        this.level = level;
        this.studentName = studentName;
    }

    @Override
    public Level getLevel() {
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

    @Override
    public String getName() {
        return studentName ;
    }
}