package com.company.classes;

import com.company.enums.Level;
import com.company.interfaces.Nameable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {
    private List<Nameable> listOfNameables ;
    private List<String> nameOfStudents = new ArrayList<String>();
    private List<Student> students = new ArrayList<Student>();
    private List<String> studentsAtThisLevel = new ArrayList<String>();
    private List<String> levelHundredStudents = new ArrayList<String>();
    private List<String> levelTwoHundredStudents = new ArrayList<String>();
    private List<String> levelThreeHundredStudents = new ArrayList<String>();
    private List<String> levelFourHundredStudents = new ArrayList<String>();
    private Map studentsInLevels= new HashMap<String,List<String>>();

    public Register(List<Nameable> listOfNameables) {
        this.listOfNameables = listOfNameables;
    }

//    method to return lists of name of all students
    public List<String> getRegister(){
        for (Student s: students) {
            nameOfStudents.add(s.studentName);
        }
        return nameOfStudents;
    }

//    method to return list of students studying at a level
    public List<String> getRegisterByLevel(Level level){
        for (Student s: students) {
            if(s.level==level){
                studentsAtThisLevel.add(s.studentName);
            }
        }
        return studentsAtThisLevel;
    }

//    method to get name of all level hundred students
    private List<String> getLevel100Students(){
        for (Student s: students) {
            if(s.level==Level.HUNDRED){
                levelHundredStudents.add(s.studentName);
            }
        }
        return levelHundredStudents;
    }

//    method to return list of students in level 200

    private List<String> getLevel200Students(){
        for (Student s: students) {
            if(s.level==Level.TWO_HUNDRED){
                levelTwoHundredStudents.add(s.studentName);
            }
        }
        return levelTwoHundredStudents;
    }

// method to return list of all level 300 students
private List<String> getLevel300Students(){
    for (Student s: students) {
        if(s.level==Level.THREE_HUNDRED){
            levelThreeHundredStudents.add(s.studentName);
        }
    }
    return levelThreeHundredStudents;
}

//method to return all level 400 hundred students
private List<String> getLevel400Students(){
    for (Student s: students) {
        if(s.level==Level.FOUR_HUNDRED){
            levelFourHundredStudents.add(s.studentName);
        }
    }
    return levelFourHundredStudents;
}

//    method to return names of students in each level
    public Map printReport(){
        studentsInLevels.put("level 100",getLevel100Students());
        studentsInLevels.put("level 200",getLevel200Students());
        studentsInLevels.put("level 300",getLevel300Students());
        studentsInLevels.put("level 400",getLevel400Students());
        return studentsInLevels;
    }

}