import org.example.Assignment;
import org.example.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CourseTest {
    @Test
    public void testCalcStudentAvg(){
        Course course = new Course();

        int[] expected = new int[course.getRegisteredStudents().size()];
        int[] results = course.calcStudentsAverage();

        Assertions.assertEquals(expected, results);
    }
   @Test
    public void testCalcStudentAvg2(){
        Course course = new Course();
        ArrayList<Assignment> assignments = course.getAssignments();

        int[] expected = new int[course.getRegisteredStudents().size()];
        int[] results = course.calcStudentsAverage();

        Assertions.assertEquals(expected, results);
    }
   @Test
    public void testCalcStudentAvg3(){
        Course course = new Course();

        int[] expected = new int[course.getRegisteredStudents().size()];
        int[] results = course.calcStudentsAverage();

        Assertions.assertEquals(expected, results);
    }
   @Test
    public void testCalcStudentAvg4(){
        Course course = new Course();

        int[] expected = new int[course.getRegisteredStudents().size()];
        int[] results = course.calcStudentsAverage();

        Assertions.assertEquals(expected, results);
    }

    @Test
    public void testIsAssignmentWeightValid(){
        Course course = new Course();
        Assignment assignment = new Assignment();
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();

        assignment.setWeight(0.3);
        assignment1.setWeight(0.4);
        assignment2.setWeight(0.3);

        course.getAssignments().set(0, assignment);
        course.getAssignments().set(1, assignment1);
        course.getAssignments().set(2, assignment2);

        boolean expected = true;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsAssignmentWeightValid2(){
        Course course = new Course();
        Assignment assignment = new Assignment();
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();

        assignment.setWeight(0.3);
        assignment1.setWeight(0.4);
        assignment2.setWeight(0.2);

        course.getAssignments().set(0, assignment);
        course.getAssignments().set(1, assignment1);
        course.getAssignments().set(2, assignment2);

        boolean expected = false;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsAssignmentWeightValid3(){
        Course course = new Course();
        Assignment assignment = new Assignment();
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();

        assignment.setWeight(0.4);
        assignment1.setWeight(0.4);
        assignment2.setWeight(0.3);

        course.getAssignments().set(0, assignment);
        course.getAssignments().set(1, assignment1);
        course.getAssignments().set(2, assignment2);

        boolean expected = false;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testIsAssignmentWeightValid4(){
        Course course = new Course();
        Assignment assignment = new Assignment();
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();
        Assignment assignment3 = new Assignment();

        assignment.setWeight(0.4);
        assignment1.setWeight(0.1);
        assignment2.setWeight(0.3);
        assignment3.setWeight(0.2);

        course.getAssignments().set(0, assignment);
        course.getAssignments().set(1, assignment1);
        course.getAssignments().set(2, assignment2);
        course.getAssignments().set(3, assignment3);

        boolean expected = true;
        boolean result = course.isAssignmentWeightValid();

        Assertions.assertEquals(expected, result);
    }
}

