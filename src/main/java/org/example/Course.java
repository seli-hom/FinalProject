package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.example.util.Util.toTitleCase;
@NoArgsConstructor
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
    private static int nextId = 1;

    public Course(String courseName, double credits, Department department) {
        this.courseId = "C" + String.valueOf(nextId);
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        nextId++;
    }

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
        for (int i = 0; i < assignments.size(); i++) {
            assignments.get(i).getScores().add(null);
        }
        return true;
    }

    /**
     *Calculates the averages of all the scores per student
     * @return the averages in an array.
     */
    public int[] calcStudentsAverage(){

        int[]sums = new int[registeredStudents.size()];
        for (int i = 0; i < registeredStudents.size(); i++) {
            double sum = 0;
                for (Assignment assignment : assignments) {
                sum += assignment.getScores().get(i);
                 }
                sums[i] = (int) (sum / assignments.size());
            }
        return sums;
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
        return true;
    }

    /**
     * Generates a random dcore for each student's assignment
     */
    public void generateScores(){
        Random rand = new Random();
        int[][] studentsScores = new int[assignments.size()][registeredStudents.size()];
        for (int i = 0; i < registeredStudents.size(); i++) {
            studentsScores[i][] = registeredStudents.get(i).getStudentId();
            for (int j = 0; j < assignments.size(); j++) {
                int randomSCore = rand.nextInt(1,100);
                studentsScores[i][j] = randomSCore;
            }
        }
    }

    /**
     * display names of students and their scores in the assignments as well as their final score
     */
    public void displayScores(){
        System.out.printf("Course: %s %s%n", courseName, courseId);
        System.out.print("Student ID ");
        for (Assignment assignment : assignments) {
            System.out.print(assignment.getAssignementName() + " ");
        }
        System.out.println("Final Score");

        for (int i = 0; i < registeredStudents.size(); i++) {
            System.out.print(registeredStudents.get(i).getStudentId() + " ");
            for (Assignment assignment : assignments) {
                System.out.print(assignment.getScores().get(i) + " ");
            }
            System.out.println(finalScores.get(i));
        }
}

/**
 * Creates a string that contains only the courseID, name, department and how many credits it is worth.
 * @return a simplified string
 */
public String toSimplifiedString(){
    return "Course{" +
            "courseId='" +  courseId + '\'' +
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

@Override
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
            ", registered students" + studentIdNumbers +
            '}';
    return str;
}
}
