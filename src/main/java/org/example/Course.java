package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

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
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
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
    public boolean registerStudent(Student student){
        registeredStudents.add(student);
        finalScores.add(null);
        assignments.getScores().add(null);
    }
    public int[] calcStudentsAverage(){
        for (Student student : registeredStudents) {

        }
    }

    /**
     * adds a new assignment to the course
     * @param assignmentName
     * @param weight
     * @param maxScore
     * @return the assignment with the parameters
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        int studentAmount = registeredStudents.size();
        Assignment assignment = new Assignment(assignmentName, weight, maxScore, studentAmount);
        assignments.add(assignment);
    }

    public void generateScore(){
        Random rand = new Random();


    }

    public void displayScores(){
        int rows = assignments.size() + 2;
        int columns = getAssignments().getScores().lenght;
        int[][] scoreTable = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            scoreTable[i] = registeredStudents.getStudentName();
            for (int j = 0; j < columns; j++) {
                scoreTable[i][j] = assignments.getScore();
            }
        }
    }

    public String toSimplifiedString(){
        return "Course{" +
                "courseId='" + 'C' + courseId + '\'' +
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
        for (Student student : registeredStudents) {
            String number = student.getStudentId();
            studentIdNumbers += number + ", ";

        }
        String str = "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + (toTitleCase(courseName)) + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                ", assignments=" + assignments +
                ", registered students" + registeredStudents +
                '}';
               return str;
    }
}
