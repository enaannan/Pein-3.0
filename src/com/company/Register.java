package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {
    private List<Nameable> listOfNameables = new ArrayList<Nameable>();
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
            nameOfStudents.add(s.studetnName);
        }
        return nameOfStudents;
    }

//    method to return list of students studying at a level
    public List<String> getRegisterByLevel(Level level){
        for (Student s: students) {
            if(s.level==level){
                studentsAtThisLevel.add(s.studetnName);
            }
        }
        return studentsAtThisLevel;
    }

//    method to get name of all level hundred students
    private List<String> level100Students(){
        for (Student s: students) {
            if(s.level==Level.HUNDRED){
                levelHundredStudents.add(s.studetnName);
            }
        }
        return levelHundredStudents;
    }

//    method to return list of students in level 200

    private List<String> level200Students(){
        for (Student s: students) {
            if(s.level==Level.TWO_HUNDRED){
                levelTwoHundredStudents.add(s.studetnName);
            }
        }
        return levelTwoHundredStudents;
    }

// method to return list of all level 300 students
private List<String> level300Students(){
    for (Student s: students) {
        if(s.level==Level.THREE_HUNDRED){
            levelThreeHundredStudents.add(s.studetnName);
        }
    }
    return levelThreeHundredStudents;
}

//method to return all level 400 hundred students
private List<String> level400Students(){
    for (Student s: students) {
        if(s.level==Level.FOUR_HUNDRED){
            levelFourHundredStudents.add(s.studetnName);
        }
    }
    return levelFourHundredStudents;
}

//    method to return names of students in each level
    public Map printReport(){
        studentsInLevels.put("level 100",level100Students());
        studentsInLevels.put("level 200",level200Students());
        studentsInLevels.put("level 300",level300Students());
        studentsInLevels.put("level 400",level400Students());
        return studentsInLevels;
    }

}
