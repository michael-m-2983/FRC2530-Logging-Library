package frc.logging;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test 
    public void noOutputTest() {
        try {
            FRCLogger logger = new DefaultFRCLogger("", false, false);

            // This should throw an IllegalStateException
            logger.setup();

            assertTrue(false);
        } catch(IllegalStateException exception) {
        }
    }
}
