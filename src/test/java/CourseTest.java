import org.example.Assignment;
import org.example.Course;
import org.example.Department;
import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CourseTest {
    @Test
    public void testCalcStudentAvg() {
        Department department = new Department("12", "CST");
        Course course = new Course("Programming", 4.0, department);
        Student student = new Student();
        Student student1 = new Student();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        course.setRegisteredStudents(students);
        ArrayList<Integer> scores = new ArrayList<>();
        Assignment assignment = new Assignment("A1", 0.3, scores);

        scores.add(50);
        scores.add(70);
        assignment.setScores(scores);

        ArrayList<Integer> scores1 = new ArrayList<>();
        Assignment assignment1 = new Assignment("A2", 0.5, scores1);

        scores1.add(70);
        scores1.add(60);
        assignment1.setScores(scores1);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        int[] expected = {60, 65};
        int[] results = course.calcStudentsAverage();

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testCalcStudentAvg2() {
        Department department = new Department("12", "CST");
        Course course = new Course("Programming", 4.0, department);
        Student student = new Student();
        Student student1 = new Student();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        course.setRegisteredStudents(students);
        ArrayList<Integer> scores = new ArrayList<>();
        Assignment assignment = new Assignment("A1", 0.3, scores);

        scores.add(90);
        scores.add(70);
        assignment.setScores(scores);

        ArrayList<Integer> scores1 = new ArrayList<>();
        Assignment assignment1 = new Assignment("A2", 0.5, scores1);

        scores1.add(60);
        scores1.add(90);
        assignment1.setScores(scores1);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        int[] expected = {75, 80};
        int[] results = course.calcStudentsAverage();

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testCalcStudentAvg3() {
        Department department = new Department("12", "CST");
        Course course = new Course("Programming", 4.0, department);
        Student student = new Student();
        Student student1 = new Student();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        course.setRegisteredStudents(students);
        ArrayList<Integer> scores = new ArrayList<>();
        Assignment assignment = new Assignment("A1", 0.3, scores);

        scores.add(60);
        scores.add(70);
        assignment.setScores(scores);

        ArrayList<Integer> scores1 = new ArrayList<>();
        Assignment assignment1 = new Assignment("A2", 0.5, scores1);

        scores1.add(70);
        scores1.add(60);
        assignment1.setScores(scores1);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        int[] expected = {65, 65};
        int[] results = course.calcStudentsAverage();

        Assertions.assertArrayEquals(expected, results);
    }

    @Test
    public void testIsAssignmentWeightValid() {
        Course course = new Course();
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(56);
        scores.add(65);
        scores.add(98);
        Assignment assignment = new Assignment("A1", 0.3, scores);
        Assignment assignment1 = new Assignment("A1", 0.4, scores);
        Assignment assignment2 = new Assignment("A1", 0.3, scores);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment2);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        boolean expected = true;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsAssignmentWeightValid2() {
        Course course = new Course();
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(56);
        scores.add(65);
        scores.add(98);
        Assignment assignment = new Assignment("A1", 0.3, scores);
        Assignment assignment1 = new Assignment("A1", 0.4, scores);
        Assignment assignment2 = new Assignment("A1", 0.2, scores);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment2);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        boolean expected = false;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsAssignmentWeightValid3() {
        Course course = new Course();
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(56);
        scores.add(65);
        scores.add(98);
        Assignment assignment = new Assignment("A1", 0.3, scores);
        Assignment assignment1 = new Assignment("A1", 0.5, scores);
        Assignment assignment2 = new Assignment("A1", 0.3, scores);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment2);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        boolean expected = false;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsAssignmentWeightValid4() {
        Course course = new Course();
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(56);
        scores.add(65);
        scores.add(98);
        Assignment assignment = new Assignment("A1", 0.2, scores);
        Assignment assignment1 = new Assignment("A1", 0.2, scores);
        Assignment assignment2 = new Assignment("A1", 0.6, scores);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment);
        assignments.add(assignment2);
        assignments.add(assignment1);
        course.setAssignments(assignments);

        boolean expected = true;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }
}
