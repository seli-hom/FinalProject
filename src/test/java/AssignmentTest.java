import org.example.Assignment;
import org.junit.jupiter.api.Test;

public class AssignmentTest {
   @Test
    public void testCalcAssignmentAvg(){
       Assignment assignment = new Assignment();
       assignment.setScores(Integer 90, 89, 71, 73, 90, 56);
       double  expected = 76;
       double result = calcAssignmentAvg(assignment);
   }

}
