import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @Test
    public void detectCapitalUseTest1() {
        // Using example strings and pass/fail criteria documented in CILabInterface.java
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse(), "Should pass");
    }
    @Test
    public void detectCapitalUseTest2() {
        fail("Not yet implemented");
    }
}
