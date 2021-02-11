package com.company.classes;

import com.company.enums.Level;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Register {

    private List<String> nameOfStudents = new ArrayList<String>();
    private List<Student> students ; // this contains a list of students
    private List<String> studentsAtThisLevel = new ArrayList<String>();
    private List<String> levelHundredStudents = new ArrayList<String>();
    private List<String> levelTwoHundredStudents = new ArrayList<String>();
    private List<String> levelThreeHundredStudents = new ArrayList<String>();
    private List<String> levelFourHundredStudents = new ArrayList<String>();
    private Map studentsInLevels= new HashMap<String,List<String>>();
    private Map mappedStudents = new HashMap<Level,List<Student>>();
    private List<String> sortedStudents = new ArrayList<>();
    private List<Double> studentGrades = new ArrayList<Double>();

    public Register(List<? super NaughtyStudent> students) {
        this.students = (List<Student>) students;
        getStudentGrades();
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
    public Optional<Student> getStudentByName(String name){
        // check if student list is not empty
        if(!students.isEmpty()){


            for(Student s: students){


                if (name.equals(s.getName()) ) {
                    studentSearchByNameResult = Optional.of(s);
                    return studentSearchByNameResult;

                }

            }

        }

        return studentSearchByNameResult = Optional.empty();
    }


//    method to return lists of name of all students
    public List<String> getRegister(){
        for (Student s: students) {
            nameOfStudents.add(s.getName());
        }
        return nameOfStudents;
    }

//    method to return list of students studying at a level
    public Map<Level,List<Student>> getRegisterByLevel(){
        for (Student s: students) {
            if(s.getLevel() == Level.HUNDRED){
                mappedStudents.put(Level.HUNDRED,s.getName());
            }
            else if(s.getLevel() == Level.TWO_HUNDRED){
                mappedStudents.put(Level.TWO_HUNDRED,s.getName());
            }
            else if(s.getLevel()==Level.THREE_HUNDRED){
                mappedStudents.put(Level.THREE_HUNDRED,s.getName());
            }
            else if(s.getLevel()==Level.FOUR_HUNDRED){
                mappedStudents.put(Level.FOUR_HUNDRED,s.getName());
            }
            else {
                return (Map<Level, List<Student>>) mappedStudents.put(" "," ");
            }
        }
        return mappedStudents;
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
    public Map<String,List<Student>> printReport(){
        studentsInLevels.put("level 100",getLevel100Students());
        studentsInLevels.put("level 200",getLevel200Students());
        studentsInLevels.put("level 300",getLevel300Students());
        studentsInLevels.put("level 400",getLevel400Students());
        return studentsInLevels;
    }
//    sort method to return list of students base on a comparator
    public List<String> sort(Comparator<Student> s){
        Collections.sort(students,s);
        for(Student st: students){
            sortedStudents.add(st.getName());
        }
        return sortedStudents;
    }
    
    public List<Double> getStudentGrades(){
        for(Student st:students){
            for(Double sg:st.studentGrades()){
                studentGrades.add(sg);
            }
        }
        return studentGrades;
    }

//    method to get the highest grade of all students grades
    public OptionalDouble highestGrade(){
        return studentGrades
                  .stream()
                  .mapToDouble(r -> r)
                  .max();
    }

//    method to get the average of all student grades
    public double averageOfStudentGrades(){
        int size  = studentGrades.size();
       double sg = studentGrades
        .stream()
        .mapToDouble(r -> r)
        .reduce(0,(sum,el)->(sum+el)/size);
        return sg;
    }

//    method to return student scoring above 60%
    public List<DoubleStream> gradesOfStudentsScoringAbove60(){
        List<DoubleStream> streamGrades=new ArrayList<>();
                students.stream()
                        .forEach(r -> r.studentGrades());
        return streamGrades;
    }

}
