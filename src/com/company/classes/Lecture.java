package com.company.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
  private List<Student> studentsEntered = new ArrayList<Student>(); //contains list of all students that entered
  private List<Double> listOfAverageGrades = new ArrayList<Double>();   //this contains list of all average grades of students that entered

  public void enter(Student student){
        if(student !=null){
            //check if the student is not null before adding the student to the entered list
            studentsEntered.add(student);
        }
    }

  private  void  addAverageGrades(){
        if(!studentsEntered.isEmpty()){
            for(int i=0; i< studentsEntered.size();i++){
                listOfAverageGrades.add(studentsEntered.get(i).getAverageGrade());
            }
        }
   }

  public double getHighestAverageGrade(){
      double highestAverage;
      addAverageGrades();
      highestAverage=Collections.max(listOfAverageGrades);
      return highestAverage;
  }
}
