package org.example;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> students;
    private static String nextId = "" + 1;

    public static boolean isAssignmentValid(){

    }
    public double calcAssignmentsAverage(){
        //average score for each assignment
    }
    public double calcStudentAverage(){
        // average score for each student
    }

}
