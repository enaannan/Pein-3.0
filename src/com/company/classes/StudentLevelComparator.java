package com.company.classes;

import java.util.Comparator;

public class StudentLevelComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getLevel().compareTo(s2.getLevel());
    }
}
