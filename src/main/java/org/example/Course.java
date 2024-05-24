package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

import static org.example.util.Util.toTitleCase;

@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> students;
    private static String nextId = "" + 1;

    /**
     * Checks if the sum of weights of all assignments of that course equals to 1 (100%)
     * @return true if the sum is equal to 1
     */
    public boolean isAssignmentWeightValid(){
        int totalWeight = 0;
        for (Assignment assigment : assignments) {
            totalWeight += (int) assigment.getWeight();
            if (totalWeight == 100) {
                return true;
            }
        }
        return false;
    }

    /**
     * adds a student to the student list of the course, also add a new null element to each
     * assignment of this course, and add a new null element for the finalScores.
     * @return
     */
    public boolean registerStudent(){
        //average score for each assignment
    }
    public int[] calcStudentsAverage(){
        // average score for each student
    }

    /**
     * adds a new assignment to the course
     * @param assignmentName
     * @param weight
     * @param maxScore
     * @return the assignment with the parameters
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        int studentAmount = students.size();
        Assignment assignment = new Assignment(assignmentName, weight, maxScore, studentAmount);
        assignments.add(assignment);
    }

    public void generateScore(){

    }

    public void displayScores(){

    }

    public String toSimplifiedString(){
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                "}";
    }

    /**
     * converts course to a string that contains the id, name, credits, department,
     * assignments and registered students ID
     * @return
     */
    public String toString(){

        String studentIdNumbers = "";
        for (Student student : students) {
            String number = student.getStudentId();
            studentIdNumbers += number + ", ";

        }
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + toTitleCase(courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                ", assignments=" + assignments +
                ", registered students" + students +
                '}';

    }
}
