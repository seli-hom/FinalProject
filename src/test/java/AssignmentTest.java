import org.example.Assignment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentTest {
   @Test
    public void testCalcAssignmentAvg(){
       Assignment assignment = new Assignment("Assignment 1", 50, 100, 3);

       ArrayList<Integer> scores = new ArrayList<>();
       scores.add(50);
       scores.add(63);
       scores.add(79);
       assignment.setScores(scores);
       assignment.calcAssignmentAvg();

       double expected = 64;
       double result = assignment.getAssignmentAverage();

       Assertions.assertEquals(expected, result);
   }

 @Test
    public void testCalcAssignmentAvg2(){
     Assignment assignment = new Assignment("Assignment 1", 50, 100, 3);

     ArrayList<Integer> scores = new ArrayList<>();
     scores.add(55);
     scores.add(65);
     scores.add(75);
     assignment.setScores(scores);
     assignment.calcAssignmentAvg();

     double expected = 65;
     double result = assignment.getAssignmentAverage();

     Assertions.assertEquals(expected, result);
   }

 @Test
    public void testCalcAssignmentAvg3(){
     Assignment assignment = new Assignment("Assignment 1", 50, 100, 3);

     ArrayList<Integer> scores = new ArrayList<>();
     scores.add(90);
     scores.add(80);
     scores.add(70);
     assignment.setScores(scores);
     assignment.calcAssignmentAvg();

     double expected = 80;
     double result = assignment.getAssignmentAverage();

     Assertions.assertEquals(expected, result);
   }

 @Test
    public void testCalcAssignmentAvg4(){
     Assignment assignment = new Assignment("Assignment 1", 50, 100, 2);

     ArrayList<Integer> scores = new ArrayList<>();
     scores.add(90);
     scores.add(80);
     assignment.setScores(scores);
     assignment.calcAssignmentAvg();

     double expected = 85;
     double result = assignment.getAssignmentAverage();

     Assertions.assertEquals(expected, result);
   }
}
