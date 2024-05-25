import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Address.isPostalCodeValid;

public class AdressTest {
    @Test
    public void testIsPostalCodeValid(){
    String postCode = "a1b2c3";
    boolean expected = true;
    boolean result = isPostalCodeValid(postCode);

        Assertions.assertEquals(expected, result);
    }

     @Test
    public void testIsPostalCodeValid2(){
    String postCode = "12dfr7";
    boolean expected = false;
    boolean result = isPostalCodeValid(postCode);

        Assertions.assertEquals(expected, result);
    }

     @Test
    public void testIsPostalCodeValid3(){
    String postCode = "a1b 2c3";
    boolean expected = true;
    boolean result = isPostalCodeValid(postCode);

        Assertions.assertEquals(expected, result);
    }

     @Test
    public void testIsPostalCodeValid4(){
    String postCode = "123 abc";
    boolean expected = false;
    boolean result = isPostalCodeValid(postCode);

        Assertions.assertEquals(expected, result);
    }

     @Test
    public void testIsPostalCodeValid5(){
    String postCode = "1a2b3c";
    boolean expected = false;
    boolean result = isPostalCodeValid(postCode);

        Assertions.assertEquals(expected, result);
    }

}
