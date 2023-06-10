import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    // detectCapitalUse() tests use example strings and pass/fail criteria documented in CILabInterface.java
    // test 1 asserts successful Strings, test 2 asserts failure Strings
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse(), "Must pass");
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse(), "Must pass");
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse(), "Must pass");
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("UsAs");
        assertFalse(myString.detectCapitalUse(), "Must fail");
        myString.setString(" ");
        assertFalse(myString.detectCapitalUse(), "Must fail");
        myString.setString("GooglE");
        assertFalse(myString.detectCapitalUse(), "Must fail");
    }
}
