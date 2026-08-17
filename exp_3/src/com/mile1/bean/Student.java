package com.mile1.bean;

public class Student {

    private String name;
    private int[] marks;
    private String grade;

    // Default constructor
    public Student() {
    }

    // Constructor given in the question paper
    public Student(String grade, int[] marks, String name) {
        this.grade = grade;
        this.marks = marks;
        this.name = name;
    }

    // Constructor used by the sample data
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}