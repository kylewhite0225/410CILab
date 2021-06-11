import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }


    // Empty string
    // three pass cases
    // capital in middle
    // fail cases
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("Google");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("GOOGLE");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("google");
        boolean expected = true;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("");
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("goOgle");
        boolean expected = false;
        boolean actual = myString.detectCapitalUse();
        assertEquals(expected, actual);
    }
}
