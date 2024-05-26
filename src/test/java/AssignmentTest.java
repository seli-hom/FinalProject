import org.example.Assignment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignmentTest {
   @Test
    public void testCalcAssignmentAvg(){
      Assignment assignment1 = new Assignment();
      assignment1.getScores().set(0,73);
      assignment1.getScores().set(1,90);
      assignment1.getScores().set(2,68);
      assignment1.getScores().set(3,89);

      double expected = 80;
      double result = assignment1.calcAssignmentAvg();

      Assertions.assertEquals(expected, result);
   }

 @Test
    public void testCalcAssignmentAvg2(){
      Assignment assignment1 = new Assignment();
      assignment1.getScores().set(0,68);
      assignment1.getScores().set(1,68);
      assignment1.getScores().set(2,68);
      assignment1.getScores().set(3,68);

      double expected = 68;
      double result = assignment1.calcAssignmentAvg();

      Assertions.assertEquals(expected, result);
   }

 @Test
    public void testCalcAssignmentAvg3(){
      Assignment assignment1 = new Assignment();
      assignment1.getScores().set(0,73);
      assignment1.getScores().set(1,56);
      assignment1.getScores().set(2,68);
      assignment1.getScores().set(3,78);

      double expected = 68.75;
      double result = assignment1.calcAssignmentAvg();

      Assertions.assertEquals(expected, result);
   }

 @Test
    public void testCalcAssignmentAvg4(){
      Assignment assignment1 = new Assignment();
      assignment1.getScores().set(0,23);
      assignment1.getScores().set(1,90);
      assignment1.getScores().set(2,100);
      assignment1.getScores().set(3,89);

      double expected = 75.5;
      double result = assignment1.calcAssignmentAvg();

      Assertions.assertEquals(expected, result);
   }


}
