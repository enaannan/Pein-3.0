package com.company;

import java.util.List;

public class NaughtyStudent extends Student {

    // create naughty student constructor
    public NaughtyStudent (int ID,String name,Level level, List<Double> grades) {
        super(ID, name,level,grades);
    }




    // NaughtyStudent increase grade by 0.10
    // overridden method will multiply average grade by 10% and add result to average grade
    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() * .10 + super.getAverageGrade();
    }
}
