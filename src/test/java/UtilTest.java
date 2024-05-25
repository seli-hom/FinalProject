import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.util.Util.toTitleCase;

public class UtilTest {
    @Test
    public void testToTitleCase() {
        String strIn = "hello how are you";
        String expected = "Hello How Are You";
        String result = toTitleCase(strIn);

        Assertions.assertEquals(expected, result);
    }

      @Test
    public void testToTitleCase2() {
        String strIn = "HELLO HOW ARE YOU";
        String expected = "Hello How Are You";
        String result = toTitleCase(strIn);

        Assertions.assertEquals(expected, result);
    }
      @Test
    public void testToTitleCase3() {
        String strIn = "hello HOW arE YoU";
        String expected = "Hello How Are You";
        String result = toTitleCase(strIn);

        Assertions.assertEquals(expected, result);
    }
      @Test
    public void testToTitleCase4() {
        String strIn = "hello HOW arE YoU 123 TOdAY";
        String expected = "Hello How Are You 123 Today";
        String result = toTitleCase(strIn);

        Assertions.assertEquals(expected, result);
    }
      @Test
    public void testToTitleCase5() {
        String strIn = "";
        String expected = null;
        String result = toTitleCase(strIn);

        Assertions.assertEquals(expected, result);
    }

}
