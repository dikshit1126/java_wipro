package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String findGrades(Student studentObject) {

        int[] marks = studentObject.getMarks();

        
        for (int mark : marks) {
            if (mark < 35) {
                studentObject.setGrade("F");
                return "F";
            }
        }

        
        int sum = 0;

        for (int mark : marks) {
            sum = sum + mark;
        }

        String grade;

        if (sum < 150) {
            grade = "C";
        }
        else if (sum < 200) {
            grade = "B";
        }
        else if (sum < 250) {
            grade = "A";
        }
        else {
            grade = "A+";
        }

        studentObject.setGrade(grade);

        return grade;
    }

    public String validate(Student s)
            throws NullNameException,
                   NullMarksArrayException,
                   NullStudentObjectException {

        
        if (s == null) {
            throw new NullStudentObjectException();
        }

        // Check whether name is null
        if (s.getName() == null) {
            throw new NullNameException();
        }

        // Check whether marks array is null
        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }
}