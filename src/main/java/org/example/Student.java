package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private ArrayList<Course> registeredCourses;
    private ArrayList<Double> finalScores;
    private static int nextId = 1;

    /**
     * registers a course,adds the course to the student's registeredCourses list,
     *adds the student to the course's registeredStudents list, appends a null
     * for the scores of each assignment of the course.
     * @param courseId
     * @return If the course is already registered, directly returns false else returns true and applies.
     */
    public static boolean registerCourse(String courseId){

    }

    /**
     * drops a course, remove the course from the student's registeredCourses list,
     * and remove the student from the course's registeredStudents list
     * @param courseId
     * @return true and removes student if the student is registered to the course and false
     * if the student was not registered to the course
     */
    public static boolean dropCourse(String courseId){

    }

    public Student(String studentName, Gender gender, Address address, Department department) {
        this.studentName = studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.studentId = 'S'+ String.valueOf(nextId);
        nextId++;
    }

    @Override
    public String toSimplifiedString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", department=" + department +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", registeredCourse=" + registeredCourses +
                '}';

    }
}
