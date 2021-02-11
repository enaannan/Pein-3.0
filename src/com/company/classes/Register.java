package com.company.classes;

import com.company.enums.Level;
import com.company.interfaces.Nameable;

import javax.swing.text.html.Option;
import java.util.*;

public class Register {

    private List<String> nameOfStudents = new ArrayList<String>();
    private List<Student> students ; // this contains a list of students
    private List<String> studentsAtThisLevel = new ArrayList<String>();
    private List<String> levelHundredStudents = new ArrayList<String>();
    private List<String> levelTwoHundredStudents = new ArrayList<String>();
    private List<String> levelThreeHundredStudents = new ArrayList<String>();
    private List<String> levelFourHundredStudents = new ArrayList<String>();
    private Map studentsInLevels= new HashMap<String,List<String>>();

    public Register(List<Student> students) {
        this.students = students;
    }

    private Optional<Student> studentSearchByNameResult; // Contains the result of a search by student name
    private List<Student> studentSearchByNameResultList=new ArrayList<Student>(); // contains a list of students found by search with a list of names

    //function to get a student by name. It takes a list on names
    public  List<Student> getStudentsByName (List<String> listOfNames){
        if(!students.isEmpty()){
            for(String name: listOfNames){

                for(Student s:students){
                    if (name.equals(s.getName())){
                        // name match found
                        studentSearchByNameResultList.add(s);
                    }
                }
            }
        }


        return studentSearchByNameResultList ;
    }


    // function to get a student by name. Returns the first occurrence of the name
    public Optional<Student> getStudentByName(String name) throws StudentNotFoundException{
        // check if student list is not empty
        try{
            if(!students.isEmpty()){// check for not empty
                for(Student s: students){ // loop through student list object
                    if (name.equals(s.getName()) ) { // for each student, check for equal name
                        studentSearchByNameResult = Optional.of(s); //
                        return studentSearchByNameResult;
                    }
                }
                throw new StudentNotFoundException(name +" not found");
            }

        } catch (StudentNotFoundException studentNotFoundException){
            System.err.println(studentNotFoundException.getMessage());
        }

        return studentSearchByNameResult = Optional.empty();
        //return studentSearchByNameResult;
    }


    //    method to return lists of name of all students
    public List<String> getRegister(){
        for (Student s: students) {
            nameOfStudents.add(s.getName());
        }
        return nameOfStudents;
    }

    //    method to return list of students studying at a level
    public List<String> getRegisterByLevel(Level level){
        for (Student s: students) {
            if(s.getLevel() == level){
                studentsAtThisLevel.add(s.getName());
            }
        }
        return studentsAtThisLevel;
    }

    //    method to get name of all level hundred students
    private List<String> getLevel100Students(){
        for (Student s: students) {
            if(s.getLevel()==Level.HUNDRED){
                levelHundredStudents.add(s.getName());
            }
        }
        return levelHundredStudents;
    }

//    method to return list of students in level 200

    private List<String> getLevel200Students(){
        for (Student s: students) {
            if(s.getLevel()==Level.TWO_HUNDRED){
                levelTwoHundredStudents.add(s.getName());
            }
        }
        return levelTwoHundredStudents;
    }

    // method to return list of all level 300 students
    private List<String> getLevel300Students(){
        for (Student s: students) {
            if(s.getLevel()==Level.THREE_HUNDRED){
                levelThreeHundredStudents.add(s.getName());
            }
        }
        return levelThreeHundredStudents;
    }

    //method to return all level 400 hundred students
    private List<String> getLevel400Students(){
        for (Student s: students) {
            if(s.getLevel()==Level.FOUR_HUNDRED){
                levelFourHundredStudents.add(s.getName());
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
