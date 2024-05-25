package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

import static org.example.util.Util.toTitleCase;

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
    private static int nextId = 1;

    /**
     * registers a course,adds the course to the student's registeredCourses list,
     *adds the student to the course's registeredStudents list, appends a null
     * for the scores of each assignment of the course.
     * @param course
     * @return If the course is already registered, directly returns false else returns true and applies.
     */
    public  boolean registerNewCourse(Course course){
        for (Course newCourse : registeredCourses){
            if (course.getCourseId().equals(newCourse.getCourseId())) {
                return false;
            } else {
                registeredCourses.add(course);
                course.getRegisteredStudents().add(this);
            }
        }
        return true;
    }

    /**
     * drops a course, remove the course from the student's registeredCourses list,
     * and remove the student from the course's registeredStudents list
     * @param course
     * @return true and removes student if the student is registered to the course and false
     * if the student was not registered to the course
     */
    public  boolean dropCourse(Course course) {
        for (Course existingCourse : registeredCourses) {
            if (course.getCourseId().equals(existingCourse.getCourseId())) {
                registeredCourses.remove(existingCourse);

                existingCourse.getRegisteredStudents().remove(this);

                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Student(String studentName, Gender gender, Address address, Department department) {
        this.studentName = toTitleCase(studentName;
        this.gender = gender;
        this.address = address;
        this.department = department;
        this.studentId = 'S'+ String.valueOf(nextId);
        nextId++;
    }

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
